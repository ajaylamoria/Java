package Prototype_Pattern;

import java.util.HashMap;
import java.util.Map;

public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Map<String,Integer> map = new HashMap<>();
		map.put("Ajay", 100);
		Map<String,Integer> map2 = new HashMap<>();
		map2.put("Vineet", 300);
		ShallowCopy obj = new ShallowCopy("Ajay", map);
		//obj.setName("Vineet");
		ShallowCopy obj2 = (ShallowCopy) obj.clone();
		obj2.setEmp(map2);
	//	obj2.setName("Ajay");
		System.out.println(obj2.getEmp());
		System.out.print("Shallow Copy-");
		System.out.println(obj==obj2);
		System.out.println(obj.getName()==obj2.getName());
		System.out.println(obj.getEmp()==obj2.getEmp());
		System.out.println("-------------------------------------");
		
		DeepCopy object = new DeepCopy("AJay", map);
		DeepCopy object2 = (DeepCopy) object.clone();
		System.out.print("Deep Copy-");
		System.out.println(object==object2);
		System.out.println(object.getName()==object2.getName());
		System.out.println(object.getMap()==object2.getMap());
	}

}
