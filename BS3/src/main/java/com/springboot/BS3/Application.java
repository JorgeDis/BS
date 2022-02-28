package com.springboot.BS3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	@PostConstruct
		public void llamada(){
		System.out.println("Hola desde clase inicial");
	}

	@Bean
	CommandLineRunner ejecutame1(){
	return p->{
		System.out.println("Hola desde la clase secundaria");
	};
	}

	@Bean
	CommandLineRunner ejecutame2(){

		return p->{
			System.out.println("Soy la tercera clase");
		};
	}
}

