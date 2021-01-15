package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Produto;

@RepositoryRestResource
public interface ProdutoRepository  extends JpaRepository<Produto, Long>, JpaSpecificationExecutor<Produto>{

}

