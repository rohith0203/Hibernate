package com.fst.Hibernate1_MWithAnnotation;

import java.util.HashSet;
import java.util.Set;

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
    	Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Category.class).addAnnotatedClass(Product.class);
		SessionFactory factory = con.buildSessionFactory();
		Category category = new Category("Cricket");

		Product bat = new Product("SG", "heavy and thinlayer", 2500, category);

		Product ball = new Product("kukaburra", "Round-in-shape and Hard", 500, category);

		Product stumps = new Product("SS", "lightweight and comfortable", 400, category);

		Product gloves = new Product("New Balance", "Handshape but swet", 350, category);

		Set<Product> products = new HashSet<Product>();
		products.add(bat);
		products.add(ball);
		products.add(stumps);
		products.add(gloves);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		category.setProducts(products);

		session.save(category);

		session.getTransaction().commit();
		session.close();   
    }
}
