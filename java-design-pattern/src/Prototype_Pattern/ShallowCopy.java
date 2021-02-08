package Prototype_Pattern;

import java.util.Map;

public class ShallowCopy implements Cloneable {

	private String name;
	private Map<String,Integer> emp;
	
	
	
	
	
	ShallowCopy(String name,Map<String,Integer> emp){
		this.name = name;
		this.emp =emp;
		
	}
	
	
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}




	public void setName(String name) {
		this.name = name;
	}


	public void setEmp(Map<String, Integer> emp) {
		this.emp = emp;
	}


	public String getName() {
		return name;
	}
	
	public Map<String, Integer> getEmp() {
		return emp;
	}
	
	
}
