package com.insertimage.insertimage.controller;

import com.insertimage.insertimage.models.ImageEntity;
import com.insertimage.insertimage.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@RestController
@RequestMapping("/images")
public class ImageController {

    @Autowired
    private ImageService imageService;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {
        try {
            imageService.saveImage(file);
            return ResponseEntity.ok("Image saved successfully!");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error saving the image: " + e.getMessage());
        }
    }

    @GetMapping("/download/{id}")
    public ResponseEntity<String> downloadImageById(@PathVariable Long id) {
        String directory = System.getProperty("user.dir") + File.separator + "downloadedImages";

        try {
            File savedImage = imageService.getImageByIdAndSave(id, directory);
            return ResponseEntity.ok("Image saved to: " + savedImage.getAbsolutePath());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error processing image: " + e.getMessage());
        }
    }
}

