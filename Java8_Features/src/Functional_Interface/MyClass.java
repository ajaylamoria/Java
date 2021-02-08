package Functional_Interface;

public class MyClass {

	public static void main(String[] args) {
		
		/*Implement Functional Interface Using Lambda Expression*/
		MyInterface my = ()->{
			System.out.println("HI");
		};
		
		/*Implement Functional Interface Using Annonymous Inner Class*/
		/*MyInterface my1 = new MyInterface() {
			
			@Override
			public void display() {
				System.out.println("HI 1");
				
			}
		};*/
		
		//my1.display();
		my.display();
		my.show();
		
		MyInterface.view();

	}

}
