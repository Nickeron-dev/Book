package classes;

import java.util.regex.*;

public class RegularExpressionDemo4 {
  public static void main(String[] args) {
    Pattern pat = Pattern.compile("e.+d");
    Matcher mat = pat.matcher("extend cup end table");

    while (mat.find()) {
      System.out.println("test found at index: " + mat.group());
    }
  }
}
