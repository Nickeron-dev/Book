package interfacesMain;
import java.io.*;
import interfaces.ProcessingInfUsAll;

public class ProcessingInfUsAllMain {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		ProcessingInfUsAll process = new ProcessingInfUsAll();
		pw.println("UserID: " + process.getUserID());
		pw.println("AdminID: " + process.getAdminID());
	}
}
