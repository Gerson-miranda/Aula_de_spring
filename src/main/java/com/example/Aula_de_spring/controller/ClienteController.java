package com.example.Aula_de_spring.controller;

import com.example.Aula_de_spring.model.Cliente;
import com.example.Aula_de_spring.repository.ClienteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteController {
private ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping("/CLiente" )
    public List<Cliente> listarTodos(){
        return clienteRepository.findAll();
    }



}
