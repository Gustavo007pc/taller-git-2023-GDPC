package com.gp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.gp.demo.model.Roles;

public  interface RolesRepository extends JpaRepository<Roles,Long>{
	 

}
