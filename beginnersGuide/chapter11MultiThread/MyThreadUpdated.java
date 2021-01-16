package threads;

public class MyThreadUpdated implements Runnable {
	public Thread thread;
	
	public MyThreadUpdated(String name) {
		thread = new Thread(this, name);
	}
	
	public static MyThreadUpdated createAndStart(String name) {
		MyThreadUpdated mtu = new MyThreadUpdated(name);
		
		mtu.thread.start();
		return mtu;
	}
	
	public static void createAndStartNew(String name) {
		MyThreadUpdated mtu = new MyThreadUpdated(name);
		
		mtu.thread.start();
	}
	
	public void run() {
		System.out.println(thread.getName());
		try {
			for(int i = 0; i < 10; i++) {
				Thread.sleep(400);
				System.out.println("Counter: " + i);
			}
		} catch (InterruptedException exc) {
			System.out.println(thread.getName() + " iterrupted");
		}
	}
}			