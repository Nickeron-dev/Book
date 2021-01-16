package enumsMain;
import java.io.*;

public class InstrumentsMain {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		enums.Instruments trumpet = enums.Instruments.TRUMPET;
		pw.println("trumpet has got diapason: " + trumpet.getOctaves());
		
		for(enums.Instruments instrument : enums.Instruments.values()) {
			pw.print("\n" + instrument + " has got: " + instrument.getOctaves() + " octaves");
			pw.flush();
		}
	}
}
		