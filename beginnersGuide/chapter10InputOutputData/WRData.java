import java.io.*;

public class WRData {
	public static void main(String[] args) {
		// Strange values in files is OK
		int i = 1024;
		double d = 1034.2;
		boolean b = true;
		
		try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("WRData.txt"))){
			System.out.println("Written: " + i);
			dataOut.writeInt(i);
			
			System.out.println("Written: " + d);
			dataOut.writeDouble(d);
			
			System.out.println("Written: " + b);
			dataOut.writeBoolean(b);
			
			System.out.println("Written: " + 10.6 * 4.5);
			dataOut.writeDouble(10.6 * 4.5);
		} catch(IOException exc) {
			System.out.println("Error in writing in file: " + exc);
		}
		
		try (DataInputStream dataIn = new DataInputStream(new FileInputStream("WRData.txt"))){
			i = dataIn.readInt();
			System.out.println("Read: " + i);
			
			d = dataIn.readDouble();
			System.out.println("Read: " + d);
			
			b = dataIn.readBoolean();
			System.out.println("Read: " + b);
			
			d = dataIn.readDouble();
			System.out.println("Read: " + d);
		} catch(IOException exc) {
			System.out.println("Error in reading file: " + exc);
		}
	}
}