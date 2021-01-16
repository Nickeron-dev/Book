package classes;
import java.io.*;

class X {
	private int a;
	
	X(int i) {
		a = i;
	}
	int getA() {
		return a;
	}
	void setA(int i) {
		a = i;
	}
}

class Y extends X {
	private int a, b;
	
	Y(int i, int index) {
		super(i);
		
		b = index;
	}
	
	int getB() {
		return b;
	}
	
	void setB(int i) {
		b = i;
	}
}

public class Z {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		X x1 = new X(10);
		X x2;
		Y y1 = new Y(5, 6);
		
		x2 = x1; // Possible because type is same
		pw.println("x2.a: " + x2.getA());
		
		x2 = y1; // Possible because they extend each other
		pw.println("x2.a: " + x2.getA());
		
		// Class X has got access only to elements from X
		pw.println(x2.getA());
		//pw.println(x2.getB()); // Impossible because there is no access from X to Y;
		
	}
}