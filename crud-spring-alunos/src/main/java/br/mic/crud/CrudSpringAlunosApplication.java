package br.mic.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"br.mic.crud.model"})
public class CrudSpringAlunosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringAlunosApplication.class, args);
	}

}
