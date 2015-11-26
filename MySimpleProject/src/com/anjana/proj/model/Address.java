package com.anjana.proj.model;

import javax.persistence.PersistenceContext;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.PersistenceContextType;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@javax.persistence.Entity
@Table(name = "ADDRESS")
public class Address {

	@Id
	@Column(name="HOUSE_NUMBER",unique=true)
	private String houseNum;
	
	@Column(name="STREET_NAME")
	private String streetName;
	
	@Column(name="CITY")
	private int city;
	
	@Column(name="PERSON_ID")
	private int id;

	public String getHouseNum() {
		return houseNum;
	}

	public void setHouseNum(String houseNum) {
		this.houseNum = houseNum;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getCity() {
		return city;
	}

	public void setCity(int city) {
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
