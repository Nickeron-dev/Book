import java.io.*;

public class PrintWriterDemo {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		int i = 10;
		String str = "something";
		
		pw.println("Here is PrintWriter");
		pw.print(i);
		pw.println(str);
		pw.flush(); // what for flush is?
		pw.println(i + " + " + str + " = " + i+str);
		
	}
}