package com.oscar.springboot.app.models.services;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oscar.springboot.app.models.dao.IUsuarioDao;
import com.oscar.springboot.app.models.entity.Usuario;

@Service
public class UsuarioService implements IUsuarioService, UserDetailsService{

	Logger log = LoggerFactory.getLogger(UsuarioService.class);
	
	@Autowired
	private IUsuarioDao usuarioDao;
	
	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioDao.findByUsername(username);
		
		if (usuario == null) {
			log.error("No existe el usuario ".concat(username).concat(" en el sistema"));
			throw new UsernameNotFoundException("No existe el usuario ".concat(username).concat(" en el sistema"));
		}
		
		List<GrantedAuthority> roles = usuario.getRoles().stream()
				.map(role -> new SimpleGrantedAuthority(role.getNombre()))
				.peek(authority -> log.info("Role: " + authority.getAuthority()))
				.collect(Collectors.toList());
		
		return new User(usuario.getUsername(), usuario.getPassword(), usuario.isEnabled(), true, true, true, roles);
	}

	@Override
	public Usuario findByUsername(String username) {
		return usuarioDao.findByUsername(username);
	}

}
