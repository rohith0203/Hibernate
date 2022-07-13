package com.fst.HibernateSample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		System.out.println( "Hello World!" );

		Student data=new Student();
		data.setId(15);
		data.setName("rohit");
		data.setCompany("techouts");
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction ts=session.beginTransaction();
		session.save(data);
		//for fetch the data from database
		Student st = session.get(Student.class,13);
		System.out.println(st);
		ts.commit();
		session.close();
		sf.close();

	}
}
