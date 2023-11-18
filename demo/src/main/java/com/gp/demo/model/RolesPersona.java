package com.gp.demo.model;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class RolesPersona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	public long id;

	/* Relacion con Entity o Tabla de la BD PERSONA
	 * @ManyToOne ES : muchos registros en ROLES_PERSONA pertenecen a  UNA PERSONA
	 * */
	 
	@ManyToOne(optional = false,  fetch = FetchType.EAGER)
	Persona persona;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	Roles rol;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public Roles getRol() {
		return rol;
	}

	public void setRol(Roles rol) {
		this.rol = rol;
	}


	public RolesPersona() {
		super();
		
	}

	public RolesPersona(Persona persona, Roles rol) {
		super();
		this.persona = persona;
		this.rol = rol;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}



	
}
