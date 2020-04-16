package com.oscar.springboot.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.oscar.springboot.app.models.entity.Factura;
import com.oscar.springboot.app.models.entity.Producto;
import com.oscar.springboot.app.models.services.IClienteService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class FacturaRestController {

	@Autowired
	IClienteService clienteService;
	
	@GetMapping("/facturas/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public Factura mostrarDetalle(@PathVariable Long id) {
		return clienteService.findFacturaById(id);
	}
	
	@DeleteMapping("/facturas/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void delete(@PathVariable Long id) {
		clienteService.deleteFacturaById(id);
	}
	
	@GetMapping("/facturas/filtrar-productos/{term}")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Producto> filtrarProductos(@PathVariable String term) {
		return clienteService.findProductoByNombre(term);
	}
	
	@PostMapping("/facturas")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Factura crear(@RequestBody Factura factura) {
		return clienteService.saveFactura(factura); 
	}

}
