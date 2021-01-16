package interfacesMain;
import java.io.*;

public class ByThreeMain {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		interfaces.ByThree byThree = new interfaces.ByThree();
		
		for(int i = 0; i < 5; i++) {
			pw.println(byThree.getNext());
		}
		
		//reset
		byThree.reset();
		pw.println("Reset");
		for(int i = 0; i < 5; i++) {
			pw.println(byThree.getNext());
		}
		
		// setStart 200
		byThree.setStart(200);
		pw.println("setStart 200");
		for(int i = 0; i < 5; i++) {
			pw.println(byThree.getNext());
		}
		
		pw.println("Return previous:" + byThree.getPrevious());
	}
}
