package enumsMain;
import java.io.*;

public class FruitsMain {
	public static void main(String[] agrs) {
		PrintWriter pw = new PrintWriter(System.out, true);
		enums.Fruits apple, banana, appleOne;
		
		for(enums.Fruits fruit : enums.Fruits.values()) {
			pw.println(fruit + " is on position: " + fruit.ordinal());
			pw.flush();
		}
		apple = enums.Fruits.APPLE;
		banana = enums.Fruits.BANANA;
		appleOne = enums.Fruits.APPLE;
		
		if(apple.compareTo(banana) > 0)
			pw.println("apple is after banana");
		
		if(apple.compareTo(banana) < 0) 
			pw.println("apple is before banana");
		
		if(apple.compareTo(appleOne) == 0) 
			pw.println("apple consists appleOne");
	}
}
