package Prototype_Pattern;

public class CloningInJava {

	public static void main(String args[]){
	    EmployeeAddress empAddress=new EmployeeAddress("22","Avenue Street", "Dallas");
	    Employee1 emp=new Employee1("David", 32,empAddress);
	    Employee1 empClone=null;
	    try {
	      empClone=(Employee1) emp.clone();
	      EmployeeAddress empAddress1=new EmployeeAddress("2111","TTTTT Street", "Seattle");
	      empClone.setEmpAddress(empAddress1);
	    }catch(CloneNotSupportedException cnse){
	      cnse.printStackTrace();
	    }
	 
	    System.out.println("Cloned Employee Object: "+empClone);
	    System.out.println(emp);
	  }
}
