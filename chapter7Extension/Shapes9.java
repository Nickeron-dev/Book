package classes;
import java.io.*;

public class Shapes9 {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		TwoDShape9[] array = new TwoDShape9[5];
		
		array[0] = new Triangle9("beautiful", 4.2, 6.1);
		array[1] = new Rectangle(10, "beautiful");
		array[2] = new Rectangle(10, 9, "great");
		array[3] = new Triangle9(9.2);
		array[4] = new TwoDShape9(3.5, 1.5, "shape");
		
		for(int i = 0; i < array.length; i++) {
			pw.println("Type: " + array[i].getName());
			pw.println("Area: " + array[i].area());
			pw.println();
		}
	}
}