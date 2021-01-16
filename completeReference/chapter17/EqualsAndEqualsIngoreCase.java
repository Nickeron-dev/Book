package classes;

import java.io.*;

public class EqualsAndEqualsIngoreCase {
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out, true);

    String s1 = "Hello";
    String s2 = "Hello";
    String s3 = "HELLO";
    String different = "different";
    pw.println(s1 + " equals " + s2 + "? => " + s1.equals(s2));
    pw.println(s2 + " equals " + s3 + "? => " + s2.equals(s3));
    pw.println(s3 + " equals " + different + "? => " + s3.equals(different));
    pw.println(s1 + " equalsIgnoreCase " + s3 + " ? => " + s1.equalsIgnoreCase(s3));
  }
}
