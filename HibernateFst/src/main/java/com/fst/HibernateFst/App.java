package com.fst.HibernateFst;

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
    	
    Emp e=new Emp();
    e.setId(12);
    e.setName("rohith");
    e.setCompany("techouts");
    
    Configuration cfg=new Configuration().configure().addAnnotatedClass(Emp.class);
    SessionFactory sf=cfg.buildSessionFactory();
    
    	Session session=sf.openSession();
    Transaction ts=session.beginTransaction();
    	session.save(e);
    	 	ts.commit();
    	
    	
//        System.out.println( "start" );
//        Configuration cfg=new Configuration();
//        cfg.configure("hibernate.cfg.xml");
//        SessionFactory factory=cfg.buildSessionFactory();
//        System.out.println(factory);
    }
}
