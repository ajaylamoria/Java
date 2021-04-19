package Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class StackTest {

	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.pop();
		System.out.println(stack.peek());
		
		Queue q = new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		System.out.println(q.poll());

	}

}
