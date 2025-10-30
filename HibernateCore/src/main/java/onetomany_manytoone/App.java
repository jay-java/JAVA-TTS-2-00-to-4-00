package onetomany_manytoone;

import java.util.ArrayList;
import java.util.List;

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

		Students s1 = new Students();
		s1.setSid(1);
		s1.setName("abc");

		Courses c1 = new Courses();
		c1.setCid(1);
		c1.setCname("java");

		Courses c2 = new Courses();
		c2.setCid(2);
		c2.setCname("flutter");

		List<Courses> courses = new ArrayList<Courses>();
		courses.add(c1);
		courses.add(c2);

		s1.setCourses(courses);
		c1.setStudent(s1);
		c2.setStudent(s1);

		session.save(s1);
		session.save(c1);
		session.save(c2);

		tx.commit();
		session.close();
		sf.close();
	}
}
