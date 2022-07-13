package com.fst.HibernateM_MWithAnnotation;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Groups {
      @Id
      @GeneratedValue
      @Column(name = "GROUP_ID")
	private int id;
	private String gname;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
            name = "USERS_GROUPS",
            joinColumns = @JoinColumn(name = "GROUP_ID"),
            inverseJoinColumns = @JoinColumn(name = "USER_ID")
    )
	private List<Users>users;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getGname() {
		return gname;
	}


	public void setGname(String gname) {
		this.gname = gname;
	}


	public List<Users> getUsers() {
		return users;
	}


	public void setUsers(List<Users> users) {
		this.users = users;
	}
	
	
	
	
}
