package com.microservicio1.proyecto1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio1.proyecto1.entity.Producto;
import com.microservicio1.proyecto1.service.IProductosService;
@RestController
public class ProductoController {
	@Autowired
	IProductosService iprod;
	@GetMapping("/listar")
	public  List<Producto>  ver(){
		
		return iprod.verTodo();
		
	}
	@GetMapping("/ver/{id}")
	public Producto verObjeto(@PathVariable long id) {
		return  iprod.verPorCodigo(id);
	}


}
