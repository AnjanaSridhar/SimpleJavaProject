package com.anjana.proj.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.anjana.proj.model.Person;
import com.anjana.proj.model.RightRef;


public interface PersonRepository extends JpaRepository<Person, Long>, JpaSpecificationExecutor<Person>{

	String RIGHT_CODE = "RightRef";
	@Query("select o from Operator ORDER BY o.id ASC")
	Page<RightRef> findAllPersons(Pageable pageable);
	
	@Query("select r from RightRef where r.code = :id ORDER BY o.code ASC")
	RightRef findPerson(@Param(RIGHT_CODE) String id);

}
