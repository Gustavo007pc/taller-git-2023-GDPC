package com.gp.demo.interfaces.impl;

import org.yaml.snakeyaml.events.Event.ID;

import com.gp.demo.interfaces.service.Genericas;

public class GenericosImpl<T>  implements Genericas<T, ID>{

	@Override
	public Integer vender(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String notificarComprador(T t) {
		// TODO Auto-generated method stub
		return null;
	}

}
