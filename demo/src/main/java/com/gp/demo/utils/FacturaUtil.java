package com.gp.demo.utils;

import java.util.List;

import com.gp.demo.model.ItemFacturable;

public class FacturaUtil   {

	public static void facturar(ItemFacturable item) {
		// TODO Auto-generated method stub
		System.out.println(item.getCodigo());
        System.out.println(item.getDescripcion());
        System.out.println(item.getPrecio());
	}
	
	
	public static void facturar(ItemFacturable serviceAFacturar, String paisOrigen) {
		facturar(serviceAFacturar);
		// trabajamos con el paisOrigen para obtener el nuevo precio, si es que cambia
		System.out.println("Pais de origen: " + serviceAFacturar.getPrecio()); 
	
	}


	/*Recibe una Object generico que representa a la persona que quiera comprar este o no registrada
	 *  
	 * */
	
	public void facturarItem(Object t, String paisOrigen) {
		// TODO Auto-generated method stub
		
	}

 
	/*Recibe una Object generico que representa a la persona que quiera comprar este o no registrada
	 * la lista generica de elementos  a verderse
	 * */
	public <T> String notificarComprador(Object t, List<T> lista) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
