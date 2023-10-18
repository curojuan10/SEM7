package com.microservicio1.proyecto1.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity(name="Producto")
@Table(name="producto")

public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String nombre;
	private  Double precio;
	
	@Column(name="fecha_fabricacion")
	@Temporal(TemporalType.DATE)
	private Date fechaFabricacion;
	
	public Producto() {
		super();
	}

	public Producto(long id, String nombre, Double precio, Date fechaFabricacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.fechaFabricacion = fechaFabricacion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Date getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(Date fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}
	
	

}
