package threadsMain;

public class MyThreadExtendsMain {
	public static void main(String[] args) {
		System.out.println("Starting main thread");
		
		threads.MyThreadExtends mte = threads.MyThreadExtends.createAndStart("Second thread");
		
		for(int i = 0; i < 50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch(InterruptedException exc) {
				System.out.println("Main thread interrupted");
			}
		}
		System.out.println("Main thread ended");
	}
}