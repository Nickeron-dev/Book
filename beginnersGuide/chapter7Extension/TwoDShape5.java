package classes;
import java.io.*;

public class TwoDShape5 {
	private double width, height;
	PrintWriter pw = new PrintWriter(System.out, true);
		
	TwoDShape5 () {
		width = height = 0.0;
	}
	
	TwoDShape5 (double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	TwoDShape5 (double both) {
		width = height = both;
	}
	
	double getWidth () { return width; }
	double getHeight () { return height; } 
	void setWidth (double width) { this.width = width; }
	void setHeight (double height) { this.height = height; }
	
	void showValues () {
		pw.println("Width: " + width + " Height: " + height);
	}
}
