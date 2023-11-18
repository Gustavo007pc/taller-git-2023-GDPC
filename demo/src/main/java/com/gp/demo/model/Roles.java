package com.gp.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Roles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	public long id;
	
	@Column(nullable = true, unique = false)
	public String descripcion;
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Roles(String descripcion) {
		super();
		this.descripcion = descripcion;
	}
	public Roles() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
