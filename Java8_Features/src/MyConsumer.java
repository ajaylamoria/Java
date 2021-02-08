import java.util.function.Consumer;

public class MyConsumer implements Consumer<String> {

	public void accept(String t) {
		System.out.println("Consumer impl Value::"+t);
	}
}
