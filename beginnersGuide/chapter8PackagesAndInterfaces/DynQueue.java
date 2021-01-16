package interfaces;

public class DynQueue implements ICharQ {
	private static char[] queue;
	private int putloc, getloc;
	private final int FirstSize;
	
	public DynQueue(int places) {
		FirstSize = places;
		queue = new char[places];
		putloc = getloc = 0;
	}
	
	public void put(char ch) {
		if(putloc == queue.length) {
			char[] newArray = new char[queue.length * 2];
			for(int i = 0; i < queue.length; i++) {
				newArray[i] = queue[i];
			}
			queue = newArray;
		}
		
		queue[putloc++] = ch;
	}
	
	public char get() {
		if(getloc == queue.length) {
			System.out.println("Queue is empty");
			return (char) 0;
		}
		
		return queue[getloc++];
	}
	
	public void reset() {
		char[] resetting = new char[FirstSize];
		for(int i = 0, j = queue.length - resetting.length; i < resetting.length; i++, j++) {
			resetting[i] = queue[j];
		}
		putloc = resetting.length;
		getloc = 0;
		queue = resetting;
	}
	
	public int getLength() {
		return queue.length;
	}
}
		