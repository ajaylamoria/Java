package HashMap;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class EqualAndHashCodeTest {

	public static void main(String[] args) {
		 HashMap<Employee,String> employeeMap = new HashMap<Employee,String>();  
		Employee employee1 = new Employee(1,"Sachin",new Date(1987,2,1),new BigDecimal(100000));    
	   /* employee1.setId(1);    
	    employee1.setName("Sachin");    
	    employee1.setDateOfBirth(new Date(1987,2,1));    
	    employee1.setSalary(new BigDecimal(100000));    */

	    employeeMap.put(employee1,"India");  
	    System.out.println(employee1.hashCode());   //-1763880846

	 // Some Business logic    
	    // In the second Operation I am updating the same employee with the newly initailized Employee Object

	   Employee employee2 = new Employee(1,"Sachin",new Date(1987,2,1),new BigDecimal(100000));    
	   /* employee2.setId(1);    
	    employee2.setName("Sachin");    
	    employee2.setDateOfBirth(new Date(1987,2,1));    
	    employee2.setSalary(new BigDecimal(100000));  */

	    // Here we wanted to update the same Employee to Japan
	    employeeMap.put(employee2,"Japan");  
	    
	    System.out.println(employee2.hashCode());   // It generates same hashcode as employee1
	    
	   System.out.println(employeeMap.get(employee2)); 
	    
	  // employee2.setName("Rahul");
	   Employee employee3 = new Employee(1,"Rahul",new Date(1987,2,1),new BigDecimal(100000)); 
	   employeeMap.put(employee3,"Japan");  
	   System.out.println(employee2.hashCode());
	   System.out.println(employeeMap.get(employee2));   // returns null becs employee2 has got different bucket due to different hashcode
	   System.out.println(employeeMap);
	   
//---------------------------------------------------Mutable--------------------------------------------------------------------------------
	    
	 /*   for (Map.Entry<Employee, String> employeeStringEntry : employeeMap.entrySet()) {
	        System.out.println(employeeStringEntry.getKey().hashCode());   
	    }
	    // Step 2
	    // Mutating the Employee Object
	    employee1.setName("Rahul");    

	    for (Map.Entry<Employee, String> employeeStringEntry : employeeMap.entrySet()) {
	        System.out.println(employeeStringEntry.getKey().hashCode());    
	    }
	    
	    System.out.println(employeeMap.get(employee1));*/    
	}

}
