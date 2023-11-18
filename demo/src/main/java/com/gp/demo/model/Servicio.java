package com.gp.demo.model ;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Servicio extends ItemFacturable
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int cantidadPersonas;

 
	public Servicio(){
		super(); // Invoca al constructor de su clase padre (del que hereda, en este caso ItemFacturable)
		precio = 25000.0; // Hereda de ItemFacturable
		descripcion = "fotocopia x 12"; // Hereda de ItemFacturable
		cantidadPersonas = 1; // Variable propia de la clase
	}


	public Servicio(int cantidadPersonas) {
		super();
		this.cantidadPersonas = cantidadPersonas;
	}


	public int getCantidadPersonas() {
		return cantidadPersonas;
	}


	public void setCantidadPersonas(int cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}

 

	

}

