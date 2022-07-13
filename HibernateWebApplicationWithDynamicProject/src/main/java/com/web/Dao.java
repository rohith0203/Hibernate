package com.web;

import java.lang.module.Configuration;

public class Dao {    
	    
	public static void register(Pojo u){    
	   
	  
	 Configuration con=new Configuration().configure("hibernate.cfg.xml");  
	  
	SessionFactory factory = con.getSessionFactoryBuilder().build();  
	Session session = factory.openSession();  
	Transaction t = session.beginTransaction();   
	  

	  
	t.commit();    
	session.close();    
	    
	   
	   
	 }    
	}    

