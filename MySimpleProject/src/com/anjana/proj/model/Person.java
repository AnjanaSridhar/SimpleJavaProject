package com.anjana.proj.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "PERSON")
public class Person {

	@Id
	@Column(name="PERSON_ID",unique=true)
	private String id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="AGE")
	private int age;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
