package com.microservicio1.proyecto1.service;

import java.util.List;

import com.microservicio1.proyecto1.entity.Producto;

public interface IProductosService {
	public List<Producto>verTodo();
	public Producto verPorCodigo(long id);
	public Producto actualizar(Producto a);
	public void eliminar(Producto a);
	

}

