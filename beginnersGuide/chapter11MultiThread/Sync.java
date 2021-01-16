package threadsMain;
import java.io.*;

public class Sync {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		int[] array = {1, 2, 3, 4 ,5};
		threads.MyThreadForSumArrayUp thread1 = threads.MyThreadForSumArrayUp.createAndStart("Created thread #1", array);
		threads.MyThreadForSumArrayUp thread2 = threads.MyThreadForSumArrayUp.createAndStart("Created thread #2", array);
		
		try {
			thread1.thread.join();
			thread2.thread.join();
		} catch (InterruptedException exc) {
			pw.println("Main thread interrupted");
		}
	}
}
		