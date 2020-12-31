import java.io.*;

public class FromConsoleToFileWriter {
	public static void main(String[] args) {
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Write something till stop");
		FileWriter fw = null;
		try {
			fw = new FileWriter("FromConsoleToFileWriter.txt");
			
			do {
				System.out.print(": ");
				
				str = br.readLine();
				if (str.compareTo("stop") == 0) break;
				
				str += "\r\n"; // adding enter
				fw.write(str);
				
			} while (str.compareTo("stop") != 0);
		} catch (IOException exc) {
			System.out.println("input/output issue: " + exc);
		}
		try {
			fw.close();
		} catch(IOException exc) {
			System.out.println("Error closing file: " + exc);
		}
	}
}