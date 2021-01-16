import java.io.*;

public class ReadingFilesByFileReader {
	public static void main(String[] args) {
		String str;
		PrintWriter pw = new PrintWriter(System.out, true);
		if(args.length != 1) {
			pw.println("java ReadingFilesByFileReader file_name");
			return;
		}
		
		try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch(IOException exc) {
			System.out.println("Input/Output error: " + exc);
		}
	}
}