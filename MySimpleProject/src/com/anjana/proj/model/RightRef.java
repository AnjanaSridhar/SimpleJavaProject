package com.anjana.proj.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;




/**
 * The <b>RightRef</b> implements;
 * 
 * This class defines elements of the "RIGHT_REF" table such as the : ;
 *  - code, Right Reference code;
 *  - name, Right Reference name;
 *  - description, Right Reference description;
 *
 */
@javax.persistence.Entity
@Table(name = "RIGHT_REF")

public class RightRef {
   
   @Id
   @Column(name="RIGHT_CODE")
   private String code;
   
   @Column(name="RIGHT_NAME")
   private String name;
   
   @Column(name="RIGHT_DESC")
   private String description;

   /**
    * Function returns the Right Reference Code;
    * 
    * @return Right Reference Code - String corresponding to RIGHT_CODE column in RIGHT_REF table
    */
	public String getCode() {
        return this.code;
    }

	/**
     * Function to set Right Reference Code;
     * 
	 * @param code - String, Right Reference Code to be set
	 */
	public void setCode(String code) {
        this.code = code;
    }

	   /**
	    * Function returns the Right Reference Name;
	    * 
	    * @return Right Reference Name - String corresponding to RIGHT_NAME column in RIGHT_REF table
	    */
	public String getName() {
        return this.name;
    }

	/**
     * Function to set Right Reference Name;
     * 
	 * @param name - String Right Reference Name to be set
	 */
	public void setName(String name) {
        this.name = name;
    }

	   /**
	    * Function returns the Right Reference Description;
	    * 
	    * @return Right Reference Description - String corresponding to RIGHT_DESC column in RIGHT_REF table
	    */
	public String getDescription() {
        return this.description;
    }

	/**
     * Function to set Right Reference Description;
     * 
	 * @param description - String, Right Reference Description to be set
	 */
	public void setDescription(String description) {
        this.description = description;
    }
}
