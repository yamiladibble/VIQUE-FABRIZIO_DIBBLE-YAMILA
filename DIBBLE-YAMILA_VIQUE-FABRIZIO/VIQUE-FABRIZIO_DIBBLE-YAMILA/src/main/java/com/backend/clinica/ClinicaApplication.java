package com.backend.clinica;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.logging.Logger;

@SpringBootApplication
public class ClinicaApplication {

	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(ClinicaApplication.class);

	public static void main(String[] args)
	{
		SpringApplication.run(ClinicaApplication.class, args);
		LOGGER.info("ClinicaOdontologica is now running...");
	}

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

}
