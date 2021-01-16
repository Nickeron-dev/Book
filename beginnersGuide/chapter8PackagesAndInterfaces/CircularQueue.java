package interfaces;

public class CircularQueue implements ICharQ {
	private char[] q;
	private int putloc, getloc;
	private final int FirstSize;
	
	public CircularQueue(int size) {
		FirstSize = size;
		q = new char[size+1];
		putloc = getloc = 0;
	}
	
	public void put(char ch) {
		if(putloc+1 == getloc
		| ((putloc == q.length-1) & (getloc == 0))) {
			System.out.println("Queue is full");
			return;
		}
		
		q[putloc++] = ch;
		if(putloc == q.length) putloc = 0;  // back to start of array
	}
	
	public void reset() {
		System.out.println("This array is static so it doesn't need to reset");
	}
	
	public char get() {
		if(getloc == putloc) {
			System.out.println("Queue is empty");
			return (char) 0;
		}
		
		char ch = q[getloc++];
		if(getloc == q.length) getloc = 0;
		
		return ch;
	}
	
	public int getLength() {
		return q.length;
	}
}

		