package com.fst.Hibernate1_1example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
@Entity
@Table
public class PersonDetail {

	@OneToOne(targetEntity=Person.class)
	private Person person;
	private String address,pincode;
	
	@Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
	
	private int persondetailsId;
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public int getPersondetailsId() {
		return persondetailsId;
	}
	public void setPersondetailsId(int persondetailsId) {
		this.persondetailsId = persondetailsId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	



}
