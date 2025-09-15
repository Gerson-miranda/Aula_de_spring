package com.example.Aula_de_spring.repository;

import com.example.Aula_de_spring.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ProdutoRepository extends JpaRepository<Produto,Long> {
}
