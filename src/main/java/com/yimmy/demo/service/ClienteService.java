package com.yimmy.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.yimmy.demo.entity.Cliente;
import com.yimmy.demo.entity.ClienteTelefono;
import com.yimmy.demo.entity.Telefono;

@Service
public class ClienteService {
	
	//Listado Clientes
	
	private List<Cliente> clientes;
	
	public ClienteService()
	{
		clientes = new ArrayList<>();
		clientes.add(new Cliente(1,"Yimmy","Gil","1019845"));
		clientes.add(new Cliente(2,"Alejandra","cruz","25485"));
		clientes.add(new Cliente(3,"Maria","ortiz","119845"));
	}
	
	public List<Cliente> List(){
		return clientes;
	}

	//Buscar Cliente
	
	public Cliente find(int id)
	{
		for(Cliente cliente : clientes)
		{
			if(cliente.getId() == id)
			{
				return cliente;
			}
		}
		return null;
	}
	
	//Crear Cliente
	
	
	public Cliente save(Cliente cli) {
		clientes.add(cli);
		return cli;
	}
	
	// Actualizar Cliente
	
	public Cliente update(int id, Cliente cli) {
		int index = 0;
		for(Cliente l: clientes)
		{
			if( l.getId() == id)
			{
				cli.setId(id);
				clientes.set(index,cli);
			}
		}
		
		return cli;
	}
	
	// Eliminar Cliente
	
	
	public boolean delete(int id)
	{
		for(Cliente c : clientes)
		{
			if(c.getId() == id )
			{
				return clientes.remove(c);
			}
		}
		return false;
	}
	
	public ClienteTelefono findAll(int id)
	{
		Cliente cliente = find(id);
		TelefonoService telefonoService = new TelefonoService();
		ArrayList<Telefono> telefonos = (ArrayList<Telefono>) telefonoService.telefonosPorCliente(cliente.getId());
		
		ClienteTelefono clienteTelefono = new ClienteTelefono();
		clienteTelefono.setId(cliente.getId());
		clienteTelefono.setFullname(String.format("%s %s",cliente.getApellidos(),cliente.getNombre()));
		clienteTelefono.setDni(cliente.getDni());
		clienteTelefono.setTelefono(telefonos);
		
		return clienteTelefono;
		
	}
	
	
}
