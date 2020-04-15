package com.renan.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.renan.cursomc.domain.Produto;
import com.renan.cursomc.domain.*;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Integer> {

}
