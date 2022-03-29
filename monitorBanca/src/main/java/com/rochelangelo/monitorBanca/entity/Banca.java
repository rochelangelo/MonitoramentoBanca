package com.rochelangelo.monitorBanca.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_banca")
public class Banca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cod_banca")
	private int id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "valor_inicial")
	private double valorInicial;
	@Column(name = "valor_atual")
	private double valorAtual;
	@OneToMany(mappedBy = "banca",
            orphanRemoval = true,
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
	private List<Aposta> apostas;
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_usuario")
	private Usuario usuario;
	

	public Banca() {
		
	}

	public Banca(int id, String nome, double valorInicial, double valorAtual, List<Aposta> apostas, Usuario usuario) {
		super();
		this.id = id;
		this.nome = nome;
		this.valorInicial = valorInicial;
		this.valorAtual = valorAtual;
		this.apostas = apostas;
		this.usuario = usuario;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(double valorInicial) {
		this.valorInicial = valorInicial;
	}

	public double getValorAtual() {
		return valorAtual;
	}

	public void setValorAtual(double valorAtual) {
		this.valorAtual = valorAtual;
	}

	public List<Aposta> getApostas() {
		return apostas;
	}

	public void setApostas(List<Aposta> apostas) {
		this.apostas = apostas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	
	
}
