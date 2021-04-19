package Generics;

public class Student<T> {

	T obj;
	
	public Student(T obj) {
		this.obj = obj;
	}
	
	public T display() {
		return this.obj;
	}
}
