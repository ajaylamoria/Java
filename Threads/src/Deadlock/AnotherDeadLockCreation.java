package Deadlock;

import java.util.HashMap;
import java.util.Map;

class Util
{
    // Util class to sleep a thread
    static void sleep(long millis)
    {
        try
        {
            Thread.sleep(millis);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

class Student{
	
	private Integer Id;
	private String name;
	//private Map<Integer,String> map;
	public synchronized Integer getId() {
		System.out.println("ID");
		return Id;
	}
	public synchronized String getName() {
		System.out.println("Name");
		System.out.println(this.getId());
		return name;
	}
	
//	public Student(Integer ID ,String name){
//		
//		map = new HashMap<>();
//		map.put(ID, name);
//	}
//	
//	public synchronized String getName(Integer ID){
//		Util.sleep(1000);
//		return this.map.get(ID);
//	}
//	
//	public synchronized String getIDandName(Integer ID){
//		Util.sleep(1000);
//		String name = this.getName(ID);
//		String IDandName = ID+","+name;
//		System.out.println("ID and Name:- "+IDandName);
//		return IDandName;
//	}
	
	
}

class Thread1 extends Thread{

	Student obj ;
	
	 public Thread1(Student obj) {
		this.obj = obj;
	}
	@Override
	public void run() {
		this.obj.getName();
	}
	
}

class Thread2 extends Thread{
	Student obj ;
	
	 public Thread2(Student obj) {
		this.obj = obj;
	}
	@Override
	public void run() {
		this.obj.getId();
	}
	
}


public class AnotherDeadLockCreation {

	public static void main(String[] args) {
		Student obj = new Student();
	Thread1 th1 = new Thread1(obj);
	th1.start();
	
	Thread2 th2 = new Thread2(obj);
	th2.start();
	}
	
}
