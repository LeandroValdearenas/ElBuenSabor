package com.example.imagenes_microservicio;

import com.example.imagenes_microservicio.repositories.ImagenRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImagenesMicroservicioApplication {
	private static final Logger logger = LoggerFactory.getLogger(ImagenesMicroservicioApplication.class);

	@Autowired
	private ImagenRepository imagenRepository;

	public static void main(String[] args) {
		SpringApplication.run(ImagenesMicroservicioApplication.class, args);
		logger.info("En ejecución");
	}
}

