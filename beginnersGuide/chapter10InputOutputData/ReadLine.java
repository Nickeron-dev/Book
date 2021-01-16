import java.io.*;

public class ReadLine {
	public static void main(String[] args) throws IOException{
		// creating BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		
		System.out.println("Write something in console. After word " +
		"'stop' it stops reading");
		
		do {
			str = br.readLine(); // Reading lines(strings)
			System.out.println(str);
		} while(!str.equals("stop"));
	}
}