package com.gp.demo.interfaces.service;

import java.util.List;

import com.gp.demo.*;
import com.gp.demo.model.Aula;

public interface AulaService {

	Aula findById(Long id);

	List<Aula> findAll();

	void save(Aula institute);

	void delete(Long id);

}
