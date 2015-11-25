package com.anjana.proj.service;

import java.util.List;

import com.anjana.proj.model.Person;

public interface PersonService {

	public void addPerson(Person p);
	public void addAddress(Address a);
	public Person getPerson(String id);
	public List<Person> getPeople();
}
