package br.ufjf.dcc.poo.model;


public class itenPedido {

	private int quantidade;
	private double preco;
	private Pedido pedidos;
	private Produto produto;
	
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
	
	public Pedido getPedidos() {
		return pedidos;
	}
	
	public void setPedidos(Pedido pedidos) {
		this.pedidos = pedidos;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public int incluirItem() {
		return 0;
	}
	
	public int excluirItem() {
		return 0;
	}
	

}
