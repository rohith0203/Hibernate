package com.fst.Hibernate1_1example;


import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.build.AllowSysOut;


public class Fetch {
public static void main(String[] args) {
	
	Configuration con=new Configuration().configure("com/fst/Hibernate1_1example/hibernate.cfg.xml").addAnnotatedClass(Person.class).addAnnotatedClass(PersonDetail.class);
	SessionFactory sf=con.buildSessionFactory();
	Session session=sf.openSession();
	
	
	
	TypedQuery<Person>query=session.createQuery("update Person set name=:n where personid=:i");
	query.setParameter("n", "koma");
	query.setParameter("i", 5);
	
//	query.setFirstResult(2);  
//	query.setMaxResults(4);  
	List<Person>list=query.getResultList();
	
//	11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111
//	Iterator<Person>itr=list.iterator();
//	
//	while(itr.hasNext())
//	{
//		Person per=itr.next();
//		System.out.println(per.getPersonid()+" "+per.getName()+" "+per.getEmail());
//		PersonDetail perd=per.getPersonDetail();
//		System.out.println(perd.getPersondetailsId()+" "+perd.getPincode()+" "+perd.getAddress());
//	}
//	
	for(Person obj:list)
	{
		String  info=obj.getPersonid()+" "+obj.getName()+" "+obj.getEmail()+" "+"\n";
		PersonDetail obj2=obj.getPersonDetail();
		info+=obj2.getPersondetailsId()+" "+obj2.getAddress()+" "+obj2.getPincode();
		
			
			System.out.println(info);
				
				
			
				
			
//				
			
				
				
	}
	
	
	
	session.close();
	System.out.println("sucess");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
