package threads;

public class TickThread implements Runnable{
	public Thread thread;
	TickTock tickTock;
	
	public TickThread(String name, TickTock obj) {
		thread = new Thread(this, name);
		tickTock = obj;
	}
	
	public static TickThread createAndStart(String name, TickTock obj) {
		TickThread tt = new TickThread(name, obj);
		
		tt.thread.start();
		return tt;
	}
	
	public void run() {
		if(thread.getName().compareTo("Tick") == 0) {
			for(int i = 0; i < 5; i++) {
				tickTock.tick(true);
			}
			tickTock.tick(false);
		}
		
		if(thread.getName().compareTo("Tock") == 0) {
			for(int i = 0; i < 5; i++) {
				tickTock.tock(true);
			}
			tickTock.tick(false);
		}
	}
}
