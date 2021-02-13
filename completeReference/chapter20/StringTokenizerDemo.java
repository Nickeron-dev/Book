package classes;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
  static String str = "Hello=java;" + "name=Illia;" + "user=User;" + "util=Collections;";
  public static void main(String[] args) {
    StringTokenizer tokenizer = new StringTokenizer(str, "=;");
    while(tokenizer.hasMoreTokens()) {
      String key = tokenizer.nextToken();
      String value = tokenizer.nextToken();
      System.out.println(key + " is: " + value);
    }
  }
}
