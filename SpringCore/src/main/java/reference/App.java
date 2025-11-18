package reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("reference/reference.xml");
		User u1 = (User) con.getBean("u1");
		System.out.println(u1);
	}

}
