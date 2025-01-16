package com.example.aula_flash.repositories;

import com.example.aula_flash.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository já fornece métodos prontos como findAll(), save(), deleteById(), etc.
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}