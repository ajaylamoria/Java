package Default_Method;

public class TestBothInterface implements Interface1,Interface2 {    // NOTE:- if both interface has same method then it will give compilation error 
                                                                     //         then we have to override default methods    
	public static void main(String[] args) {
		TestBothInterface obj = new TestBothInterface();
		obj.display();

	}

	@Override
	public void display() {
		System.out.println("Default method in Class");
       Interface1.super.display();
//		Interface2.super.display();
       
       Interface1 obj = new Interface1() {

		@Override
		public void show() {
			// TODO Auto-generated method stub
			
		}
    	   
	};
	
	obj.show();
	}


}
