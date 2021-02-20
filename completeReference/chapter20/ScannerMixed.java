package classes;

import java.util.*;
import java.io.*;

public class ScannerMixed {
  public static void main(String[] args) throws IOException {
    // declaring variables
    int intValue;
    double doubleValue;
    boolean booleanValue;
    String strValue;

    FileWriter file = new FileWriter("text.txt");
    file.write("Testing Scanner 10 12.5 one true two false");
    file.close();

    FileReader readFile = new FileReader("text.txt");

    Scanner src = new Scanner(readFile);

    while(src.hasNext()) {

      if(src.hasNextInt()) {
        intValue = src.nextInt();
        System.out.println("int: " + intValue);
      }

      else if(src.hasNextDouble()) {
        doubleValue = src.nextDouble();
        System.out.println("double: " + doubleValue);
      }

      else if(src.hasNextBoolean()) {
        booleanValue = src.nextBoolean();
        System.out.println("boolean: " + booleanValue);
      }

      else {
        strValue = src.next();
        System.out.println("String: " + strValue);
      }
    }

    src.close();
  }
}
