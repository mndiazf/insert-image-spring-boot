package com.insertimage.insertimage.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ImageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(columnDefinition = "TEXT")
    @Lob
    private String Base64;
}
