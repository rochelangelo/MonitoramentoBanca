package com.rochelangelo.monitorBanca.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rochelangelo.monitorBanca.entity.Usuario;
import com.rochelangelo.monitorBanca.service.UsuarioService;

@Controller
@RequestMapping("MasterBet/api/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public List<Usuario> listaTodos(){
		return usuarioService.listTodos();
	}
	
	@GetMapping(value = "/{id}")
	@ResponseBody
	public ResponseEntity<Optional<Usuario>> listUsuaioPorId(@PathVariable int id){
		Optional<Usuario> usuarioBuscado = usuarioService.buscarPorId(id);
		return usuarioBuscado.isPresent() ? ResponseEntity.ok(usuarioBuscado) : ResponseEntity.notFound().build();
	}
	
	@PostMapping
	public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario){
		Usuario usuarioSalvar = usuarioService.salvar(usuario);
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioSalvar);
	}
	
}
