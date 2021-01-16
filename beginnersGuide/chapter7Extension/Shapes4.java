package classes;
import java.io.*;

public class Shapes4 {
	public static void main(String[] args) {
		Triangle4 t1 = new Triangle4(3.5, 3.7, "blue");
		Triangle4 t2 = new Triangle4(2.5, 45.6, "red");
		PrintWriter pw = new PrintWriter(System.out, true);
		
		pw.println("Information about t1: ");
		t1.showValues();
		t1.showStyle();
		pw.println("Area: " + t1.area());
		
		pw.println();
		
		pw.println("Information about t2: ");
		t2.showValues();
		t2.showStyle();
		pw.println("Area: " + t2.area()); 
	}
}