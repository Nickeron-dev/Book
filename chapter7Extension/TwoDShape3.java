package classes;
import java.io.*;

public class TwoDShape3 {
	PrintWriter pw = new PrintWriter(System.out, true);
	double height, width;
	
	void showValues() {
		pw.println("Width: " + width + " Height: " + height);
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