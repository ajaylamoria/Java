package RaceCondition;

public class TrainTicketWithoutSync extends Thread{

	private int ticketAvailable = 1;
	@Override
	public void run() {
		System.out.println("Avaliable Tickets Before booking: "+ticketAvailable);
		if(ticketAvailable > 0){
			
			try {
				Thread.sleep(500);
				System.out.println("Ticket Booked For Passenger:-"+Thread.currentThread().getName());
				ticketAvailable--;
				System.out.println("Avaliable Tickets after booking: "+ticketAvailable);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			System.out.println("Ticket Not Booket For Passenger:-"+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		TrainTicketWithoutSync object = new TrainTicketWithoutSync();
		Thread thread1 = new Thread(object,"Passenger Thread 1");
		thread1.start();
		
		Thread thread2 = new Thread(object,"Passenger Thread 2");
		thread2.start();
		thread1.join();
	}
	
}
