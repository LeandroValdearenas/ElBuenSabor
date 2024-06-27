package com.example.imagenes_microservicio.controller;

import com.example.imagenes_microservicio.domain.entities.Imagen;
import com.example.imagenes_microservicio.service.ImagenServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/imagenes")
public class ImagenController {

    private ImagenServiceImpl service;
    public ImagenController(ImagenServiceImpl service) {
        this.service = service;
    }

    @GetMapping("")
    public ResponseEntity<?> getAll(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }

    @GetMapping("/url/{nombre}")
    public ResponseEntity<byte[]> descargarImagen(@PathVariable String nombre) {
        Imagen imagen = null;
        String tipoContenido;
        byte[] datos = null;
        try {
            imagen = service.buscarImagen(nombre);
            tipoContenido = imagen.getImageData().split(";")[0].split(":")[1];
            String dato = imagen.getImageData().split(",")[1];
            datos = Base64.getDecoder().decode(dato);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if (imagen != null) {
            return ResponseEntity.ok()
                    .contentType(MediaType.valueOf(tipoContenido))
                    .body(datos);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Imagen imagen){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.save(imagen));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }

    @DeleteMapping("{url}")
    public ResponseEntity<?> delete(@PathVariable String url){
        try {
            service.delete(url);
            return ResponseEntity.status(HttpStatus.OK).body("{\"mensaje\":\"Eliminado Correctamente\"}");
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }
}

