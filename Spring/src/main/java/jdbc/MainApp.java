package jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("studentbean.xml");

	      StudentJDBCTemplate studentJDBCTemplate = 
	         (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
	      
	      System.out.println("------Records Creation--------" );
	      studentJDBCTemplate.create(10,"Zara", 11);
	      studentJDBCTemplate.create(20,"Nuha", 2);
	      studentJDBCTemplate.create(30,"Ayan", 15);

	      System.out.println("------Listing Multiple Records--------" );
	      List<Student> students = studentJDBCTemplate.listStudents();
	      
	      for (Student record : students) {
	         System.out.print("ID : " + record.getId() );
	         System.out.print(", Name : " + record.getName() );
	         System.out.println(", Age : " + record.getAge());
	      }

	      System.out.println("----Updating Record with ID = 2 -----" );
	      studentJDBCTemplate.update(10, 20);

	      System.out.println("----Listing Record with ID = 2 -----" );
	      Student student = studentJDBCTemplate.getStudent(20);
	      System.out.print("ID : " + student.getId() );
	      System.out.print(", Name : " + student.getName() );
	      System.out.println(", Age : " + student.getAge());
	      
	    /*  System.out.println("----Listing Record By Procedure-----" );
	      Student stud = studentJDBCTemplate.getStudentByProc(20);
	      System.out.print("ID : " + stud.getId() );
	      System.out.print(", Name : " + stud.getName() );
	      System.out.println(", Age : " + stud.getAge());*/
	      
	      System.out.println("----Listing Record By Function-----" );
	      String name = studentJDBCTemplate.getStudentByFunc(30);
	      System.out.println("Name :-"+name);
	   }

	}


