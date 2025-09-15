package com.example.Aula_de_spring.model;


import jakarta.persistence.*;

@Entity
@Table(name = "tab_cliente")
public class Cliente {
    @Id//chave primaria
    @GeneratedValue (strategy = GenerationType.IDENTITY)  //auto incremento
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false,unique = true)
    private String email;

    public Cliente() {
    }

    public Cliente(Long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
