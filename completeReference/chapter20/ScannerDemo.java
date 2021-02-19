package classes;

import java.util.*;

public class ScannerDemo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int count = 0;
    double sum = 0.0;

    System.out.println("Enter some numbers(int and double)");

    while(scan.hasNext()) { // something is inputted
      if(scan.hasNextDouble()) {
        double doubleInput = scan.nextDouble();
        //System.out.println("String: " + doubleInput);
        sum += doubleInput;
        count++;
      }
      else {
        String stringInput = scan.next();
        //System.out.println("String: " + stringInput);
        if(stringInput.equals("done")) break;
        else {
          System.out.println("data error");
          return;
        }
      }
    }
      scan.close();
      System.out.println("Average: " + sum / count);

  }
}
