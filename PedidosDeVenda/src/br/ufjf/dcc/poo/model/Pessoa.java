package br.ufjf.dcc.poo.model;

import java.util.Date;

public abstract class Pessoa {

	private String nome;
	private Date dataNas;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNas() {
		return dataNas;
	}

	public void setDataNas(Date dataNas) {
		this.dataNas = dataNas;
	}
	
	public int calculaIdade() {
		return 0;
	}
	
}
