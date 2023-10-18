package com.microservicio1.proyecto1.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservicio1.proyecto1.entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long>{
}
