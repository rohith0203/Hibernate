package com.fst.Hibernate1_MWithAnnotation;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {
public static void main(String[] args) {
	
	Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Category.class).addAnnotatedClass(Product.class);
	
	SessionFactory sf=con.buildSessionFactory();
	Session session=sf.openSession();
	
	
	TypedQuery<Category>query=session.createQuery("from Category");
	List<Category>list=query.getResultList();
	
	for(Category obj:list)
	{
		String info=obj.getId()+" "+obj.getName();
		
		List<Product> p=obj.getProducts();
		info+=((Product) p).getDescription()+" "+((Product) p).getName()+" "+((Product) p).getPrice();
		System.out.println(info);
		
		
}
	
//	Iterator<Category>itr=list.iterator();
//	
//	while(itr.hasNext())
//	{
//		Category c=itr.next();
//		System.out.println(c.getId()+" "+c.getName()+"\n");
//		
//		List<Product>list2=(List<Product>) c.getProducts();
//		Iterator<Product> itr2=list2.iterator();    
//	       while(itr2.hasNext())  
//	       {  
//	        Product a=itr2.next();  
//	            System.out.println(a.getId()+" "+a.getDescription()+" "+a.getPrice()+" "+a.getName());  
//	        }    
//		
//		
//	}
		
		
		
		
		
	
	
	
	
	
}
}
