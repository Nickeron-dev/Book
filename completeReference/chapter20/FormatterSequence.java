package classes;

import java.util.*;
import java.io.*;

public class FormatterSequence {
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out, true);
    Formatter form = new Formatter();
    Calendar cal = Calendar.getInstance();

    form.format("%3$d %1$d %2$d", 10, 20, 30);
    pw.println(form);
    form.close();

    try (Formatter formNew = new Formatter()) { // so I won't need to close it
      formNew.format("Today is the day %te of %<tB, %<tY", cal);
      System.out.println(formNew);
    }
  }
}
