package com.example.aula_flash.dtos;

// DTO para receber os dados do cliente no momento do cadastro
public class ClienteRequestDTO {
    private String nome;
    private String email;

    // Getters e Setters
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