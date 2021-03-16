package classes;

import java.util.regex.*;

public class RegularExpressionDemo3 {
  public static void main(String[] args) {
    Pattern pat = Pattern.compile("W+");
    Matcher mat = pat.matcher("W WW WWW");

    while (mat.find()) {
      System.out.println("test found at index: " + mat.group());
    }
  }
}
