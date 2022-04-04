package com.springboot.bs4perfiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Bs4PerfilesApplication {

	public static void main(String[] args) {

		SpringApplication.run(Bs4PerfilesApplication.class, args);
		Configuracion c = new Configuracion();
		System.out.println(c.getValor1()+"\n"+c.getValor2());
	}

}
