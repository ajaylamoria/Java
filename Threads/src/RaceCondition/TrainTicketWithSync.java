package RaceCondition;

public class TrainTicketWithSync extends Thread{

	private int ticketAvailable = 1;
	@Override
	public void run() {
		System.out.println("Avaliable Tickets Before booking: "+ticketAvailable);
		synchronized (this) {
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
				System.out.println("Ticket Not Booked For Passenger:-"+Thread.currentThread().getName());
			}
		}
		
	}

	public static void main(String[] args) {
		TrainTicketWithSync object = new TrainTicketWithSync();
		Thread thread1 = new Thread(object,"Passenger Thread 1");
		thread1.start();
		Thread thread2 = new Thread(object,"Passenger Thread 2");
		thread2.start();
	}
	
}
