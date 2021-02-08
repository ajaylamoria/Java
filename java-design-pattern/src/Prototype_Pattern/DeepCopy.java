package Prototype_Pattern;

import java.util.HashMap;
import java.util.Map;

public class DeepCopy implements Cloneable{

	private String name;
	private Map<String,Integer> map;
	
	DeepCopy(String name, Map<String,Integer> map){
		 this.name = name;
		 this.map = map;
	}
	
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Map<String,Integer> newMap = new HashMap<>();
		map.forEach((x,y)->{newMap.put(x, y);
	
		});
		
		DeepCopy obj = new DeepCopy(new String(name), newMap);
		return obj;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}
	
	
}
