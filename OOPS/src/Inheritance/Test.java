package Inheritance;


class A{
	
	static {
		System.out.println("static a");
	}
	
	
	
	public A() {
		System.out.println("const a");
	}
	{
		System.out.println("init a");
	}
}

class B extends A{
	static {
		System.out.println("static b");
	}
	
	{
		System.out.println("init b");
	}
	
	public B() {
		System.out.println("const b");
	}
}

public class Test {

	public static void main(String[] args) {
	//	B obj = new B();
		
		final StringBuilder obj = new StringBuilder("Hello-");
		//obj.append("world");
		System.out.println(obj.toString());

	}

}
