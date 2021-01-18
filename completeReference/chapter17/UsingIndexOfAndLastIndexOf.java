package classes;

import java.io.*;

public class UsingIndexOfAndLastIndexOf {
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out, true);
    String str = "This is a String for using indexOf() and lastIndexOf() methods";
    pw.println("First index of 'a' is: " + str.indexOf('a'));
    pw.println("Last index of 'a' is: " + str.lastIndexOf('a'));
    pw.println("First index of String 'Of' is: " + str.indexOf("Of"));
    pw.println("Last index of String 'Of' is: " + str.lastIndexOf("Of"));
    pw.println("First index of 'a' from 9th element is: " + str.indexOf('a', 9));
    pw.println("Last index of 'a' from 9th element is: " + str.lastIndexOf('a', 9));
    pw.println("First index of String 'and' from 9th element is: " + str.indexOf("and", 9));
    pw.println("Last index of 'and' from 9th element is: " + str.lastIndexOf("and", 9));
  }
}
