package com.fst.Hibernate1_1WithXml;
@Entity 
public class Emp {
	@Id  
    
private int empid;
private String email,name;
private Address address;

@OneToOne(targetEntity=Address.class,cascade=CascadeType.All);





public int getEmpid() {
	return empid;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public void setEmpid(int empid) {
	this.empid = empid;
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
 

}
