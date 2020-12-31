package classes;
import java.io.*;

public class Shapes7 {
	public static void main(String[] args) {
		ColorTriangle t1 = new ColorTriangle(3.5, 2.6, "beautiful", "red");
		ColorTriangle t2 = new ColorTriangle(6.5, 1.6, "visible", "blue");
		PrintWriter pw = new PrintWriter(System.out, true);
		
		pw.println("Information about t1: ");
		t1.showValues();
		t1.showStyle();
		t1.showColor();
		pw.println("Area: " + t1.area());
		
		pw.println();
		
		pw.println("Information about t2: ");
		t2.showValues();
		t2.showStyle();
		t2.showColor(); 
		pw.println("Area: " + t2.area());
	}
}