/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cliente.controller;

import com.cliente.DateTableClientes.DataInitializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

import com.cliente.service.ClienteService;
import com.cliente.entity.Cliente;
import com.cliente.dto.ClienteDTO;
/**
 *
 * @author Jackson
 */

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "http://localhost")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;
    
    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
    
    @PostMapping
    public Cliente createCliente(@RequestBody ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente();
        cliente.setNome(clienteDTO.getNome());
        cliente.setCpf(clienteDTO.getCpf());
        cliente.setIdade(clienteDTO.getIdade());
        return clienteService.saveCliente(cliente);
    }

    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteService.getAllClientes();
    }

    @GetMapping("/{id}")
    public Optional<Cliente> getClienteById(@PathVariable Integer id) {
        return clienteService.getClienteById(id);
    }

    @PutMapping("/update/{id}")
    public Cliente updateCliente(@PathVariable Integer id, @RequestBody ClienteDTO clienteDTO) {
        Optional<Cliente> optionalCliente = clienteService.getClienteById(id);
        if (optionalCliente.isPresent()) {
            Cliente cliente = optionalCliente.get();
            cliente.setNome(clienteDTO.getNome());
            cliente.setCpf(clienteDTO.getCpf());
            cliente.setIdade(clienteDTO.getIdade());
            return clienteService.saveCliente(cliente);
        }
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCliente(@PathVariable Integer id) {
        clienteService.deleteCliente(id);
    }
}
