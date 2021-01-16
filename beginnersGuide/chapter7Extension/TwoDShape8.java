package classes;
import java.io.*;

public class TwoDShape8 {
	PrintWriter pw = new PrintWriter(System.out, true);
	private double width;
	private double height;
	
	TwoDShape8(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	TwoDShape8(double both) {
		width = height = both;
	}
	
	TwoDShape8() {
		width = height = 0.0;
	}
	
	TwoDShape8(TwoDShape8 ob) {
		width = ob.getWidth(); // or just ob.width
		height = ob.getHeight();  // or just ob.height
	}
	
	void showValues() { 
		pw.println("Width: " + width + " height: " + height);
	}
	
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
}