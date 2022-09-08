package com.jihen.voiture;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import com.jihen.voiture.service.VoitureService;

@SpringBootApplication
public class VoitureApplication  {
	@Autowired
VoitureService voitureService;
	public static void main(String[] args) {
		SpringApplication.run(VoitureApplication.class, args);
	}

	

}
