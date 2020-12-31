package classes;
import java.io.*;

public class Triangle8 extends TwoDShape8 {
	private String style;
	PrintWriter pw = new PrintWriter(System.out, true);
	
	Triangle8(double width, double height, String style) {
		super(width, height);
		
		this.style = style;
	}
	
	Triangle8(double both, String style) {
		super(both);
		
		this.style = style;
	}
	
	Triangle8(Triangle8 ob) {
		super(ob);
		style = ob.getStyle();  // or just ob.style
	}
	
	Triangle8() {
		super();
		style = "none";
	}
	
	String getStyle() {
		return style;
	}
	
	void showStyle() {
		pw.println("Style: " + style);
	}
	
	double area() {
		return getWidth() * getHeight() / 2;
	}
}