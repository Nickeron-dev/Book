import java.io.*;

public class CopyOrAppendFile {
	public static void main(String [] args) throws IOException {
		int index;
		FileInputStream example = null;
		FileOutputStream second = null;
		//null is necessary here
		
		
		// Checking out args
		if (args.length != 2) {
			System.out.println("To use this file: " +
			"java CopyOrAppendFile file_name1 file_name2");
			return;
		}
		
		try {
			example = new FileInputStream(args[0]);
			second = new FileOutputStream(args[1], true);
			
			second.write(32);
			do {
				index = example.read();
				if (index != -1) {
					second.write(index);
				} 
			}	while(index != -1);
		} catch (IOException exc) {
			System.out.println("Input/Output error");
		} finally {
			try {
				example.close();
			} catch (IOException exc) {
				System.out.println("Error in closing source file");
			}
			try {
				second.close();
			} catch (IOException exc) {
				System.out.println("Error in closing created file");
			}
		}
	}
}