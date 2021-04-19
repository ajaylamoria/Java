package TreeMap;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public  class Employee implements Comparable<Employee> {
	    private  long id;   
	    private  String name;   
	    private  Date dateOfBirth;    
	    private  BigDecimal salary;
		
	    
	    public Employee(long id,String name,Date dateOfBirth,BigDecimal salary){
	    	this.id = id;
	    	this.name = name;
	    	this.dateOfBirth = dateOfBirth;
	    	this.salary = salary;
	    }
	    
	    
	    
		public long getId() {
			return id;
		}



		public String getName() {
			return name;
		}



		public Date getDateOfBirth() {
			return dateOfBirth;
		}



		public BigDecimal getSalary() {
			return salary;
		}



		@Override
		public int hashCode() {
			return Objects.hash(id,name,dateOfBirth,salary);
		}
		@Override
		public boolean equals(Object o) {
			 if (this == o) return true;        
		        if (o == null || getClass() != o.getClass()) return false;        
		        Employee employee = (Employee) o;        
		        if (id != employee.id) return false;        
		        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;        
		        if (dateOfBirth != null ? !dateOfBirth.equals(employee.dateOfBirth) : employee.dateOfBirth != null) return false;        
		        return salary != null ? salary.equals(employee.salary) : employee.salary == null;   
		}
		@Override
		public int compareTo(Employee o) {
			if(o.id< this.id) {
				return -1;
			}
			if(o.id> this.id) {
				return 1;
			}
			return 0;
		} 
	    
	    
}
