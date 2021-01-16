package classes;
import java.io.*;

public class Triangle4 extends TwoDShape4 {
	String style;
	Triangle4 (double width, double height, String style) {
		super(width, height);
		
		this.style = style;
	}
	
	double area() {
		return getWidth() * getHeight()  / 2;
	}
	
	void showStyle() {
		pw.println("Style: " + style);
	}
}