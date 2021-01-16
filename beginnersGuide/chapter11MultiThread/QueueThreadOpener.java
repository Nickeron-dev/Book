package threads;

public class QueueThreadOpener extends Thread{
	
	public QueueThread(String name) {
		super(name);
	}
	
	public void add(int element) {
		queue