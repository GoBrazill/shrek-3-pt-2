package com.example.ToDoList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ToDoList.entity.Usuario;
import com.example.ToDoList.repositories.UsuarioRepository;

@RestController
public class UsuarioController {

	@Autowired
	UsuarioRepository user;
	
	@PostMapping
	public Usuario Salvar() {
		Usuario teste = new Usuario("teste", "teste@gmai.com", "lkdjsf");
		return user.save(teste);
	}
	
	@GetMapping
	public List<Usuario> mostrar() {
		List<Usuario> usuario = user.findAll();
		return usuario;
		
	}
}
