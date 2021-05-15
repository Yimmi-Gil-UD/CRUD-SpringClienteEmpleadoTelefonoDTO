package com.yimmy.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.yimmy.demo.entity.Telefono;

@Service
public class TelefonoService {
	
	//listado de telefonos
	
	private List<Telefono> telefonos;
	
	public TelefonoService()
	{
		telefonos = new ArrayList<> ();
		telefonos.add(new Telefono(1,"844578","Movistar",1));
		telefonos.add(new Telefono(1,"65487","ETB",2));
		telefonos.add(new Telefono(1,"6548454457","CLARO",2));
		telefonos.add(new Telefono(1,"6587877878","ETB",2));
		telefonos.add(new Telefono(1,"487544","WOW",3));
	}
	
	public List<Telefono> list()
	{
		return telefonos;
	}

	//Encontrar Telefono
	
	public Telefono find(int id)
	{
		Telefono telefono = new Telefono();
		for(Telefono t : telefonos)
		{
			if(t.getId() == id)
			{
				telefono = t;
				break;
			}
		}
		
		return telefono;
	}
	
	public List<Telefono> telefonosPorCliente(int clienteid)
	{
		List<Telefono> telefonoPorCliente = new ArrayList<>();
		
		for(Telefono t : telefonos)
		{
			if(t.getClienteId() == clienteid)
			{
				telefonoPorCliente.add(t);
			}
		}  
		
		return telefonoPorCliente;
	}
	
	
	
	
}
