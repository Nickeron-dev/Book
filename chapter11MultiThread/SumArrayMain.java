package threadsMain;
import threads.MyThreadForSumArray;

public class SumArrayMain {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		
		MyThreadForSumArray mt1 = MyThreadForSumArray.createAndStart("Created thread 1", a);
		MyThreadForSumArray mt2 = MyThreadForSumArray.createAndStart("Created thread 2", a);
		
		try {
			mt1.thread.join();
			mt2.thread.join();
		} catch(InterruptedException exc) {
			System.out.println("Main thread interrupted");
		}
	}
}
