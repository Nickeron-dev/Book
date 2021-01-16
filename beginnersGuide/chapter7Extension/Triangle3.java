package classes;
import java.io.*;

public class Triangle3 extends TwoDShape {
	String style;
	
	Triangle3(double width, double height, String style) {
		setWidth(width);
		setHeight(height);
		this.style = style;
	}
	
	double area() {
		return width * height / 2;
	}
	
	void showStyle () {
		pw.println("Style: " + style);
	}
}