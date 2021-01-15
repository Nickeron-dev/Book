package classes;

import java.io.*;

public class ThingsFromStringThatIKnew {
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out, true);

    String helloString = "Hello, ";
    String worldString = "World!";
    String combination = helloString + worldString;
    pw.println(combination + " \nwith length: " + combination.length());

    String strWithNumbers = "number: " + 2 + 2;
    pw.println(strWithNumbers); // will be "number: 22"

    String sum = "number: " + (2 + 2);
    pw.println(sum); // will be "number: 4"
  }
}
