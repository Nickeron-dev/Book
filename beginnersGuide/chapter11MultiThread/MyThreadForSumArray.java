package threads;

public class MyThreadForSumArray implements Runnable {
	public Thread thread;
	static SumArray sa = new SumArray();
	int[] a;
	int answer;
	
	public MyThreadForSumArray(String name, int[] a) {
		thread = new Thread(this, name);
		this.a = a;
	}
	
	public static MyThreadForSumArray createAndStart(String name, int[] nums) {
		MyThreadForSumArray myThread = new MyThreadForSumArray(name, nums);
		
		myThread.thread.start();
		return myThread;
	}
	
	public void run() {
		//int sum;
		
		System.out.println(thread.getName() + " - launch");
		
		answer = sa.sumArray(a);
		System.out.println("Sum for " + thread.getName() + " : " + answer);
		System.out.println(thread.getName() + " - ended");
	}
}

		