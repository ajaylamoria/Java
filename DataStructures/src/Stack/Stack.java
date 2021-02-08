package Stack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stack {

	private List<Integer> arr;
	private int top;
	private int size;
	
	public Stack(int size){
	  arr= new ArrayList<>(size);
	  this.top = 0;
	  this.size = size;
	}
	
	public void push(int data){
		if(this.size==this.top){
			System.out.println("Stack is Full");
		}else{
			this.arr.add(data);
			this.top=this.top+1;
		}
	}
	
	public void pop(){
		this.arr.set
		if(this.arr.size()==0){
			System.out.println("Stack is Empty");
		}else{
			this.arr.remove(top-1);
			this.top = top-1;
		}
	}
	
	public void display(){
		Iterator<Integer> itr = this.arr.iterator();
		while(itr.hasNext()){
			System.out.println(" "+itr.next());
		}
	}
	
	
	public static void main(String[] args) {
		Stack stack = new Stack(4);
		stack.pop();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.display();
		stack.pop();
	}
}
