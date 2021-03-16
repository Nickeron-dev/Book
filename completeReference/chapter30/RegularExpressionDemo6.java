package classes;

import java.util.regex.*;

public class RegularExpressionDemo6 {
  public static void main(String[] args) {
    Pattern pat = Pattern.compile("[a-z]+");
    Matcher mat = pat.matcher("this is a test.");

    while (mat.find()) {
      System.out.println("test found at index: " + mat.group());
    }
  }
}
