package threadsMain;

public class UsingThreads {
	public static void main(String[] args) {
		// Creating obj Runnable
		threads.MyThread mt = new threads.MyThread("My first thread");
		// form Runnable to Thread
		Thread thread = new Thread(mt);
		// starting thread
		thread.start();
		for(int i = 0; i < 50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch(InterruptedException exc) {
				System.out.println("Interrupted");
			} 
		}
		System.out.println("Process of main thread ended");
	}
}
				