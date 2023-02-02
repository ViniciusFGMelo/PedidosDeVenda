package br.ufjf.dcc.poo.model;

public class Cliente extends Pessoa {

	private double limiteCredito;
	private int cartaoCredito;
	private String contato;
	private Boolean status;
	private Pedido pedido;
	
	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public int getCartaoCredito() {
		return cartaoCredito;
	}

	public void setCartaoCredito(int cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	public double verificaCredito () {
		return 0;
	}
	
	public int validaCartao() {
		return 0;
	}
	
}
