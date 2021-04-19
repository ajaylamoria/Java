package TreeMap;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;



public class CustomObjectTreeMap {

	private static Map<Employee, String> map;

	public static void main(String[] args) {
		Map<Employee,String> map = new TreeMap<>();
		Employee employee1 = new Employee(4,"Sachin",new Date(1987,2,1),new BigDecimal(100000)); 
		Employee employee2 = new Employee(2,"Amit",new Date(1987,2,1),new BigDecimal(100000)); 
		Employee employee3 = new Employee(3,"Rahul",new Date(1987,2,1),new BigDecimal(100000)); 
		
		map.put(employee1, "First");
		map.put(employee2, "Second");
		map.put(employee3, "Third");
		System.out.println(map);
		
		Map<String,String> map2 = new TreeMap<>();
		map2.put("Suresh","100");
		map2.put("Ajay","100");
		map2.put("Dinesh","100");
		System.out.println(map2);
		
		Map<Employee,String> map3 = new TreeMap<>(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.getId()<o2.getId()) {
					return -1;
				}
				if(o1.getId()>o2.getId()) {
					return 1;
				}
				return 0;
			}
			
		});
		
		map3.put(employee1, "First");
		map3.put(employee2, "Second");
		map3.put(employee3, "Third");
		System.out.println(map3);
	}

}
