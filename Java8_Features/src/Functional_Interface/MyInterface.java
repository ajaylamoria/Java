package Functional_Interface;
@FunctionalInterface
public interface MyInterface {

	public void display();
	public boolean equals(Object obj);
	 default void show(){
			System.out.println("Default method in INterface1");
			
		}
	 
	 static void view(){
			System.out.println("Static Method in Interface");
		}
	
	
}
