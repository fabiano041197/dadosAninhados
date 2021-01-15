package com.example.demo.controller;

import org.springframework.data.domain.Pageable;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Categoria;
import com.example.demo.model.Produto;
import com.example.demo.repository.CategoriaRepository;
import com.sipios.springsearch.anotation.SearchSpec;

@RestController
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping("/categoria")
	public Page<Categoria> getCategorias(Pageable pageable, @SearchSpec Specification<Categoria> specs){
		return categoriaRepository.findAll(Specification.where(specs),pageable);
	}


	@PostMapping("/categoria")
	public Categoria createCategoria(@Valid @RequestBody Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
	
}
