package com.example.imagenes_microservicio.service;

import com.example.imagenes_microservicio.domain.entities.Imagen;
import com.example.imagenes_microservicio.repositories.ImagenRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
public class ImagenServiceImpl implements ImagenService {

    private ImagenRepository imagenRepository;
    public ImagenServiceImpl(ImagenRepository imagenRepository) {
        this.imagenRepository = imagenRepository;
    }

    @Override
    @Transactional
    public List<Imagen> findAll() throws Exception {
        try {
            return imagenRepository.findAll();
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public Imagen buscarImagen(String nombre) throws Exception {
        try {
            Optional<Imagen> entityOptional = imagenRepository.buscarImagen(nombre);
            if (entityOptional.isPresent()) {
                return entityOptional.get();
            }else {
                throw new Exception("No existe la entidad");
            }
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Imagen save(Imagen entity) throws Exception {
        try {
            entity = imagenRepository.save(entity);
            return entity;
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public boolean delete(String url) throws Exception {
        try {
            Optional<Imagen> entityOptional = imagenRepository.buscarImagen(url);
            if (entityOptional.isPresent()) {
                imagenRepository.delete(entityOptional.get());
                return true;
            }else {
                throw new Exception("No existe la entidad");
            }
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
