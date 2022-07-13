package com.fst.HibernateCrud;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public SessionFactory sf;
	public void Connection()
	{
		
			Configuration con=new Configuration().configure().addAnnotatedClass(Pojo.class);
			this.sf=con.buildSessionFactory();
			System.out.println("connection is created");
		
	}
	public void over()
	{
		sf.close();
		System.out.println("closed");
	}
	
	public void insert()
	{
		Session session=sf.openSession();
		Transaction ts=session.beginTransaction();
	//	session.setFlushMode(FlushMode.MANUAL);
		Pojo pojo=new Pojo();
		pojo.setName("rohith");
		session.save(pojo);
		
		ts.commit();
		session.close();
		System.out.println("sucessfully inserted");
	}
	
	public void update()
	{
		Session session=sf.openSession();
 		Transaction ts=session.beginTransaction();

             Query query=session.createQuery("update Pojo set name=:n where id=:i");
             query.setParameter("i",1);
             query.setParameter("n","srinuuu");
            query.executeUpdate();
             ts.commit();
             session.close();
             System.out.println("after updated:");
	}
	public void select()
	{
		Session session=sf.openSession();
 		Transaction ts=session.beginTransaction();

		TypedQuery query=session.createQuery("from Pojo");    
	    List<Pojo> list=query.getResultList(); 
        for(Pojo p:list)
        {
        	System.out.println(p.getId()+" "+p.getName());
        }
        ts.commit();
        session.close();
	}
	public void delete()
	{
		Session session=sf.openSession();
		Transaction ts=session.beginTransaction();

        Query query=session.createQuery("delete from Pojo where id=2");
        query.executeUpdate();
       ts.commit();
        session.close();
        System.out.println("sucessfully deleted");
        
	}
    public static void main( String[] args )
    {
       App obj=new App();
       obj.Connection();
//       obj.insert();
//       obj.select();
       //obj.update();
       //obj.delete();
       //obj.select();
       
    }
}
