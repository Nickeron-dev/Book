import java.io.*;

public class ShowFileAutoCloseable {
	public static void main(String[] args) {
		int index;
		
		//Check
		if(args.length != 1) {
			System.out.println("Use this file: java ShowFileAutoCloseable file_name");
			return;
		}
		
		try (FileInputStream source = new FileInputStream(args[0])) {
			do {
				index = source.read();
				if(index != -1) System.out.print((char) index);
			} while(index != -1);
		} catch (IOException exc) {
			System.out.println("Input/Output error: " + exc);
		}
	}
}