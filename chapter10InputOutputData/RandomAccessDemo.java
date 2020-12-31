import java.io.*;

public class RandomAccessDemo {
	public static void main(String[] args) {
		double[] data = {10.4, 12.6, 100.1, 345.221, 890.23, 2.4};
		double d = 0.0;
		
		try(RandomAccessFile raf = new RandomAccessFile("RandomAssess.txt", "rw")) {
			// Writing there
			for(int i = 0; i < data.length; i++) {
				raf.writeDouble(data[i]);
			}
			
			//Reading file
			raf.seek(0);//put cursor on 1st position
			// there are byte values, so next will be 8
			d = raf.readDouble();
			System.out.println("First element: " + d);
			
			raf.seek(8);//put cursor on 2nd position
			// raf contains bytes so 8
			d = raf.readDouble();
			System.out.println("Second element: " + d);
			
			raf.seek(8 * 3); // put cursor on 4th
			d = raf.readDouble();
			System.out.println("Fourth element: " + d);
			
			// Reading every second value
			for(int i = 0; i < data.length; i += 2) {
				raf.seek(i * 8);
				d = raf.readDouble();
				System.out.println(i + " element: " + d);
			}
		} catch(IOException exc) {
			System.out.println("Read/Write issue: " + exc);
			return;
		}
	}
}