package Prototype_Pattern;

public class Employee1 implements Cloneable {

	private String name;
	  private Integer age;
	  private EmployeeAddress empAddress;
	  public EmployeeAddress getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(EmployeeAddress empAddress) {
		this.empAddress = empAddress;
	}

	//Employee constructor
	  public Employee1(String name, Integer age, EmployeeAddress empAddress) {
	    this.name = name;
	    this.age = age;
	    this.empAddress = empAddress;
	  }
	 
	  //setters and getters for name, age and empAddress go here
	 
	  public String toString(){
	    return "Employee Name:"+this.name
	        +"  Age:"+this.age
	        +" Address:"+empAddress;
	   }
	 
	  @Override
	  public boolean equals(Object obj) {
	    if (obj == this) {
	      return true;
	    }
	    if (!(obj instanceof Employee1)) {
	      return false;
	    }
	    Employee1 empObj = (Employee1) obj;
	    return this.age == empObj.age
	        && this.name.equalsIgnoreCase(empObj.name);
	  }
	  @Override
	  public Object clone() throws CloneNotSupportedException{
	    return super.clone();
	  }
}
