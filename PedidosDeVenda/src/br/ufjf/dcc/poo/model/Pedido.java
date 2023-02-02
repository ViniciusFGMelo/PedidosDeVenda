package br.ufjf.dcc.poo.model;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {

	private Date dataPedido;
	private String vendedor;
	private String status;
	private String observacoes;
	private ArrayList<Cliente> clientes;
	private itenPedido itenPedido;

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public itenPedido getItenPedido() {
		return itenPedido;
	}

	public void setItenPedido(itenPedido itenPedido) {
		this.itenPedido = itenPedido;
	}

	public void encerraPedido() {

	}

	public void cancelaPedido() {

	}
}
