package classes;

import java.util.*;
import java.io.*;

public class Avg {
  public static void main(String[] args) throws IOException {
    int count = 0;
    double sum = 0.0;

    FileWriter fout = new FileWriter("test.txt");
    fout.write("2 3.4 5 6 7 8 9 10.5 done");
    fout.close();

    FileReader fin = new FileReader("test.txt");

    Scanner src = new Scanner(fin);

    while(src.hasNext()) {
      if(src.hasNextDouble()) {
        sum += src.nextDouble();
        count++;
      }

      else {
        String str = src.next();
        if(str.equals("done")) {
          break;
        }
        else {
          System.out.println("File format error.");
          return;
        }
      }
    }

    src.close();
    System.out.println("Averg is: " + sum / count);
  }
}
