package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Categoria;

@RepositoryRestResource
public interface CategoriaRepository  extends JpaRepository<Categoria, Long>, JpaSpecificationExecutor<Categoria>{

}

