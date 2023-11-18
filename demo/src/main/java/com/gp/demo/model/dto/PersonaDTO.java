package com.gp.demo.model.dto;

import java.util.ArrayList;
import java.util.List;

import com.gp.demo.model.Persona;
import com.gp.demo.model.RolesPersona;

/*Clase modelo que tiene todos los datos de la persona mas la lista de Roles*/
public class PersonaDTO {
	private Persona persona;
	
	List<RolesPersona> listRolesPersona = new ArrayList<>();

	public PersonaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonaDTO(Persona persona, List<RolesPersona> listRolesPersona) {
		super();
		this.persona = persona;
		this.listRolesPersona = listRolesPersona;
	}


	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}



	public List<RolesPersona> getListRolesPersona() {
		return listRolesPersona;
	}

	public void setListRolesPersona(List<RolesPersona> listRolesPersona) {
		this.listRolesPersona = listRolesPersona;
	}
	
	
	
	
}
