package com.fst.HibernateExamopleWithAnnotation;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//@Table(name="Student")
public class Student {
	

private int sid;
private String name,company;
private StudentDetails studentDetails;

@Id	
@GeneratedValue(strategy = GenerationType.AUTO)
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
//targetEntity=StudentDetails.class,

@OneToOne(cascade = CascadeType.ALL)
@PrimaryKeyJoinColumn
public StudentDetails getStudentDetails() {
	return studentDetails;
}
public void setStudentDetails(StudentDetails studentDetails) {
	this.studentDetails = studentDetails;
}



}
