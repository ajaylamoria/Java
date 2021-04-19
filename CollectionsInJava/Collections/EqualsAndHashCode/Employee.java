package EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;



public  class Employee  {
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
			return Objects.hash(id,dateOfBirth);
		}
		@Override
		public boolean equals(Object o) {
			if(this==o) {
				return true;
			}
			if(o==null || getClass()!=o.getClass()) {
				return false;
			}
			Employee emp=(Employee)o;
			if((name!=null && emp.getName()!=null && name.equals(emp.getName()))
			 
			  && (salary!=null && emp.getSalary()!=null && salary.equals(emp.getSalary()))) {
				return true;
			}
			return false;
		}
	    
	    
}
