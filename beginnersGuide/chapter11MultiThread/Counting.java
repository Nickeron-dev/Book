package threads;

public class Counting implements Runnable {
	public Thread thread;
	public boolean suspended;
	public boolean stopped;
	
	public Counting(String name) {
		thread = new Thread(this, name);
		suspended = false;
		stopped = false;
	}
	
	public static Counting createAndStart(String name) {
		Counting count = new Counting(name);
		count.thread.start();
		return count;
	}
	
	public void run() {
		System.out.println("Starting thread");
		try {
			for(int i = 1; i < 1000; i++) {
				System.out.print(i + " ");
				Thread.sleep(100);
				if(i % 10 == 0) {
					System.out.println();
					Thread.sleep(2500);
				}
				synchronized(this) {
					while(suspended) {
						wait();
					}
					if(stopped) break;
				}
			}
		} catch(InterruptedException exc) {
			System.out.println("Thread interrupted");
		}
		System.out.println(thread.getName() + " exit");
	}
	
	synchronized public void mySuspended() {
		suspended = true;
	}
	
	synchronized public void myResume() {
		suspended = false;
		notify();
	}
	
	synchronized public void stop() {
		stopped = true;
		
		// stoping suspended thread
		suspended = false;
		notify();
	}
}