package com.microservicio1.proyecto1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio1.proyecto1.entity.Producto;
import com.microservicio1.proyecto1.repository.ProductoRepository;
@Service
public class ProductosServiceImpl implements IProductosService {
	@Autowired
	ProductoRepository productoRepo;

	@Override
	public List<Producto> verTodo() {
		// TODO Auto-generated method stub
		return (List<Producto>)productoRepo.findAll();
	}

	@Override
	public Producto verPorCodigo(long id) {
		
		return productoRepo.findById(id).orElse(null);
	}

	@Override
	public Producto actualizar(Producto a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Producto a) {
		// TODO Auto-generated method stub
		
	}
	
	

}
