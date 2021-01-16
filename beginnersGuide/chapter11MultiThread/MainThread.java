package threadsMain;

public class MainThread {
	public static void main(String[] args) {
		Thread thread;
		
		thread = Thread.currentThread();
		
		System.out.println("Name: " + thread.getName());
		System.out.println("GetPriority: " + thread.getPriority());
		System.out.println("Setting a priority and name");
		thread.setName("MainThread");
		thread.setPriority(Thread.NORM_PRIORITY + 3);
		System.out.println("NewName" + thread.getName());
		System.out.println("NewPriority" + thread.getPriority());
	}
}

		