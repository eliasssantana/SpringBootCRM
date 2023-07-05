package com.sprin.crm.crmapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.sprin.crm.crmapi.Repository.ClienteRepository;
import com.sprin.crm.crmapi.model.Cliente;

@RestController()
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;
    
    @GetMapping
    public String hello(){
        return "Olá, mundo!";
    }

    @GetMapping(("/all"))
    public List<Cliente> ListarClientes(){
        return clienteRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente AdicionarCliente(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }
}
