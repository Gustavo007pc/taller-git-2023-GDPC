package com.gp.demo.model ;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Proveedor extends Persona
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String nroProveedor;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Proveedor(){
		super();
	}

	public Proveedor(String nroProveedor) {
		super();
		this.nroProveedor = nroProveedor;
	}

	public String getNroProveedor() {
		return nroProveedor;
	}

	public void setNroProveedor(String nroProveedor) {
		this.nroProveedor = nroProveedor;
	}
	
	

}

