package com.oscar.springboot.app.models.services;

import java.util.List;

import com.oscar.springboot.app.models.entity.Cliente;

public interface IClienteService {
	public List<Cliente> findAll();
	public Cliente save(Cliente cliente);
	public void delete(Long id);
	public Cliente findById(Long id);
}
