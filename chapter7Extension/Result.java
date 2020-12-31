package classes;
import java.io.*;

class A  {
	int i;
	
}

class B extends A {
	PrintWriter pw = new PrintWriter(System.out, true);
	int i;
	
	B (int a, int i) {
		super.i = a;
		this.i = i;
	}
	
	void showValues () {
		pw.println("i in superclass: " + super.i);
		pw.println("i in subclass: " + i);
	}
}

public class Result {
	public static void main (String[] args) {
		B b = new B(1, 2);
		
		b.showValues();
	}
}