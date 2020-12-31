package classes;

public class Triangle0 extends TwoDShape0 {
	private String style;
	
	Triangle0(double width, double height, String style) {
		super(width, height, "triangle");
		this.style = style;
	}
	
	Triangle0(double both) {
		super(both, "triangle");
		style = "beautiful";
	}
	
	Triangle0() {
		super();
		style = "none";
	}
	
	Triangle0(Triangle0 obj) {
		super(obj);
		style = obj.style;
	}
	
	String getStyle() {
		return style;
	}
	
	void showStyle() {
		System.out.println("Style: " + style);
	}
	
	double area() {
		return getWidth() * getHeight() / 2;
	}
}
