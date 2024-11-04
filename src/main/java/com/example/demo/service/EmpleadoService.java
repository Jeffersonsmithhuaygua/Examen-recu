package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Empleado;

public interface EmpleadoService {
	
	Empleado create(Empleado c);
	Empleado update(Empleado c);
	void delete(Long id);
	Optional<Empleado> read(Long id);
	List<Empleado> readAll();

}
