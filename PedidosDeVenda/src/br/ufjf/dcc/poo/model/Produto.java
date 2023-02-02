package br.ufjf.dcc.poo.model;

public class Produto {

	private String nomeProduto;
	private int peso;
	private int qtdeDisponivel;
	private itenPedido itenPedido;
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int getQtdeDisponivel() {
		return qtdeDisponivel;
	}
	
	public void setQtdeDisponivel(int qtdeDisponivel) {
		this.qtdeDisponivel = qtdeDisponivel;
	}
	
	public itenPedido getItenPedido() {
		return itenPedido;
	}
	
	public void setItenPedido(itenPedido itenPedido) {
		this.itenPedido = itenPedido;
	}
	
	public Produto consultaProduto() {
		return 0;
	}
	
}
