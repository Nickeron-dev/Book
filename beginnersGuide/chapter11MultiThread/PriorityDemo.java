package threadsMain;
import java.io.*;
import threads.Priority;

public class PriorityDemo {
	public static void main(String[] args) {
		Priority mt1 = new Priority("High priority");
		Priority mt2 = new Priority("Low priority");
		Priority mt3 = new Priority("Default priority1");
		Priority mt4 = new Priority("Default priority2");
		Priority mt5 = new Priority("Default priority3");
		PrintWriter pw = new PrintWriter(System.out, true);
		
		mt1.thrd.setPriority(7);
		mt2.thrd.setPriority(3);
		
		// launching
		mt1.thrd.start();
		mt2.thrd.start();
		mt3.thrd.start();
		mt4.thrd.start();
		mt5.thrd.start();
		
		try {
			mt1.thrd.join();
			mt2.thrd.join();
			mt3.thrd.join();
			mt4.thrd.join();
			mt5.thrd.join();
		} catch(InterruptedException exc) {
			System.out.println("Main thread interrupted");
		}
		
		pw.println("High priority counter: " + mt1.count);
		pw.println("Low priority counter: " + mt2.count);
		pw.println("Default priority1 counter: " + mt3.count);
		pw.println("Default priority2 counter: " + mt4.count);
		pw.println("Default priority3 counter: " + mt5.count);
	}
}
	