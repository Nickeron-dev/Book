package classes;

import java.util.regex.*;

public class RegularExpressionDemo7 {
  public static void main(String[] args) {
    String str = "Jon Jonathan Frank Ken Todd";
    Pattern pat = Pattern.compile("Jon.*?");
    Matcher mat = pat.matcher(str);

    System.out.println("Original String: " + str);

    str = mat.replaceAll("Eric ");

    System.out.println("Modified: " + str);
  }
}
