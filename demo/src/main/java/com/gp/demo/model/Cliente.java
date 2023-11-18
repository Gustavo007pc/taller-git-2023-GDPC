package com.gp.demo.model ;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;




/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
//@PrimaryKeyJoinColumn(name = "ID") //Este es el campo que secrea en Cliente que seraEL PK  el q relacione con Persona

@Entity
@PrimaryKeyJoinColumn(name = "personaId")
public class Cliente extends Persona implements Serializable {
 
	private static final long serialVersionUID = 1L;
	
	public String ruc;

	//public String password; ya esta en Persona

	public Cliente(){
		super();
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public Cliente(String ruc) {
		super();
		this.ruc = ruc;
	}


 
	
	

}

