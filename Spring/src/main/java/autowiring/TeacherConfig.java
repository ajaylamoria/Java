package autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherConfig {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
		Teacher obj = (Teacher) context.getBean("teacher");
		System.out.println();

	}

}
