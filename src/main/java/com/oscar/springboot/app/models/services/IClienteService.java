package com.oscar.springboot.app.models.services;

import java.util.List;

import com.oscar.springboot.app.models.entity.Cliente;

public interface IClienteService {
	public List<Cliente> findAll();
}
