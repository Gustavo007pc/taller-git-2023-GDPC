package com.gp.demo.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.gp.demo.*;
import com.gp.demo.model.Aula;

@Repository
public interface AulaRepository extends PagingAndSortingRepository<Aula, Long> {

	List<Aula> findByDescripcion(String descripcion);

}
