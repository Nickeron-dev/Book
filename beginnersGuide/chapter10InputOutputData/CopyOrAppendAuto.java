import java.io.*;

public class CopyOrAppendAuto {
	public static void main(String[] args) throws IOException {
		int index;
		
		// Check
		if(args.length != 2) {
			System.out.println("To use this file: java " +
			"CopyOrAppendAuto file_name file_name");
			return;
		}
		
		try (FileInputStream source = new FileInputStream(args[0]);
		FileOutputStream put = new FileOutputStream(args[1], true)) {
			do {
				index = source.read();
				if(index != -1) put.write(index);
			} while(index != -1);
		} catch (IOException exc) {
			System.out.println("Input/Output error: " + exc);
		}
	}
}