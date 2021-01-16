import java.io.*;

public class CompFileBook {
	public static void main(String[] args){
		/* To use this file input:
		java CompFileBook FIRST.TXT SECOND.TXT
		*/
		
		int i, j, counter = 0;
		
		// Check args' length
		if (args.length != 2) {
			System.out.println("To use this file input: " +
			"java CompFileBook FIRST.TXT SECOND.TXT");
			return;
		}
		
		try(FileInputStream fileOne = new FileInputStream(args[0]);
		FileInputStream fileTwo = new FileInputStream(args[1])) {
			do {
				i = fileOne.read();
				j = fileTwo.read();
				if(i >= 65 && i <= 90) {
					i += 32;
				}
				if(j >= 65 && j <= 90) {
					j += 32;
				}
				if(i != j) break;
				counter += 1;
			} while(i != -1 && j != -1);
			
			if(i != j) {
				System.out.println("Files are different! First place: " + counter);
			} else {
				System.out.println("Files are same!");
			}
		} catch(IOException exc) {
			System.out.println("Issue with reading files: " + exc);
		}
	}
}