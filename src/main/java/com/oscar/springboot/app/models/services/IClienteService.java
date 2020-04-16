package com.oscar.springboot.app.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.oscar.springboot.app.models.entity.Cliente;
import com.oscar.springboot.app.models.entity.Factura;
import com.oscar.springboot.app.models.entity.Producto;

public interface IClienteService {
	public List<Cliente> findAll();
	public Page<Cliente> findAll(Pageable pageable);
	public Cliente save(Cliente cliente);
	public void delete(Long id);
	public Cliente findById(Long id);
	public Factura findFacturaById(Long id);
	public Factura saveFactura(Factura factura);
	public void deleteFacturaById(Long id);
	public List<Producto> findProductoByNombre(String term);
}
