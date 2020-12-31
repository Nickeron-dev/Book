package enumsMain;
import java.io.*;

public class PackUnpack {
	public static void printIntegerFromInt(Integer i) {
		System.out.println("printIntegerToInt got: " + i);
	}
	
	public static int returnInt() {
		return 20;
	}
	
	public static Integer returnInteger() {
		return 100;
	}
	
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		// giving to printIntegerFromInt() int value
		printIntegerFromInt(13);
		
		Integer integerOb = returnInt(); // it autopacks to Integer
		pw.println("Integer integerOb: " + integerOb);
		
		int i = returnInteger();  // it autoUnpacks to int from Integer
		pw.println("int i: " + i);
		
		// Using Math.sqrt()
		System.out.println("Form Integer it autopacks to int and with method to double: " +
		+ Math.sqrt(integerOb));
	}
}
