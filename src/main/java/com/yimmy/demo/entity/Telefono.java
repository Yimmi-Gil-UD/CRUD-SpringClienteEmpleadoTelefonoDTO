package com.yimmy.demo.entity;

public class Telefono {
	
	private int id;
	private String numero;
	private String operadora;
	private int clienteId;
	
	public Telefono() {
	
	}

	public Telefono(int id, String numero, String operadora, int clienteId) {
		super();
		this.id = id;
		this.numero = numero;
		this.operadora = operadora;
		this.clienteId = clienteId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}
	
	
	
	

}
