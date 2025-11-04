package manytomany;

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

		Student1 s1 = new Student1();
		s1.setId(1);
		s1.setName("abc");
		s1.setContact(98734153);

		Student1 s2 = new Student1();
		s2.setId(2);
		s2.setName("xyz");
		s2.setContact(789456312);

		Course1 c1 = new Course1();
		c1.setCid(1);
		c1.setCname("java");

		Course1 c2 = new Course1();
		c2.setCid(2);
		c2.setCname("flutter");

		List<Student1> slist = new ArrayList<Student1>();
		slist.add(s1);
		slist.add(s2);

		List<Course1> clist = new ArrayList<Course1>();
		clist.add(c1);
		clist.add(c2);

		s1.setCourses(clist);
		s2.setCourses(clist);

		c1.setStudents(slist);
		c2.setStudents(slist);

		session.save(s1);
		session.save(s2);
		session.save(c1);
		session.save(c2);

		tx.commit();
		session.close();
		sf.close();
	}
}
