package enums;
public class UsingInteger {
	public static void main(String[] args) {
		Integer intOb = new Integer(100);
		
		int i = intOb.intValue();
		
		System.out.println("First " + i + " " + intOb);
		
		Integer integerOb = 100;  // auto pack
		
		int number = integerOb; // auto unpack
		
		System.out.println("Second " + number + " " + integerOb);
	}
}
