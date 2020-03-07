package com.emanuelcmesquita.dev.weblab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.emanuelcmesquita.dev"})
public class WeblabApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeblabApplication.class, args);
	}

}
