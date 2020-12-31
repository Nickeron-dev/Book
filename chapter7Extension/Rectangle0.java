package classes;

public class Rectangle0 extends TwoDShape0 {
	Rectangle0(double width, double height) {
		super(width, height, "rectangle");
	}
	
	Rectangle0(double both) {
		super(both, "rectangle");
	}
	
	Rectangle0() {
		super();
	}
	
	Rectangle0(Rectangle0 obj) {
		super(obj);
	}
	
	double area() {
		return getWidth() * getHeight();
	}
	
	boolean isSquare() {
		if (getWidth() == getHeight()) return true;
		else return false;
	}
}