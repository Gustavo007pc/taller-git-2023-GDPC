package com.gp.demo.interfaces.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gp.demo.model.Cliente;
import com.gp.demo.model.ItemFacturable;
import com.gp.demo.model.Producto;

@Service
public interface FacturacionServicio {
	
	public  void facturar(ItemFacturable item);
	
	public Cliente listarClientesNombreORuc(String parameter);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */

	public List<ItemFacturable> listarTipoImpuesto();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */

	public Producto obtenerProductoCodigo(int parameter);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */

	public Producto obtenerProductoDescripcion(String parameter);
}
