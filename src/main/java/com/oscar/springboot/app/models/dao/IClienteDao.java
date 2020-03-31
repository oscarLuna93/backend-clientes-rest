package com.oscar.springboot.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oscar.springboot.app.models.entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long>{
	
}
