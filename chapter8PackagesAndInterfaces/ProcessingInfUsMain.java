package interfacesMain;
import java.io.*;

public class ProcessingInfUsMain {
	public static void main(String[] args) {
		interfaces.ProcessingInfUs process = new interfaces.ProcessingInfUs();
		PrintWriter pw = new PrintWriter(System.out, true);
		
		pw.println("UserId: " + process.getUserID());
		pw.println("AdminId: " + process.getAdminID());
		pw.println("UniversalID: " + interfaces.InfUsAdm.getUniversalID());
		// in universalID obj process isn't necessary because it is static
	}
}
