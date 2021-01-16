package classes;
import java.io.*;

public class TwoDShape9 {
	private double width, height;
	String name;
	PrintWriter pw = new PrintWriter(System.out, true);
	
	// Constructor with parameters
	TwoDShape9(double width, double height, String name) {
		this.width = width;
		this.height = height;
		this.name = name;
	}
	
	// Constructor with same variables
	TwoDShape9(double both, String name) {
		width = height = both;
		this.name = name;
	}
	
	// default Constructor
	TwoDShape9() {
		width = height = 0.0;
		name = "none";
	}
	
	// Constructor with object
	TwoDShape9(TwoDShape9 obj) {
		width = obj.getWidth();
		height = obj.getHeight();
		name = obj.name;
	}
	
	double getWidth() {
		return width;
	}
	
	double getHeight() {
		return height;
	}
	
	String getName() {
		return name;
	}
	
	void setWidth(double width) {
		this.width = width;
	}
	
	void setHeight(double height) {
		this.height = height;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void showValues() {
		pw.println("Width: " + width + " Height: " + height);
	}
	
	// Method which must be changed
	double area() {
		pw.println("This method must be changed in subclass");
		return 0.0;
	}
}