package threadsMain;

public class CountingMain {
	public static void main(String[] args) {
		threads.Counting count = threads.Counting.createAndStart("Thread One");
		
		try {
			Thread.sleep(1000); // giving opportunity to Thread One to work
			
			count.mySuspended();
			System.out.println("Thread suspended");
			Thread.sleep(10000);
			
			count.myResume();
			System.out.println("Thread resumed");
			Thread.sleep(10000);
			
			count.mySuspended();
			System.out.println("Thread suspended");
			Thread.sleep(10000);
			
			count.myResume();
			System.out.println("Thread resumed");
			Thread.sleep(10000);
			
			count.mySuspended();
			System.out.println("Thread suspended");
			Thread.sleep(10000);
			count.stop();
			System.out.println("Thread stopped");
		} catch(InterruptedException exc) {
			System.out.println("Main thread interrupted");
		}
		
		try {
			count.thread.join();
		} catch(InterruptedException exc) {
			System.out.println("Main thread interrupted");
		}
	}
}
		