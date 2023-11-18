package com.gp.demo.interfaces.impl;

import com.gp.demo.interfaces.service.ProductoService;
import com.gp.demo.model.Producto;

public class ProductoInterfaceImpl implements ProductoService {

	@Override
	public Producto actualizarProducto(Producto parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto crearProducto(Producto parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eliminarProducto(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto leerProducto(int parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto buscarPorDescripcion(String descripcion) {
		System.out.println("DESCRIPCION DEL PRODUCTO"+descripcion);
		return null;
	}

}
