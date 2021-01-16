package threads;

public class TickTock {
	String state;
	
	synchronized public void tick(boolean running) {
		if (!running) {  // stop clock
			state = "ticked";
			notify(); // say to threads that it is ready
			return;
		}
		try {
			Thread.sleep(500);
		} catch(InterruptedException exc) {
			System.out.println("Thread interrupted");
		}
		System.out.print("Tick");
		state = "ticked";
		notify();
		try {
			if(!state.equals("tocked")) {
				wait();
			}
		} catch(InterruptedException exc) {
			System.out.println("thread interrupted");
		}
	}
	
	synchronized public void tock(boolean running) {
		if(!running) {
			state = "tocked";
			notify();
			return;
		}
		try {
			Thread.sleep(500);
		} catch(InterruptedException exc) {
			System.out.println("Thread interrupted");
		}
		System.out.println("Tock");
		state = "tocked";
		notify();
		try {
			if(!state.equals("ticked")) {
				wait();
			}
		} catch(InterruptedException exc) {
			System.out.println("thread is interrupted");
		}
	}
}
			