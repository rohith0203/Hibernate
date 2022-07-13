package com.fst.Hibernate1_1example;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table
public class Person {

	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private PersonDetail personDetail;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int personid;
	private String email,name;
	
	public int getPersonid() {
		return personid;
	}
	public void setPersonid(int personid) {
		this.personid = personid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public PersonDetail getPersonDetail() {
		return personDetail;
	}
	public void setPersonDetail(PersonDetail personDetail) {
		this.personDetail = personDetail;
	}
}
