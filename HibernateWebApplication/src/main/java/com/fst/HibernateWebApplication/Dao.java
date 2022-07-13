package com.fst.HibernateWebApplication;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Dao {
	//public SessionFactory sf;
	
	public  void insert(Pojo obj) {
		String i="";
		Configuration con = new Configuration().configure().addAnnotatedClass(Pojo.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		session.save(obj) ;
		tr.commit();
		session.close();
		
		}

		public List<Pojo> showRegisterDetails() {
		List<Pojo> list = new ArrayList<Pojo>();
		Configuration con = new Configuration().configure().addAnnotatedClass(Pojo.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		TypedQuery query=session.createQuery("from Pojo");    
	    list=query.getResultList();   

		tr.commit();
		session.close();
		return list;
		}
}
