package classes;
import java.io.*;

public class Shapes0 {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		TwoDShape0[] array = new TwoDShape0[4];
		
		array[0] = new Triangle0(3.5, 1.6, "beautiful");
		array[1] = new Rectangle0(20);
		array[2] = new Rectangle0(3.5);
		array[3] = new Triangle0(3.5);
		
		// array[x] = new TwoDShape0(...)  impossible because TwoDShape0 is abstract
		
		for(int i = 0; i < array.length; i++) {
			pw.println("Type: " + array[i].getName());
			pw.println("Area: " + array[i].area());
			pw.println();
		}
		
		Circle circle = new Circle(3, 6.4);
		pw.println("Area: " + circle.area());
		pw.println("Length: " + circle.length());
	}
}