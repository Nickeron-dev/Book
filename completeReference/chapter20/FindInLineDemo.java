package classes;

import java.util.*;

public class FindInLineDemo {
  public static void main(String[] args) {
    String str = "Name: Tom Age: 28 ID: 77";
    // without space it works also
    Scanner scan = new Scanner(str);

    scan.findInLine("Age:");

    if(scan.hasNext())
      System.out.println(scan.next());
    else
      System.out.println("Error!");
    scan.close();
  }
}
