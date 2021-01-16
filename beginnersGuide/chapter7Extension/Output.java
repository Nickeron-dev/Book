package classes;
import java.io.*;

class Sup {
	void show() {
		System.out.println("show() in superAA");
	}
}

class Sub1 extends Sup {
	void show() {
		System.out.println("show() in Sub1");
	}
}

class Sub2 extends Sup {
	void show() {
		System.out.println("show() in Sub2");
	}
}

public class Output {
	public static void main(String[] args) {
		Sup superClass = new Sup();
		Sub1 subClass1 = new Sub1();
		Sub2 subClass2 = new Sub2();
		
		Sup reference;
		
		reference = superClass;
		reference.show();
		reference = subClass1;
		reference.show();
		reference = subClass2;
		reference.show();
	}
}
		