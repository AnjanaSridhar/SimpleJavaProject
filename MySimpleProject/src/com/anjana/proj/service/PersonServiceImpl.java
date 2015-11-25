package com.anjana.proj.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.PageRequest;

import com.anjana.proj.model.Person;
import com.anjana.proj.repository.PersonRepository;

public class PersonServiceImpl implements PersonService{

	PersonRepository personRepository;
	@Override
	public void addPerson(Person person) {
		// TODO Auto-generated method stub
		saveFullDataProc(person); 
		log.info("Request saved!");
	}

	private void saveFullDataProc(Person person) {
		// TODO Auto-generated method stub
		dataProc.setDteCreate(new Date());
		dataProc.setDteLastAction(dataProc.getDteCreate());
		dataProc.setOperLast(dataProc.getOperCreator());
		//Save DataProc in DB
		personService.saveDataProc(dataProc);
		dataProc.setReference(themisRequest.getHeader()+dataProc.getId());
		logSecurity.debug("User ["+dataProc.getOperCreator().getLogin()+"] just created request with reference ["+dataProc.getReference()+"]");
	}

	@Override
	public void addAddress(Address a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person getPerson(String id) {
		// TODO Auto-generated method stub
		return personRepository.findPerson(id, new PageRequest(firstResult / maxResults, maxResults)).getContent();
	}

	@Override
	public List<Person> getPeople() {
		// TODO Auto-generated method stub
		return personRepository.findAllPersons(new PageRequest(firstResult / maxResults, maxResults)).getContent();
	}

	
}
