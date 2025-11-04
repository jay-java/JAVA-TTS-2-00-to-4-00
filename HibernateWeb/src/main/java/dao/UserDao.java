package dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.User;

public class UserDao {
	SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session = sf.openSession();
	Transaction tx = session.beginTransaction();

	public void insertUser(User u) {
		session.save(u);

		tx.commit();
		session.close();
		sf.close();
	}
	
}
