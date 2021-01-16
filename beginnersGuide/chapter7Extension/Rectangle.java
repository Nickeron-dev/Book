package classes;
import java.io.*;

public class Rectangle extends TwoDShape9 {
	private String style;
	PrintWriter pw = new PrintWriter(System.out, true);
	
	Rectangle(double width, double height, String style) {
		super(width, height, "rectangle");
		this.style = style;
	}
	
	Rectangle(double both, String style) {
		super(both, "rectangle");
		this.style = style;
	}
	
	Rectangle() {
		super();
		style = "none";
	}
	
	Rectangle(Rectangle obj) {
		super(obj);
		style = obj.style;
	}
	
	String getName() {
		return name;
	}
	
	boolean isSquare() {
		if(getWidth() == getHeight()) { return true; }
		else { return false; }
	}
	
	double area() {
		return getWidth() * getHeight();
	}
}