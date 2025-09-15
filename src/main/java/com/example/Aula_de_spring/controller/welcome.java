package com.example.Aula_de_spring.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {

    @GetMapping("/")
    public String mensagem(){
        return "Bem vindo ao Spring Boot!";
    }

    @GetMapping("/dev" )
    public String dev(){
        return  "bem vindo dev!";
    }

}
