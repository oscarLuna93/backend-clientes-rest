package com.oscar.springboot.app.models.services;

import com.oscar.springboot.app.models.entity.Usuario;

public interface IUsuarioService {
	public Usuario findByUsername(String username);
}
