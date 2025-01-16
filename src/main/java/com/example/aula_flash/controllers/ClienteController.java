package com.example.aula_flash.controllers;

import com.example.aula_flash.dtos.ClienteDTO;
import com.example.aula_flash.dtos.ClienteRequestDTO;
import com.example.aula_flash.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    // Endpoint para listar todos os clientes
    @GetMapping
    public List<ClienteDTO> listarClientes() {
        return clienteService.listarClientes();
    }

    // Endpoint para cadastrar um novo cliente
    @PostMapping
    public ClienteDTO salvarCliente(@RequestBody ClienteRequestDTO clienteRequestDTO) {
        return clienteService.salvarCliente(clienteRequestDTO);
    }
}