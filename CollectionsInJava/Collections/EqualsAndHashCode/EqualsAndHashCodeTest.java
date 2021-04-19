package EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;



public class EqualsAndHashCodeTest {

	public static void main(String[] args) {
		Employee employee1 = new Employee(1,"Sachin",new Date(1987,2,1),new BigDecimal(100000));
		Employee employee2 = new Employee(1,"Sachin",new Date(1987,2,1),new BigDecimal(100000));
		
		System.out.println(employee1.equals(employee2));
		System.out.println(employee1.hashCode());
		System.out.println(employee2.hashCode());
		System.out.println(employee1==employee2);
		
		
		String s = new String();
		String s2 = new String();
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		
		String s3 ="AJay";
		String s4 ="AJay";
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));

	}

}
