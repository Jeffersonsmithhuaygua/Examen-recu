package com.example.demo.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

}
