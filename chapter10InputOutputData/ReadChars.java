import java.io.*;

public class ReadChars {
	public static void main(String[] args) throws IOException{
		// creating BufferedReader 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char c;
		System.out.println("Input something in console!");
		
		//checking console
		do {
			c = (char) br.read();
			System.out.println(c);
		} while (c != '.');
	}
}