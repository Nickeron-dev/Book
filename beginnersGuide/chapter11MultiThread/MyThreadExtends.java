package threads;

// expend Thread
public class MyThreadExtends extends Thread {
	public MyThreadExtends(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println(getName() + "is starting");
		try {
			for(int i = 0; i < 10; i++) {
				Thread.sleep(400);
				System.out.println("counter: " + i);
			}
		} catch(InterruptedException exc) {
			System.out.println("Thread " + getName() + " was interrupted");
		}
		System.out.println("Thread" + getName() + " ended process");
	}
	
	// creating fabric method
	public static MyThreadExtends createAndStart(String name) {
		MyThreadExtends mte = new MyThreadExtends(name);
		mte.start();
		return mte;
	}
}
