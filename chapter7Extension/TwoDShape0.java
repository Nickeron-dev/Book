package classes;

public abstract class TwoDShape0 {
	private double width, height;
	String name;
	
	TwoDShape0(double width, double height, String name) {
		this.width = width;
		this.height = height;
		this.name = name;
	}
	
	TwoDShape0(double both, String name) {
		width = height = both;
		this.name = name;
	}
	
	TwoDShape0() {
		width = height = 0.0;
		name = "none";
	}
	
	TwoDShape0(TwoDShape0 obj) {
		width = obj.getWidth();
		height = obj.height;
		name = obj.name;
	}
	
	double getWidth() {
		return width;
	}
	
	double getHeight() { return height; }
	
	String getName() {
		return name;
	}
	
	void setWidth(double width) {
		this.width = width;
	}
	
	void setHeight(double height) {
		this.height = height;
	}
	
	void showValues() {
		System.out.println("Width: " + width + " Height: " + height);
	}
	
	abstract double area();
}