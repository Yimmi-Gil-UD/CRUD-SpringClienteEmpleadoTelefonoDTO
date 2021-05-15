package com.yimmy.demo.entity;

public class Empleado {
	
	int id,edad;
	String nombre,apellido,cargo,empresa;
	long salario;
	
	public Empleado()
	{
		
	}

	public Empleado(int id, int edad, String nombre, String apellido, String cargo, String empresa, long salario) {
		this.id = id;
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cargo = cargo;
		this.empresa = empresa;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public long getSalario() {
		return salario;
	}

	public long setSalario(long salario) {
		return this.salario = salario;
	}
	
	

}
