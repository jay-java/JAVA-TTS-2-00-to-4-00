package onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Student s1 = new Student();
		s1.setId(1);
		s1.setName("abc");
		s1.setAddres("ahmedabad");	

		Student s2 = new Student();
		s2.setId(2);
		s2.setName("xyz");
		s2.setAddres("delhi");

		Course c1 = new Course();
		c1.setCid(1);
		c1.setCname("java");
		c1.setCduration("5 months");
		c1.setFees(10000);

		Course c2 = new Course();
		c2.setCid(2);
		c2.setCname("flutter");
		c2.setCduration("5 months");
		c2.setFees(10000);

		s1.setCid(c2);
		s2.setCid(c1);

		c1.setSid(s2);
		c2.setSid(s1);

		session.save(s1);
		session.save(s2);
		session.save(c1);
		session.save(c2);

		tx.commit();
		session.close();
		sf.close();
	}
}
