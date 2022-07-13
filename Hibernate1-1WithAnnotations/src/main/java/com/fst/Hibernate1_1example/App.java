package com.fst.Hibernate1_1example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args)
	{

		Configuration con=new Configuration().configure("com/fst/Hibernate1_1example/hibernate.cfg.xml").addAnnotatedClass(Person.class).addAnnotatedClass(PersonDetail.class);  
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction ts=session.beginTransaction();

		Person pdata=new Person();


		//2nd obj
		Person p=new Person();
		p.setName("babu");
		p.setEmail("p@gmail.com");

		Person p1=new Person();
		p1.setName("Rohith");
		p1.setEmail("R@gmail.com");
		
		PersonDetail pd1=new PersonDetail();
		pd1.setAddress("Ecil");
		pd1.setPincode("300042");
		
		p1.setPersonDetail(pd1);//222222222222222222222
		pd1.setPerson(p1);
		session.save(p1);
		


		//2nd obj
		PersonDetail pd=new PersonDetail();
		pd.setAddress("Ecil");
		pd.setPincode("300042");
		
		


		p.setPersonDetail(pd);//222222222222222222222
		pd.setPerson(p);
		session.save(p);

		ts.commit();
		session.close();
		sf.close();

	}
}
