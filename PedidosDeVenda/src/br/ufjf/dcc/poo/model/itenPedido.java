package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class itenPedido {

	private int quantidade;
	private double preco;
	private  ArrayList<Pedido> pedidos;
	private ArrayList<Produto> produtos;
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}
	
	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public int incluirItem() {
		return 0;
	}
	
	public int excluirItem() {
		return 0;
	}
	
}
