package Static_Method;

public interface Interface1 {

	static void display(){
		System.out.println("Static Method in Interface");
	}
	
	static int sum(int a,int b){
		return a+b;
	}
}
