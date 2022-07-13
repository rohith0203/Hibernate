package com.fst.HibernateRough;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
          
        SessionFactory sf=meta.getSessionFactoryBuilder().build();  
       Session session=sf.openSession();
       Transaction ts=session.beginTransaction();
       Employee e1=new Employee();    
       e1.setName("Ravi Malik");    
       e1.setEmail("ravi@gmail.com");    
           
       Address address1=new Address();    
       address1.setAddressLine1("G-21,Lohia nagar");    
       address1.setCity("Ghaziabad");    
       address1.setState("UP");    
       address1.setCountry("India");    
       address1.setPincode(201301);    
           
       e1.setAddress(address1);    
       address1.setEmployee(e1);    
           
       session.persist(e1);    
       ts.commit();    
    }
}
