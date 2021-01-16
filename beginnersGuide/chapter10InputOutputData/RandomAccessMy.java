import java.io.*;

public class RandomAccessMy {
	public static void main(String[] args) {
		double[] values = {30.2, 10.3, 123.53, 154.09, 5.2, 23.2};
		double read = 0;
		
		//check
		if(args.length != 1) {
			System.out.println("java RandomAccessMy file_name");
			return;
		}
		
		try(RandomAccessFile file = new RandomAccessFile(args[0], "rw")) {
			// write in file
			for(int i = 0; i < values.length; i++) {
				file.writeDouble(values[i]);
			}
			
			file.seek(0); // cursor on first
			read = file.readDouble();
			System.out.println("First value: " + read);
			
			file.seek(8); // cursor on second because bytes
			read = file.readDouble();
			System.out.println("Second value: " + read);
			
			file.seek(8*4);
			read = file.readDouble();
			System.out.println("Fourth value: " + read);
			
			// Reading every third element
			for(int i = 0; i < values.length; i +=3) {
				file.seek(i * 8);
				read = file.readDouble();
				System.out.println(i + " element: " + read);
			}
		} catch(IOException exc) {
			System.out.println("Read/write issue" + exc);
		}
	}
}