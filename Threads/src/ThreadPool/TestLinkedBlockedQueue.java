package ThreadPool;

public class TestLinkedBlockedQueue {

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(2);

		//queue.take();
		queue.put(10);
		queue.put(20);
		//queue.put(30);
		System.out.println(queue.size());
		queue.take();
		queue.take();
		queue.take();
	}

}
