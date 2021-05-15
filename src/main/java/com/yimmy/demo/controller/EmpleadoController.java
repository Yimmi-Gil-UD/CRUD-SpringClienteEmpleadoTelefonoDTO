package com.yimmy.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yimmy.demo.entity.Empleado;
import com.yimmy.demo.service.EmpleadoService;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
	
	
	
	private final EmpleadoService service;
	
	public EmpleadoController(EmpleadoService service)
	{
		this.service = service;
	}
	
	@GetMapping
	public Iterable<Empleado> List()
	{
		return service.List();
	}
	
	@GetMapping ("/{id}")
	public Empleado find(@PathVariable("id") int id)
	{
		return service.find(id);
	}
	/*
	@GetMapping
	public Empleado create(@RequestBody Empleado empleado)
	{
		return service.save(empleado);
	}
	*/
	@PutMapping("/{id}")
	public Empleado update (@PathVariable("id") int id, @RequestBody Empleado empleado)
	{
		return service.update(id, empleado);
	}
	
	@DeleteMapping
	public boolean delete(@PathVariable("id") int id)
	{
		return service.delete(id);
	}
	
	//@GetMapping("/{id}/{horasExtra}")
	@RequestMapping(
			value = "/calcular",
			method = RequestMethod.GET,
			params = {"id", "horasExtra"}
			)
	public long calcular(@RequestParam("id") int dato1,@RequestParam("horasExtra") Integer dato2)
	{
		
		return service.calcular(dato1, dato2);
		
	}
	
}
