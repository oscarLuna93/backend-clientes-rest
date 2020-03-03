package com.oscar.springboot.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oscar.springboot.app.models.entity.Cliente;
import com.oscar.springboot.app.models.services.IClienteService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:4200"})
public class ClienteRestController {
	
	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		return clienteService.findAll();
	}
	
	@GetMapping("/clientes/{id}")
	public Cliente obtenerClienteById(@PathVariable Long id) {
		return clienteService.findById(id);
	}
	
	@PostMapping("/clientes")
	public Cliente crearCliente(@RequestBody Cliente cliente) {
		return clienteService.save(cliente);
	}
	
	
}
