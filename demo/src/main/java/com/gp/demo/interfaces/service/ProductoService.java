package com.gp.demo.interfaces.service;
 
import com.gp.demo.model.Producto;

public interface ProductoService {

	public Producto actualizarProducto(Producto parameter);

	public Producto crearProducto(Producto parameter);

	public String eliminarProducto(String parameter);

	public Producto leerProducto(int parameter);
	
	public Producto buscarPorDescripcion(String descripcion);
}
