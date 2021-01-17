package classes;

import java.io.*;

public class StartsWithAndEndsWith {
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out, true);
    pw.println("String 'footbar' ends with 'bar'? -> " + "footbar".endsWith("bar"));
    pw.println("String 'footbar' starts with 'foot'? -> " + "footbar".startsWith("foot"));
  }
}
