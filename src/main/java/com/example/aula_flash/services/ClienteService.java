package com.example.aula_flash.services;

import com.example.aula_flash.dtos.ClienteDTO;
import com.example.aula_flash.dtos.ClienteRequestDTO;
import com.example.aula_flash.models.Cliente;
import com.example.aula_flash.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    // Metodo para listar todos os clientes e convertê-los em DTOs
    public List<ClienteDTO> listarClientes() {
        List<Cliente> clientes = clienteRepository.findAll();
        // Convertendo a lista de entidades para uma lista de DTOs
        return clientes.stream()
                .map(cliente -> new ClienteDTO(cliente.getId(), cliente.getNome()))
                .collect(Collectors.toList());
    }// Metodo para salvar um novo cliente
    public ClienteDTO salvarCliente(ClienteRequestDTO clienteRequestDTO) {
        // Convertendo o DTO para a entidade Cliente
        Cliente cliente = new Cliente();
        cliente.setNome(clienteRequestDTO.getNome());
        cliente.setEmail(clienteRequestDTO.getEmail());

        // Salvando no banco de dados
        Cliente clienteSalvo = clienteRepository.save(cliente);

        // Retornando o cliente salvo como DTO
        return new ClienteDTO(clienteSalvo.getId(), clienteSalvo.getNome());
    }
}