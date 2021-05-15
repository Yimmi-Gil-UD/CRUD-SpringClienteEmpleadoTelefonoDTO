package com.yimmy.demo.entity;

import java.util.List;

public class ClienteTelefono {
	private int id;
	private String fullname;
	private String dni;
	private List<Telefono> telefono;
	
	public ClienteTelefono() {
	
	}
	
	
	public ClienteTelefono(String fullname, String dni, List<Telefono> telefono, int id) {
		super();
		this.fullname = fullname;
		this.dni = dni;
		this.telefono = telefono;
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public List<Telefono> getTelefono() {
		return telefono;
	}
	public void setTelefono(List<Telefono> telefono) {
		this.telefono = telefono;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
