package com.rochelangelo.monitorBanca.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Aposta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cod_aposta")
	private int id;
	@Column(name = "odd", nullable = false)
	private double odd;
	@Column(name = "valor", nullable = false)
	private double valor;
	@Column(name = "tipo", nullable = false)
	private String tipo;
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_banca")
	private Banca banca;

	public Aposta() {
		
	}
	
	public Aposta(int id, double odd, double valor, String tipo, Banca banca) {
		this.id = id;
		this.odd = odd;
		this.valor = valor;
		this.tipo = tipo;
		this.banca = banca;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getOdd() {
		return odd;
	}

	public void setOdd(double odd) {
		this.odd = odd;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getTipo(){
		return tipo;
	}
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}

	public Banca getBanca() {
		return banca;
	}

	public void setBanca(Banca banca) {
		this.banca = banca;
	}
}
