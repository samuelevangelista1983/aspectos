package com.sen.aspectos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AspectosApplication implements CommandLineRunner {

	@Marcacao
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Executando o método run");
	}

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(AspectosApplication.class);
		app.run(args);
		System.out.println("Finalizando aplicação");
		System.exit(0);

	}

}
