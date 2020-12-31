package interfacesMain;
import java.io.*;
import interfaces.ByTwoPrevious;

public class PreviousMain {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		ByTwoPrevious btp = new ByTwoPrevious();
		
		for(int i = 0; i < 5; i++) {
			pw.println(btp.getNext());
		}
		
		//reset
		btp.reset();
		pw.println("Reset");
		for(int i = 0; i < 5; i++) {
			pw.println(btp.getNext());
		}
		
		// setStart 200
		btp.setStart(200);
		pw.println("setStart 200");
		for(int i = 0; i < 5; i++) {
			pw.println(btp.getNext());
		}
		
		pw.println("Return previous:" + btp.getPrevious());
	}
}
		
		