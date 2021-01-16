package classes;
import java.lang.Math;

public class Circle extends TwoDShape0 {
	private String style;
	
	Circle(double width, double height) {
		super(width, height, "circle");
		style = "beautiful";
	}
	
	Circle(double both) {
		super(both, "circle");
		style = "beautiful";
	}
	
	Circle() {
		super();
		style = "none";
	}
	
	Circle(Circle obj) {
		super(obj);
		style = "beautiful";
	}
	
	double area() {
		return Math.pow(2, getHeight()) * Math.PI;
	}
	
	double length() {
		return getHeight() * 2 * Math.PI;
	}
	
	void showStyle() {
		System.out.println("Style: " + style);
	}
}