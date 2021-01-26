package classes;

import java.io.*;

public class ReplaceSubstringIndexOf {
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out, true);
    StringBuffer stringB = new StringBuffer("I like Java");

    pw.println("Before: " + stringB);

    stringB.replace(2, 6, "love"); // replaces "like" to "love"
    pw.println("After: " + stringB);

    // prints the substring from index 2 to index 6
    pw.println("Substring of variable from 2 to 6 is: " + stringB.substring(2, 6));

    stringB.append("I"); // adding "I" in the end in order to have same elements in String
    pw.println("First index of I is: " + stringB.indexOf("I"));
    pw.println("Last index of I is: " + stringB.lastIndexOf("I"));
  }
}
