/* Копрование текстового файла. 
 При вызове программы следует указать имена исходного
 и целевого файла. Например, для копирования файла 
 First.txt в файл Second.txt Следует ввести команду:
	java CopyFile First.txt Second.txt
*/
import java.io.*;
public class CopyFile {
	public static void main(String [] args) throws IOException {
		int i;
		FileInputStream get = null;
		FileOutputStream put = null;
		
		if(args.length != 2){
			System.out.println("To use this file input:" 
			+ "java CopyFile file_name1 file_name2");
			return;
		}
		
		// Copying file
		try {
			//trying to open files
			get = new FileInputStream(args[0]);
			put = new FileOutputStream(args[1]);
			
			do {
				i = get.read();
				if(i != -1) put.write(i);
			} while(i != -1);
		} catch (IOException exc) {
			System.out.println("Error input-output: " + exc);
		} finally {
			try {
				get.close();
			} catch(IOException exc) {
				System.out.println("Error in source file");
			}
			try {
				put.close();
			} catch (IOException exc) {
				System.out.println("Error in file put");
			}
		}
	}
}