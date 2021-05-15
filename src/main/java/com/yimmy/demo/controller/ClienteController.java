package com.yimmy.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yimmy.demo.entity.Cliente;
import com.yimmy.demo.entity.ClienteTelefono;
import com.yimmy.demo.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	private final ClienteService service;
	public ClienteController(ClienteService service)
	{
		this.service = service;
	}
	
	@GetMapping
	public Iterable<Cliente> list()
	{
		return service.List();
	}
	
	
	@GetMapping("/{id}")
	public Cliente find(@PathVariable("id") int id)
	{
		return service.find(id);
	}
	
	
	@GetMapping("/completo/{id}")
	public ClienteTelefono findCliente(@PathVariable("id") int id)
	{
		return service.findAll(id);
	}
	
	@PostMapping
	public Cliente create(@RequestBody Cliente cliente)  //Cuerpo json en objeto java
	{
		return service.save(cliente);
	}
	
	@PutMapping ("/{id}")
	public Cliente update(@PathVariable("id") int id, @RequestBody Cliente cliente)
	{
		return service.update(id, cliente);
	}
	
	@DeleteMapping ("/{id}")
	public boolean delete(@PathVariable("id") int id)
	{
		return service.delete(id); 
	}
	
}
