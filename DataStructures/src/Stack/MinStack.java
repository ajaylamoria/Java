package Stack;

import java.util.ArrayList;
import java.util.List;

public class MinStack {
	
		   List<Integer> arr;
		   List<Integer> arr2;
		    int size;
		    int top;
		    int top2;
		    
		    /** initialize your data structure here. */
		    public MinStack() {
		        this.arr = new ArrayList<>();
		        this.arr2 = new ArrayList<>();
		        this.size=size;
		        this.top=0;
		        this.top2=0;
		    }
		    
		    public void push(int x) {
		        if(this.arr.size()-1==this.top){
		            System.out.println("Stack is Full");
		        }else{
		            if(this.arr2.isEmpty()){
		                this.arr2.add(x);
		                this.top2 = this.top2+1;
		                this.arr.add(x);
		                this.top = this.top+1;
		            }
		            else{
		            if(x<= this.arr2.get(this.top2-1)){
		                this.arr2.add(x);
		                this.top2 = this.top2+1;
		                this.arr.add(x);
		                this.top = this.top+1;
		            }else{
		                this.arr.add(x);
		                this.top = this.top+1;
		            }
		            }
		        
		    }
		    }  
		    public void pop() {
		        if(this.top==0){
		            System.out.println("Stack is Empty"); 
		        }else{
		        	if(this.arr.get(this.top-1).equals(this.arr2.get(this.top2-1))){
		        		this.arr2.remove(this.top2-1);
		        		this.top2 = this.top2-1;
		        	}
		            this.arr.remove(this.top-1);
		            this.top = this.top-1;
		        }
		    }
		    
		    public int top() {
		    	if(this.arr.isEmpty()){
		    	System.out.println("Stack is Empty");
		    	return 0;
		    	}
		        return this.arr.get(this.top-1);
		    }
		    
		    public int getMin() {
		    	if(this.arr.isEmpty()){
			    	System.out.println("Stack is Empty");
			    	return 0;
			    	}
		        return this.arr2.get(this.top2-1);
		    }
		

		public static void main(String[] args) {
			MinStack minStack = new MinStack();
			minStack.push(512);
			minStack.push(-1024);
			minStack.push(-1024);
			minStack.push(512);
			minStack.pop();
			System.out.println(minStack.getMin()); // return -3
			minStack.pop();
			System.out.println(minStack.getMin());
			minStack.pop();
			System.out.println(minStack.getMin());
		}
		
		 
}
