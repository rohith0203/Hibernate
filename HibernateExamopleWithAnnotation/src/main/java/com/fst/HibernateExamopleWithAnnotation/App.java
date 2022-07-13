package com.fst.HibernateExamopleWithAnnotation;

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
        
       
        
    Configuration con =new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(StudentDetails.class);
        SessionFactory sf=con.buildSessionFactory();
        Session session = sf.openSession();  
        Transaction t = session.beginTransaction();   
        
        Student data1=new Student();
        
        data1.setName("prashanth garu");
        data1.setCompany("techouts");
        
        StudentDetails data2=new StudentDetails();
        data2.setArea("ECIL");
        data2.setPincode("500042");
        
        data1.setStudentDetails(data2);
        data2.setStudent(data1);
        
        
           session.save(data1);  
            t.commit();  
            System.out.println("successfully saved");    
            sf.close();  
            session.close();   
        
        
        
        
        
    }
}
