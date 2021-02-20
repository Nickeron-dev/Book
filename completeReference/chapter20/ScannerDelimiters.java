package classes;

import java.util.*;
import java.io.*;

public class ScannerDelimiters {
  public static void main(String[] args) throws IOException {
    int count = 0;
    double sum = 0.0;

    FileWriter file = new FileWriter("testing.txt");

    file.write("2, 3.4,      5,6, 7.4, 9.1, 10.5, done");
    file.close();

    FileReader read = new FileReader("testing.txt");

    Scanner scan = new Scanner(read); // so it can read any stream

    // setting delimiters to space and comma
    scan.useDelimiter(", *");

    while(scan.hasNext()) {
      if(scan.hasNextDouble()) {
        sum += scan.nextDouble();
        count++;
      }
      else {
        String str = scan.next();
        if(str.equals("done")) break;
        else {
          System.out.println("File format error");
          return;
        }
      }
    }
    scan.close(); // Provided that we closed Scanner, we don't need to close FileReader
    System.out.println("Average is: " + sum / count);
  }
}
