package Generics;

public class StudentTest {

	public static void main(String[] args) {
		Student<Integer> obj = new Student<Integer>(new Integer(10));
		Integer value = obj.display();
		System.out.println(value);
		
		Student<String> obj2 = new Student<String>(new String("AJay"));
		String val = obj2.display();
		System.out.println(val);

	}

}
