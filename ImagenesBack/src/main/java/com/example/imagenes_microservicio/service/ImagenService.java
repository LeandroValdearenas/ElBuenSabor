package com.example.imagenes_microservicio.service;


import com.example.imagenes_microservicio.domain.entities.Imagen;

import java.util.List;

public interface ImagenService {
    List<Imagen> findAll() throws Exception;
    Imagen save(Imagen entity) throws Exception;
    boolean delete(String url) throws Exception;
    public Imagen buscarImagen(String nombre) throws Exception;
}
