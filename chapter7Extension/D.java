package classes;
import java.io.*;

class A1 {
	PrintWriter pw = new PrintWriter(System.out, true);
	A1() {
		pw.println("Constructor of class A");
	}	
}

class B1 extends A1 {
	PrintWriter pw = new PrintWriter(System.out, true);
	B1() {
		pw.println("Constructor of class B");
	}
}

class C1 extends B1 {
	PrintWriter pw = new PrintWriter(System.out, true);
	C1() {
		pw.println("Constructor of class C1");
	}
}

public class D {
	public static void main(String[] args) {
		C1 classs = new C1();
	}
}
	
