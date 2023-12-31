package com.gp.demo.interfaces.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gp.demo.model.*;
import com.gp.demo.repository.*;


@Service
public class AulaServiceImpl implements com.gp.demo.interfaces.service.AulaService {

	@Autowired
	private AulaRepository aulaRepository;

	public Aula findById(Long id) {
		Aula aula = null;
		Optional<Aula> optional = aulaRepository.findById(id);
		if (optional.isPresent()) {
			aula = optional.get();
		}
		return aula;
	}

	public List<Aula> findAll() {
		List<Aula> aulas = new ArrayList<>();
		Iterator<Aula> aulasIterator = aulaRepository.findAll().iterator();
		while (aulasIterator.hasNext()) {
			aulas.add(aulasIterator.next());
		}
		return aulas;
	}

	public void save(Aula aula) {
		aulaRepository.save(aula);

	}

	public void delete(Long id) {
		aulaRepository.deleteById(id);
	}

}
