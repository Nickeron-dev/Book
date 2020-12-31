package classes;
import java.io.*;

class First {
	private int i, j;
	PrintWriter pw = new PrintWriter(System.out, true);
	
	First(int a, int b) {
		i = a;
		j = b;
	}
	
	int getI() {
		return i;
	}
	
	int getJ() {
		return j;
	}
	
	void show() {
		pw.println("i, j: " + getI() + " " + getJ());
	}
}

class Second extends First {
	private int f;
	PrintWriter pw = new PrintWriter(System.out, true);
	
	Second (int a, int b, int c) {
		super(a, b);
		f = c;
	}
	
	void show() {
		super.show();
		pw.println("f: " + f);
	}
	
	void show(String message) {
		pw.println(message + f);
	}
}

public class Third {
	public static void main(String[] args) {
		Second first = new Second(3, 5, 8);
		first.show();
		first.show("f: ");
	}
}
	