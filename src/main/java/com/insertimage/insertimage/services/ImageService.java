package com.insertimage.insertimage.services;

import com.insertimage.insertimage.models.ImageEntity;
import com.insertimage.insertimage.repositories.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Base64;

@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;

    public void saveImage(MultipartFile file) {
        try {
            String encodedString = Base64.getEncoder().encodeToString(file.getBytes());
            ImageEntity img = new ImageEntity();
            img.setName(file.getOriginalFilename());
            img.setBase64(encodedString);
            imageRepository.save(img);
        } catch (Exception e) {
            throw new RuntimeException("Error saving the image: " + e.getMessage());
        }
    }



    public File getImageByIdAndSave(Long id, String directory) throws IOException {
        ImageEntity imageEntity = imageRepository.findById(id).orElseThrow(() -> new RuntimeException("Image not found"));

        byte[] decodedBytes = Base64.getDecoder().decode(imageEntity.getBase64());

        // Comprobar y crear el directorio si no existe
        File dir = new File(directory);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        File outputImageFile = new File(directory + File.separator + imageEntity.getName());
        Files.write(outputImageFile.toPath(), decodedBytes);

        return outputImageFile;
    }
}


