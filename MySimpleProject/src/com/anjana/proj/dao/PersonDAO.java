package com.anjana.proj.dao;

import java.util.List;

import com.anjana.proj.model.Person;
import com.anjana.proj.model.RightRef;


 
public interface PersonDAO {
 
    public void addPerson(Person p);
    public void updatePerson(Person p);
    public List<Person> listPersons();
    public RightRef getPersonById(String id);
    public void removePerson(int id);
}