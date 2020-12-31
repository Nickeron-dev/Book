package threads;

public class SumArrayUp {
	private int sum;
	
	public int sumArray(int[] array) {
		sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
			
			System.out.println("Sum in: " + Thread.currentThread().getName() + " is: " + sum);
			try { 
				Thread.sleep(10);
			} catch (InterruptedException exc) {
				System.out.println("Thread is interrupted");
			}
		}
		return sum;
	}
}