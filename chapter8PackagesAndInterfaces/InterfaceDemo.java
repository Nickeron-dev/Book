package interfaces;
import java.io.*;
import java.util.Arrays;

public class InterfaceDemo {
	public static void main(String[] args) {
		ByTwo bytwo = new ByTwo();
		PrintWriter pw = new PrintWriter(System.out, true);
	
		for(int i = 0; i < 5; i++) {
			pw.println(bytwo.getNext());
		}
	
		pw.println("Reset");
		bytwo.reset();
	
		for(int i = 0; i < 5; i++) {
			pw.println(bytwo.getNext());
		}
	
		pw.println("Startpoint: 100");
		bytwo.setStart(100);
		
		for(int i = 0; i < 5; i++) {
			pw.println(bytwo.getNext());
		}
		
		pw.println("getNextArray: ");
		int[] array = bytwo.getNextArray(5);
		pw.println(Arrays.toString(array));
	}
}
	
	