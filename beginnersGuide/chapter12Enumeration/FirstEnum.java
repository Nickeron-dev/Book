package enums;
import java.io.*;

public class FirstEnum {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		Transport tp;
		
		tp = Transport.PLANE;
		
		pw.println("Tp: " + tp);
		
		tp = Transport.TRAIN;
		
		if(tp == Transport.TRAIN) {
			pw.println("tp includes train");
		}
		
		switch (tp) {
			case CAR:
				pw.println("It is car");
				break;
			case TRUCK:
				pw.println("It is truck");
				break;
			case PLANE:
				pw.println("It is place");
				break;
			case TRAIN:
				pw.println("It is train");
				break;
			case BOAT:
				pw.println("It is boat");
				break;
		}
	}
}
