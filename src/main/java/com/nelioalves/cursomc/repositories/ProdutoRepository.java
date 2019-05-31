package com.nelioalves.cursomc.repositories;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.domain.Produto;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

    Page<Produto> search(String nome, List<Categoria> categorias, Pageable pageRequest);
    
}