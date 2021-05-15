package com.yimmy.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.yimmy.demo.entity.Empleado;
@Service
public class EmpleadoService  {

	// Listar Empleados

	private List<Empleado> empleados;

	public EmpleadoService() {
		empleados = new ArrayList<>();
		empleados.add(new Empleado(1, 25, "Jose", "Osorio", "DBA", "CMC", 2500000));
		empleados.add(new Empleado(2, 29, "Valentina", "Pinzon", "QA", "CMC", 6500000));
		empleados.add(new Empleado(3, 25, "Pablo", "pinilla", "Director", "CMC", 12500000));
	}

	public List<Empleado> List() {
		return empleados;
	}

	// Buscar Empleados

	public Empleado find(int id) {
		for (Empleado empleado : empleados) {
			if (empleado.getId() == id) {
				return empleado;
			}
		}

		return null;
	}

	// Crear Empleado

	public Empleado save(Empleado empleado) {
		empleados.add(empleado);
		return empleado;
	}

	// Actualizar Empleado

	public Empleado update(int id, Empleado empleado) {
		int index = 0;
		for (Empleado em : empleados) {
			if (em.getId() == id) {
				empleado.setId(id);
				empleados.set(index, empleado);

			}
		}

		return empleado;
	}

	// Eliminar Empleado

	public boolean delete(int id) {
		for (Empleado em : empleados) {
			if (em.getId() == id) {
				return empleados.remove(em);
			}
		}

		return false;
	}

	// public CalcularSalario

	public long calcular(int id, int horasExtra) {
		for (Empleado em : empleados) {
			if (horasExtra > 0 && em.getId() == id) {
				int valor1 = horasExtra * 3500;
				long valor2 = valor1 + em.getSalario();
				return em.setSalario(valor2);
			}
		}

		return 0;
	}

}
