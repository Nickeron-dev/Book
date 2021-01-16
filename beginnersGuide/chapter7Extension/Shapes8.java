package classes;
import java.io.*;

public class Shapes8 {
	public static void main(String[] args) {
		Triangle8 t1 = new Triangle8(4.5, 6.2, "beautiful");
		//creating a copy of t1
		Triangle8 t2 = new Triangle8(t1);
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