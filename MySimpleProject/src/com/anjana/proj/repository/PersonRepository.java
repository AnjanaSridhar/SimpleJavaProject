package com.anjana.proj.repository;

import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface PersonRepository extends JpaRepository<Person, Long>, JpaSpecificationExecutor<Person>{

	@Query("select p from Person ORDER BY p.id ASC")
	Page<Person> findAllPersons(Pageable pageable);
	
	@Query("select p from Person where p.id = :id ORDER BY p.id ASC")
	Page<Person> findPerson(@Param(ID) String id);

}
