package interfacesMain;
import java.io.*;

public class ReferenceInterface {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		interfaces.ByTwo bytwo = new interfaces.ByTwo();
		interfaces.ByThree bythree = new interfaces.ByThree();
		interfaces.Series obj;
		
		for(int i = 0; i < 5; i++) {
			obj = bytwo;
			pw.println("Next bytwo: " + obj.getNext());
			
			obj = bythree;
			pw.println("Next bythree: " + obj.getNext());
		}
	}
}
		
		
			