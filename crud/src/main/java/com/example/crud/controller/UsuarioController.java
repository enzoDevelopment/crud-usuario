package com.example.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.crud.service.UsuarioService;

@Controller
@RequestMapping("/usuario") // toda url deve ter http://localhost:8080/usuario...
public class UsuarioController {
	
	private UsuarioService usuarioService;
	public UsuarioController(UsuarioService usuarioService) {
		super();
		this.usuarioService = usuarioService;
	}
	
	@GetMapping("/todos")
	public String getIndex(ModelMap map) {
		map.addAttribute("usuarios", usuarioService.findAll());
		return "usuarios";
	}	
	
	
}