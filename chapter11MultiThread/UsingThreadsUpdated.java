package threadsMain;
import threads.MyThreadUpdated;

public class UsingThreadsUpdated {
	public static void main(String[] args) {
		MyThreadUpdated mt1 = MyThreadUpdated.createAndStart("MyFirst thread");
		MyThreadUpdated mt2 = MyThreadUpdated.createAndStart("MySecond thread");
		MyThreadUpdated mt3 = MyThreadUpdated.createAndStart("MyThird thread");
		
		do {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch(InterruptedException exc) {
				System.out.println("Dot interrupted");
			}
		} while(mt1.thread.isAlive() == true |
			   mt2.thread.isAlive() == true |
			   mt3.thread.isAlive() == true);
		System.out.println("Ended main process");
	}
}