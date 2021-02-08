package Default_Method;

public interface Interface1 {

	//public void show();
//	 default String show(String a , String b){
//		return "Ajay";
//	}
	 public void show();
	 default void display(){
			System.out.println("Default method in INterface1");
			
		}
}
