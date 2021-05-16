package com.academy.exotica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.academy.client")
@ComponentScan("com.academy.exotica")
public class ExoticaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExoticaApplication.class, args);
	}

}
