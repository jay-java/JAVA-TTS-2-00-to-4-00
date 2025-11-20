package bean_lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext con = new ClassPathXmlApplicationContext("bean_lifecycle/lifecycle.xml");
		User u1 = (User) con.getBean("u1");
		System.out.println(u1);

		Student s1 = (Student) con.getBean("s1");
		System.out.println(s1);

		Employee e1 = (Employee) con.getBean("e1");
		System.out.println(e1);

		con.registerShutdownHook();
	}
}
