package classes;
import java.io.*;

class TwoDShape1 {
	PrintWriter pw = new PrintWriter(System.out, true);
	
	double width, height;
	
	void showValues() {
		pw.println("Values: " + width + " and " + height);
	}
}

class Triangle1 extends TwoDShape {
	String style;
	
	double area() {
		return width * height / 2;
	}
	
	void showStyle() {
		System.out.println("Style: "  + style);
	}
}

class Rectengle extends TwoDShape {
	boolean isSquare() {
		if (width == height) return true;
		else return false;
	}
	
	double area() {
		return width * height;
	}
}

class Parallelogram extends TwoDShape {
	String style;
	
	void showStyle() {
		pw.println("Style: " + style);
	}
	
	void specialForParallelogram() {
		pw.println("This is parallelogram!");
	}
	
}

class Romb extends Parallelogram {
	void stabilize() {
		width = height;
	}
	void showInformation() {
		pw.println("Height = width = " + height + " = " + width);
	}
	
	double area() {
		return Math.pow(height, 2);
	}
}

public class Shapes1 {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		Triangle1 t1 = new Triangle1();
		Triangle1 t2 = new Triangle1();
		Romb rb = new Romb();
		
		t1.width = 5.3;
		t1.height = 6.3;
		t1.style = "black";
		
		t2.width = 2.6;
		t2.height = 5.6;
		t2.style = "white";
		
		pw.println("Information about romb: ");
		rb.width = 5.3;
		rb.height = 6.3;
		rb.style = "black";
		rb.stabilize();
		rb.specialForParallelogram();
		rb.showInformation();
		double area3 = rb.area();
		pw.println("Area: " + area3);
		
		System.out.println("Information about triangle1: ");
		t1.showValues();
		t1.showStyle();
		
		System.out.println("Information about triangle2: ");
		t2.showValues();
		t2.showStyle();
		
		double area1 = t1.area();
		double area2 = t2.area();
		System.out.println("Area1: " + area1);
		System.out.println("Area2: " + area2);
		
		
	}
}