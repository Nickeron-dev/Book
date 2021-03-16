package classes;

import java.util.regex.*;

public class RegularExpressionDemo8 {
  public static void main(String[] args) {
    Pattern pat = Pattern.compile("[ ,.!]");

    String[] array = pat.split("one two,alpha9 12!done.");

    for (int i = 0; i < array.length; i++) {
      System.out.println("Next tocken: " + array[i]);
    }
  }
}
