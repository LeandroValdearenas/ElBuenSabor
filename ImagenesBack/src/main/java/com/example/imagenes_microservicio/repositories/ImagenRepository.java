package com.example.imagenes_microservicio.repositories;

import com.example.imagenes_microservicio.domain.entities.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ImagenRepository extends JpaRepository<Imagen, String> {
    @Query(value = "select i from Imagen i where i.url LIKE ?1")
    public Optional<Imagen> buscarImagen(String nombre);
}
