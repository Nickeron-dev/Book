import java.io.*;

public class FileOpener {
	public static void main(String []args){
		// to use this file write: java FileOpener file_name
		int index;
		FileInputStream file;
		
		if(args.length != 1){
			System.out.println("to use this file write: java FileOpener file_name");
			return;
		}
		
		try {
			file = new FileInputStream(args[0]);
		} catch (FileNotFoundException exc){
			System.out.println("File is not found!");
			return;
		}
		
		try {
			do {
				index = file.read();
				if (index != -1)
					System.out.print((char) index);
			} while(index != -1);
		} catch (IOException exc) {
			System.out.println("Error in reading file!");
		} finally {
			try {
				file.close();
			} catch (IOException exc) {
				System.out.println("Error in closing file!");
			}
		}
	}
}