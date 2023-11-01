package com.insertimage.insertimage.repositories;

import com.insertimage.insertimage.models.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<ImageEntity, Long> {
}
