package com.rochelangelo.monitorBanca.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cod_usuario", nullable = false)
	private int id;
	@Column(name="nome" , nullable = false)
	private String nome;
	@Column(name="senha", nullable = false)
	private String senha;
	@OneToMany(mappedBy = "usuario",
            orphanRemoval = true,
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
	private List<Banca> banca;
	
	public Usuario() {
		
	}
	
	public Usuario(int id, String nome, String senha) {
		this.id = id;
		this.nome = nome;
		this.senha = senha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Banca> getBanca() {
		return banca;
	}

	public void setBanca(List<Banca> banca) {
		this.banca = banca;
	}
	
	
	
	

}
