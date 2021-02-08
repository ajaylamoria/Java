import java.util.ArrayList;

public class ArrayListCompare {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		Student s1 = new Student();
	      list1.add("Jasasa");
	      list1.add("Javaasw2");
	      list1.add("WebG23L");
	      list1.add("OpenCV2323");
	      ArrayList<String> list2 = new ArrayList<String>();
	      list2.add("JavaFx");
	      list2.add("Java");
	      list2.add("WebGL");
	      list2.add("OpenCV");
	      System.out.println(list1);
	      list1= list2;
	      System.out.println(list1);
	      System.out.println(list1.equals(list2));

	}

}
