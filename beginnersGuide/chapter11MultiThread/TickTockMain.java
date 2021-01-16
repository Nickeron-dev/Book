package threadsMain;

public class TickTockMain {
	public static void main(String[] args) {
		threads.TickTock tickTock = new threads.TickTock();
		threads.TickThread tickThr1 = threads.TickThread.createAndStart("Tick", tickTock);
		threads.TickThread tickThr2 = threads.TickThread.createAndStart("Tock", tickTock);
		//threads.TickThread tickThr1 = new threads.TickThread("Thread One", tickTock);
		//threads.TickThread tickThr2 = new threads.TickThread("Thread Two", tickTock);
		
		
		try {
			tickThr1.thread.join();
			tickThr2.thread.join();
		} catch(InterruptedException exc) {
			System.out.println("Main thread interrupted");
		}
	}
}