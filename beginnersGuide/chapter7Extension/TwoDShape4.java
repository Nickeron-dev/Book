package classes;
import java.io.*;

public class TwoDShape4 {
	private double width;
	private double height;
	PrintWriter pw = new PrintWriter(System.out, true);
	
	TwoDShape4 (double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	double getWidth() { return width; }
	double getHeight() { return height; }
	void setWidth(double width) { this.width = width; }
	void setHeight(double height) { this.height = height; }
	
	void showValues() {
		pw.println("Width: " + width + " Height: " + height);
	}
}
