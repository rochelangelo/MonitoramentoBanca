package com.rochelangelo.monitorBanca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rochelangelo.monitorBanca.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	Usuario findByNome(String nome);

}
