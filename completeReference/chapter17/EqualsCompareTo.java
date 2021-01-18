package classes;

import java.io.*;

public class EqualsCompareTo {
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out, true);
    String str1 = "I am String one";
    String str2 = new String(str1);
    System.out.println(str1 + " equals() " + str2 + "? " + str1.equals(str2));
    System.out.println(str1 + " == " + str2 + "? " + (str1 == str2));
    // two strings are different in case of == because str1 and str2 are not referred
    // from one object
    String[] arrayOfStrings = {"Hello", "this", "is", "an", "array", "of", "strings"};
    pw.println("Here is the first example of using compareTo()");
    for(int i = 0; i < arrayOfStrings.length; i++) {
      for(int j = i + 1; j < arrayOfStrings.length; j++) {
        if(arrayOfStrings[i].compareTo(arrayOfStrings[j]) < 0) {
          // so element on index i is before element on index j(in dictionary(ASCII))
          pw.println(arrayOfStrings[i]);
          pw.flush();
        }
      }
    }
    pw.println("Here is the second example of using compareToIgnoreCase()");
    for(int i = 0; i < arrayOfStrings.length; i++) {
      for(int j = i + 1; j < arrayOfStrings.length; j++) {
        if(arrayOfStrings[i].compareToIgnoreCase(arrayOfStrings[j]) < 0) {
          // so it goes before the second element in dictionary
          pw.println(arrayOfStrings[i]);
          pw.flush();
        }
      }
    }
  }
}
