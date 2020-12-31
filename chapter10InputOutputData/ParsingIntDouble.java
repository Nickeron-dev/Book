import java.io.*;

public class ParsingIntDouble {
	public static void main(String[] args) throws IOException{
		String str;
		int number;
		double d = 0.0;
		double sum = 0.0;
		double avg;
		PrintWriter pw = new PrintWriter(System.out, true);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		pw.println("Input number of doubles to input");
		str = br.readLine();
		try {
			number = Integer.parseInt(str);
		} catch (NumberFormatException exc) {
			pw.println("Incorrect format!");
			number = 0;
		}
		pw.println("You need to enter  "  + number + " values");
		for (int i = 0; i < number;  i++) {
			pw.print(": ");
			pw.flush();
			str = br.readLine();
			try {
				d = Double.parseDouble(str);
			} catch (NumberFormatException exc) {
				pw.println("Incorrect format!");
				d = 0.0;
			}
			sum += d;
			
		}
		avg = sum / number;
		pw.println("Average value is: " + avg);
	}
}