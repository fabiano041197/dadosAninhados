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

import com.example.demo.model.Produto;
import com.example.demo.repository.ProdutoRepository;
import com.sipios.springsearch.anotation.SearchSpec;

@RestController
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping("/produto")
	public Page<Produto> getProdutos(Pageable pageable, @SearchSpec Specification<Produto> specs){
		return produtoRepository.findAll(Specification.where(specs),pageable);
	}
	
	@PostMapping("/produto")
	public Produto cadastraProduto(@Valid @RequestBody Produto request) {
		return produtoRepository.save(request);
	}
	

}
