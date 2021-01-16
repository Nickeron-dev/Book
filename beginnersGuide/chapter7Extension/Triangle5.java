package classes;
import java.io.*;

public class Triangle5 extends TwoDShape5 {
	PrintWriter pw = new PrintWriter(System.out, true);
	String style;
	
	Triangle5 () {
		super ();
		style = "none";
	}
	
	Triangle5 (double width, double height, String style) {
		super (width, height);
		
		this.style = style;
	}
	
	Triangle5 (double both, String style) {
		super(both);
		
		this.style = style;
	}
	
	void showStyle () {
		pw.println("Style: " + style);
	}
	
	double area () {
		return getWidth() * getHeight() / 2;
	}
}
