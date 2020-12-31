package threads;

public class Priority implements Runnable {
	public Thread thrd;
	public int count;
	static boolean stop = false;
	static String currentName;
	
	public Priority(String name) {
		Thread thrd = new Thread(this, name);
		currentName = name;
		count = 0;
	}
	
	public void run() {
		System.out.println(thrd.getName() + " - launch");
		
		do {
			count++;
			
			if(currentName.compareTo(thrd.getName()) != 0) {
				currentName = thrd.getName();
			}
		} while(stop != true && count < 10000000);
		stop = true;
		
		System.out.println(thrd.getName() + " - ended");
	}
}