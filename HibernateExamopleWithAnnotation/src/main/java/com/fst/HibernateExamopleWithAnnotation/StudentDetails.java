package com.fst.HibernateExamopleWithAnnotation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class StudentDetails {
private Student sid;
private String area,pincode;
private Student student;
@Id

@GeneratedValue(generator = "foreigngen")
@GenericGenerator(strategy = "foreign", name="foreigngen",
			parameters=@Parameter(name="property",value = "product"))
public Student getSid() {
	return sid;
}
public void setSid(Student sid) {
	this.sid = sid;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
//@OneToOne(targetEntity=Student.class)
@OneToOne(mappedBy = "studentDetails")
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}


}
