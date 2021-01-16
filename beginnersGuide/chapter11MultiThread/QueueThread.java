package threads;

public class QueueThread {
	public int[] array;
	public int putloc, getloc, index;
	
	public QueueThread(int num) {
		array = new int[num];
		putloc = getloc = index = 0;
	}
	
	synchronized public void add(int element) {
		if(putloc == array.length) {
			System.out.println("Queue is full");
			return;
		}
		
		array[putloc++] = element;
	}
	
	synchronized public int get() {
		if(index != array.length) {
			index++;
			return array[index];
		} else {
			index = 0;
			return array[index];
		}
	}
}