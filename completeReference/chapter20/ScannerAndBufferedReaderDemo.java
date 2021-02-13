package classes;

import java.util.*; // importing Collections
import java.io.*; // importing BufferedReader and IOException

public class ScannerAndBufferedReaderDemo {
  public static void main(String[] args) throws IOException {
    /* the main differences between Scanner and BufferedReader are:
        1. Scanner is unsynchronized
        2. Scanner has got 1KB on memory(BufferedReader has got 8KB)
        3. Scanner is a bit slower because it needs to parse data as well
            but BufferedReader only has to read a character stream
        4. Scanner has got methods: nextInt(), nextDouble() etc.
            In BufferedReader you need to use: parseInt() etc.(they aren't in BR)
        5. In order to read Line in Scanner: nextLine(), in BR: readLine()
    */
    Scanner scan = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Input double in Scanner: ");
    double scanValue = scan.nextDouble();
    System.out.println("This is inputed value: " + scanValue);

    System.out.println("Input double in BufferedReader: ");
    double bRValue = Double.parseDouble(br.readLine());
    System.out.println("This is inputed value: " + bRValue);

    System.out.println("Input line in Scanner: ");
    String scanLine = scan.nextLine();
    System.out.println("This is inputed value: " + scanLine);

    System.out.println("Input line in BufferedReader: ");
    String bRLine = br.readLine();
    System.out.println("This is inputed value: " + bRLine);

    System.out.println("Input long 2KB line in Scanner: ");
    String longStr = scan.nextLine();
    System.out.println("This is inputed String: " + longStr);

    System.out.println("Input long 2KB line in BufferedReader: ");
    String longStrBuff = br.readLine();
    System.out.println("This is inputed String(Buffer)" + longStrBuff);

  }
}
