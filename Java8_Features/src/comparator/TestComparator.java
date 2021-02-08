package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestComparator {

	public static void main(String[] args) {
		Student std = new Student(10, "Sumit");
		Student std1 = new Student(50, "AJay");
		Student std2 = new Student(20, "Amit");
		
		Student std4 = new Student(60, "Rahul");
		Student std3 = new Student(30, "Rahul");
		//Student std6 = new Student(30, null);
		List<Student> list = new ArrayList<>();
		list.add(std1);
		list.add(std2);
		
		list.add(std);
		list.add(std4);
		list.add(std3);
		//list.add(std6);
		
		Collections.sort(list,new StudentComparator());
		list.forEach(System.out::println);
		
		
		/*Java 8 Comparator  :- It is a functional Interface and it has only one abstract method compare()
		 * https://www.javabrahman.com/java-8/the-complete-java-8-comparator-tutorial-with-examples/*/
		System.out.println("Java 8 Comparator");
		Comparator<Student> compare = (Student obj1,Student obj2)->{
			return obj1.getName().compareTo(obj2.getName());
		};
		Collections.sort(list,compare);
		list.forEach(System.out::println);
		
		/*comparing()*/
		System.out.println("Java 8 Comparing");
		Comparator<Student> compareObj = Comparator.comparing(Student::getName);
		Collections.sort(list,compareObj);
		list.forEach(System.out::println);
		
		
		/*thenComparing()*/
		System.out.println("thenComparing Method");
		Comparator<Student> compareObj2 = Comparator.comparing(Student::getName).thenComparing(Student::getId);
		Collections.sort(list,compareObj2);
		list.forEach(System.out::println);
		
		/*naturalOrder()*/
		System.out.println("NaturalOrdering Method");
		List<String> names = list.stream().map(Student::getName).collect(Collectors.toList());
		names.sort(Comparator.naturalOrder());
		names.forEach(System.out::println);
		names.sort(Comparator.reverseOrder());
		System.out.println("Reverse Order");
		names.forEach(System.out::println);
		
		/*nullFirst() & nullLast()*/
		Student std5 = new Student(30, null);
		list.add(std5);
		System.out.println("nullFirst Method");
		Comparator<Student> compareObj3 = Comparator.comparing(Student::getName,Comparator.nullsFirst(String::compareTo));
		Collections.sort(list,compareObj3);
		list.forEach(System.out::println);
		
		System.out.println("reversed Method");
		list.remove(std5);  // Otherwise it will throw nullpointerexception
		Comparator<Student> compareObj4 = Comparator.comparing(Student::getName).reversed();
		Collections.sort(list,compareObj4);
		list.forEach(System.out::println);
	}

	
	
}
