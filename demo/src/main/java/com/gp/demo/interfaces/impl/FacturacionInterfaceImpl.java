package com.gp.demo.interfaces.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gp.demo.interfaces.service.FacturacionServicio;
import com.gp.demo.model.Cliente;
import com.gp.demo.model.ItemFacturable;
import com.gp.demo.model.Producto;

@Service
public class FacturacionInterfaceImpl implements FacturacionServicio{

	@Override
	public Cliente listarClientesNombreORuc(String parameter) {
		System.out.println("LISTANDO CLIENTE POR RUC");
		Cliente cli=new Cliente();
		cli.setNumDoc(34535);
		cli.setNombre("Gustavo");
		cli.setApellido("Perez");
		cli.setEmail("gp@hotmail.com");
		cli.setRuc(parameter);

		return cli;
	}

	@Override
	public List<ItemFacturable> listarTipoImpuesto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto obtenerProductoCodigo(int parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto obtenerProductoDescripcion(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void facturar(ItemFacturable item) {
		// TODO Auto-generated method stubSystem.out.println(item.getCodigo());
		System.out.println(item.getCodigo());
		System.out.println(item.getDescripcion());
		System.out.println(item.getPrecio());
		System.out.println(item.getTipoImpuesto());
	
	}

}
