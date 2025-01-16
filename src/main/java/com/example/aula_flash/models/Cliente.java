package com.example.aula_flash.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// A anotação @Entity indica que esta classe será mapeada para uma tabela no banco de dados.
@Entity
public class Cliente {

    // @Id indica que este campo é a chave primária da tabela.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera o ID automaticamente.
    private Long id;

    private String nome;
    private String email;

    // Construtor vazio (necessário para o JPA)
    public Cliente() {}

    // Construtor com parâmetros
    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Getters e Setters (usados para acessar e modificar os dados)
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