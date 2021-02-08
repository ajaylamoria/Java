import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java_ForEach {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("AJay");
		li.add("Rajiv");
		//li.forEach(action);
		
		Iterator<String> it = li.iterator();
      while(it.hasNext()){
    	  System.out.println(it.next());
      }
      
      li.forEach(new Consumer<String>() {

			public void accept(Integer t) {
				System.out.println("forEach anonymous class Value::"+t);
			}

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				
			}

		});
      
      Consumer<String> action = new MyConsumer();
		li.forEach(action);
      
      
	}

}
