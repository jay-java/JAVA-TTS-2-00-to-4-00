package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		SessionFactory sf = new Configuration().configure("com/hibernate/hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		User u = new User(3, "dart", "xyz", 98765321, "dart@gmail.com");
		session.save(u);

//		User u = (User) session.get(User.class, 1);
//		System.out.println(u);
		
//		
//		User u = new User(2, "python", "delhi", 98765321, "java@gmail.com");
//		session.update(u);
		
		
		tx.commit();	
		session.close();
		sf.close();
	}
}
