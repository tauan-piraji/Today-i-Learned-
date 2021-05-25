package com.TauanOliveira.cursoMC.repositories;

import java.util.List;

import com.TauanOliveira.cursoMC.domain.Categoria;
import com.TauanOliveira.cursoMC.domain.Produto;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

    @Query("SELECT DISC obj FROM Produto obj INNER JOINS obj.categorias cat WHERE obj.nome LIKE %:nome% AND cat IN :categorias")
    Page<Produto> search(@Param("nome") String nome, @Param("categorias") List<Categoria> categorias, PageRequest pageRequest);

}