package com.example.Aula_de_spring.controller;

import com.example.Aula_de_spring.model.Produto;
import com.example.Aula_de_spring.repository.ProdutoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @GetMapping
    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody Produto produto) {
        if (produto.getNome() == null || produto.getNome().isBlank()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("O campo 'nome' é obrigatório.");
        }

        if (produto.getPrecoUnitario() == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("O campo 'precoUnitario' é obrigatório.");
        }

        Produto salvo = produtoRepository.save(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }
}
