package threadsMain;

public class MyThreadsExtendsJoinMain {
	public static void main(String[] args) {
		System.out.println("Starting main thread");
		
		threads.MyThreadExtends mt1 = threads.MyThreadExtends.createAndStart("First thread");
		threads.MyThreadExtends mt2 = threads.MyThreadExtends.createAndStart("Second thread");
		threads.MyThreadExtends mt3 = threads.MyThreadExtends.createAndStart("Third thread");
		
		try {
			mt1.join();
			System.out.println(mt1.getName() + " commited");
			mt2.join();
			System.out.println(mt2.getName() + " commited");
			mt3.join();
			System.out.println(mt3.getName() + " commited");
		} catch(InterruptedException exc) {
			System.out.println("Main thread interrupted");
		}
		
		System.out.println("Main thread is ended");
	}
}
