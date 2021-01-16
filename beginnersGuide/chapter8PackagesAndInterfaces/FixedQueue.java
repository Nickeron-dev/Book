package interfaces;

public class FixedQueue implements ICharQ {
	private char[] queue;
	private int putloc, getloc;
	private final int FirstSize;
	
	public FixedQueue(int places) {
		FirstSize = places;
		queue = new char[places];
		putloc = getloc = 0;
	}
	
	public void put(char symbol) {
		if(putloc == queue.length) {
			System.out.println("Queue is full");
			return;
		}
		
		queue[putloc++] = symbol;
	}
	
	public char get() {
		if(putloc == getloc) {
			System.out.println("Queue is empty");
			return (char) 0;
		}
		
		return queue[getloc++];
	}
	
	public void reset() {
		char[] resetting = new char[FirstSize];
		for(int i = 0; i < resetting.length; i++) {
			resetting[i] = queue[i];
		}
		getloc = 0;
		queue = resetting;
	}
	
	public int getLength() {
		return queue.length;
	}
}