package com.example.imagenes_microservicio.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Builder
public class Imagen {

    @Id
    private String url;
    @Column(columnDefinition = "TEXT")
    private String imageData;
}
