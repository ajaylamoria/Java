package AOP_ANNOTATION;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("C:/Boeing Docs/my development/Ajay_Daily work book/New folder/workspace/src/main/java/AOP_ANNOTATION/Beans4.xml");
	      
	      Student student = (Student) context.getBean("student");
	      student.getName();
	      student.getAge();
	      
	     student.printThrowException();

	}

}
