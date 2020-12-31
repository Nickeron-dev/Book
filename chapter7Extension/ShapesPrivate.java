package classes;
import java.io.*;

class TwoDShape2 {
	private double width, height;
	PrintWriter pw = new PrintWriter(System.out, true);
	
	double getWidth() {
		return width;
	}
	
	double getHeight() {
		return height;
	}
	
	void setWidth(double width) {
		this.width = width;
	}
	
	void setHeight(double height) {
		this.height = height;
	}
	
	void showValues() {
		pw.println("Width: " + width + " Height: " + height);
	}
}

class Triangle2 extends TwoDShape {
	private double thirdLine;
	private String style;
	
	double getThirdLine() {
		return thirdLine;
	}
	
	void setThirdLine(double thirdLine) {
		this.thirdLine = thirdLine;
	}
	
	double perimeter() {
		return getWidth() * getHeight() * thirdLine;
	}
	
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	String getStyle() {
		return style;
	}
	
	void setStyle(String style) {
		this.style = style;
	}

}

public class ShapesPrivate {
	public static void main(String[] args) throws NumberFormatException{
		PrintWriter pw = new PrintWriter(System.out, true);
		
		Triangle2 t1 = new Triangle2();
		Triangle2 t2 = new Triangle2();
		
		t1.setWidth(4.6);
		t1.setHeight(56.2);
		t1.setThirdLine(54.2);
		t1.setStyle("Coloured");
		
		t2.setWidth(6.2);
		t2.setHeight(45.2);
		t2.setThirdLine(54.2);
		t2.setStyle("beautiful");
		
		pw.println("Information about Triangle 1: ");
		t1.showValues();
		pw.println("Perimeter: " + t1.perimeter());
		pw.println("Area: " + t1.area());
		System.out.println();
		
		pw.println("Information about Triangle 2: ");
		t2.showValues();
		pw.println("Perimeter: " + t2.perimeter());
		pw.println("Area: " + t2.area());
	}
}