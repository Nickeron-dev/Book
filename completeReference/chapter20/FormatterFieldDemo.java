package classes;

import java.util.*;

public class FormatterFieldDemo {
  public static void main(String[] args) {
    Formatter formField = new Formatter();

    formField.format("|%f|%n|%12f|%n|%012f|", 10.12345, 10.12345, 10.12345);
    System.out.println(formField);
    formField.close();

    // printing formatted 1 -> 10
    Formatter form; // not initializing

    for(int i = 1; i < 10; i++) {
      form = new Formatter();
      form.format("%4d %4d %4d", i, i * i, i * i * i);
      System.out.println(form);
      form.close();
    }

    Formatter fmt = new Formatter();

    fmt.format("%.4f", 123.1234567);
    System.out.println(fmt);
    fmt.close();

    Formatter fmt2 = new Formatter();

    fmt2.format("%16.2e", 123.1234567);
    System.out.println(fmt2);
    fmt2.close();

    Formatter fmtMain = new Formatter();

    fmtMain.format("%.15s", "Formatting with Java is now easy.");
    System.out.println(fmtMain);
    fmtMain.close();
  }
}
