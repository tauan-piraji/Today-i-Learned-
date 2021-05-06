package com.TauanOliveira.cursoMC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.TauanOliveira.cursoMC.domain.Categoria;
import com.TauanOliveira.cursoMC.repositories.CategoriaRepository;

@SpringBootApplication
public class CursoMcApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursoMcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritótio");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
	}

}