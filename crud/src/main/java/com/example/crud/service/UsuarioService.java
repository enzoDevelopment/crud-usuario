package com.example.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.crud.model.entity.Usuario;
import com.example.crud.model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	private UsuarioRepository usuarioRepository;

	public UsuarioService (UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}
	
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}
	
}
