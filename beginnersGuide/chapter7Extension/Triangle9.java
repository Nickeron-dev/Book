package classes;
import java.io.*;

public class Triangle9 extends TwoDShape9 {
	private String style;
	PrintWriter pw = new PrintWriter(System.out, true);
	
	Triangle9(String style, double width, double height) {
		super(width, height, "triangle");
		this.style = style;
	}
	
	Triangle9() {
		super();
		style = "none";
	}
	
	Triangle9(double both) {
		super(both, "triangle");
		style = "strange";
	}
	
	Triangle9(Triangle9 obj) {
		super(obj);
		style = obj.getStyle();
	}
	
	String getStyle() {
		return style;
	}
	
	void setStyle(String style) {
		this.style = style;
	}
	
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		pw.println("Style: " + style);
	}
}