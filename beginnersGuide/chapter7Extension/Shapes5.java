package classes;
import java.io.*;

public class Shapes5 {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		Triangle5 t1 = new Triangle5();
		Triangle5 t2 = new Triangle5(5.2, 6.2, "blue");
		Triangle5 t3 = new Triangle5(7.1, "red");
		
		t1 = t2;
		
		pw.println("Information about t1: ");
		t1.showValues();
		t1.showStyle();
		pw.println("Area: " + t1.area());
		
		pw.println();
		
		pw.println("Information about t2: ");
		t2.showValues();
		t2.showStyle();
		pw.println("Area: " + t2.area());
		
		pw.println();
		
		pw.println("Information about t3: ");
		t3.showValues();
		t3.showStyle();
		pw.println("Area: " + t3.area()); 
	}
}