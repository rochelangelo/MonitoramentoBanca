package com.rochelangelo.monitorBanca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rochelangelo.monitorBanca.entity.Usuario;
import com.rochelangelo.monitorBanca.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> listTodos(){
		return usuarioRepository.findAll();
	}
	
	public Optional<Usuario> buscarPorId(int id){
		return usuarioRepository.findById(id);
	}
	
	public Usuario salvar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public Usuario atualizar(int id, Usuario usuario) {
		Usuario usuarioSalvar = validarUsuarioExiste(id);
		BeanUtils.copyProperties(usuario, usuarioSalvar, "id");
		return usuarioRepository.save(usuarioSalvar);
	}
	
	public void deletar(int id) {
		usuarioRepository.deleteById(id);
	}
	
	public Usuario validarUsuarioExiste(int id) {
		Optional<Usuario> usuario = buscarPorId(id);
		
		return usuario.get();
		
	}

}
