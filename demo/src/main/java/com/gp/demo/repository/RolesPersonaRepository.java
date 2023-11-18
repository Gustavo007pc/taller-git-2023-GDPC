package com.gp.demo.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.gp.demo.model.RolesPersona;

public interface RolesPersonaRepository  extends  JpaRepository<RolesPersona,Long>{

	List<RolesPersona>findByPersonaId(long l);
}
