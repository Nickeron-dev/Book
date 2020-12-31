import java.io.*;

public class CompFileMy {
	public static void main(String[] args){
		/* To use this file input: 
		java CompFile FIRST.TXT SECOND.TXT
		*/
		int first;
		int second;
		
		// Check args
		if(args.length != 2){
			System.out.println("To use this file input: " +
			"java CompFile FIRST.TXT SECOND.TXT");
			return;
		}
		
		try(FileInputStream compOne = new FileInputStream(args[0]);
		FileInputStream compTwo = new FileInputStream(args[1])) {
			do {
				first = compOne.read();
				second = compTwo.read();
				if(first != -1 & second != -1) {
					if(first == second) {
						continue;
					}
					else {
						System.out.println("Files are different!");
						return;
					}
				} else if((first == -1 & second != -1) | (first != -1 & second == -1)) {
					System.out.println("Files are different!");
					return;
				}
			} while(first != -1 | second != -1);
			System.out.println("Files are same!");
		} catch (IOException exc){
			System.out.println("Reading files exception: " + exc);
		}
	}
}