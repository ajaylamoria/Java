package annotation_based;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@Configuration
public class AnnotationConfig {

	
	private Student student;
	
	@Autowired
	private Teacher teacher;
	
	@Bean
	public Student getStudent(){
		return new Student();
	}
	@Bean
	public Teacher getTeacher(){
		return teacher;
	}
	public static void main(String[] args) {
		/*ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
		Student std= (Student) context.getBean("student");
		std.getTeacher().setName("Ajay");
		System.out.println(std.getTeacher().getName());*/
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		Student std = (Student) ctx.getBean(Student.class);
		std.setName("Ajay");
		System.out.println("AJay");

	}

}
