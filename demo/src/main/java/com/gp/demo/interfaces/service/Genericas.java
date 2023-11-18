package com.gp.demo.interfaces.service;

public interface Genericas<T, ID> {

	Integer vender(T t);
	
	String notificarComprador(T t);
	
}
