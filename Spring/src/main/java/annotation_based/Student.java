package annotation_based;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(){
		System.out.println("Inside Student Constructor");
	}
	
    



}
