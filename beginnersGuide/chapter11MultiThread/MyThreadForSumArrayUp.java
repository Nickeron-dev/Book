package threads;
import java.io.*;

public class MyThreadForSumArrayUp implements Runnable{
	PrintWriter pw = new PrintWriter(System.out, true);
	public Thread thread;
	static SumArrayUp sa = new SumArrayUp();
	int[] array;
	int answer;
	
	public MyThreadForSumArrayUp(String name, int[] array) {
		thread = new Thread(this, name);
		this.array = array;
	}
	
	public static MyThreadForSumArrayUp createAndStart(String name, int[] array) {
		MyThreadForSumArrayUp myThread = new MyThreadForSumArrayUp(name, array);
		myThread.thread.start();
		return myThread;
	}
	
	public void run() {
		//int sum; don't know what for is it
		
		pw.println(thread.getName() + " - launch");
		synchronized(sa) {
			answer = sa.sumArray(array);
		}
		pw.println(thread.getName() + " sum: " + answer);
		pw.println(thread.getName() + " - ended");
	}
}
