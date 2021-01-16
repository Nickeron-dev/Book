package classes;
import java.io.*;

public class ColorTriangle extends Triangle {
	private String color;
	PrintWriter pw = new PrintWriter(System.out, true);
	
	ColorTriangle(double width, double height, String style, String color) {
		super(width, height, style);
		
		this.color = color;
	}
	
	void showColor() {
		pw.println("Color: " + color);
	}
	
	String getColor() {
		return color;
	}
}
