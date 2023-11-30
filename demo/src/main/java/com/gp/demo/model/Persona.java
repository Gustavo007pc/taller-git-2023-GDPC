package com.gp.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;




/**
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated @Inheritance(strategy=InheritanceType.JOINED)
 */

/*Super Clase que contiene los datos de todas las personas*/

//los arrobas son anotaciones
 
@Entity 							//crea la tabla = entidad
@Inheritance(strategy=InheritanceType.JOINED)
public class Persona implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id 										//pk primary key clave unica para la tabla
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private int numDoc; // 4454479

	private String email; // usuario

	private String tipoDoc; // cedula, pasaporte
	
	public String nombre;
	
	private String apellido;
	
	private String paisOrigen;
	
	private String password;

	public Persona() {
		super();
	
	}


	public Persona(int numDoc, String email, String tipoDoc, String nombre, String apellido, String paisOrigen,
			String password) {
		super(); //invoca a la clase superior
		this.numDoc = numDoc;
		this.email = email;
		this.tipoDoc = tipoDoc;
		this.nombre = nombre;
		this.apellido = apellido;
		this.paisOrigen = paisOrigen;
		this.password = password;
	 
	}



	public int getNumDoc() {
		return numDoc;
	}

	public void setNumDoc(int numDoc) {
		this.numDoc = numDoc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	
}
