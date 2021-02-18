package classes;

import java.util.*;

public class JustifyingFormatterFlags {
  public static void main(String[] args) {
    Formatter formRight = new Formatter();

    formRight.format("|%10.2f|", 123.123);
    System.out.println(formRight);
    formRight.close();

    Formatter formLeft = new Formatter();

    formLeft.format("|%-10.2f|", 123.123);
    System.out.println(formLeft);
    formLeft.close();

    System.out.println("\nSecond part of the program\n");

    Formatter formNumberPlus = new Formatter();
    formNumberPlus.format("%+d", 100);
    System.out.println(formNumberPlus);
    formNumberPlus.close();

    Formatter formPositiveNumber = new Formatter();
    formPositiveNumber.format("% d", 100);
    System.out.println(formPositiveNumber);
    formPositiveNumber.close();

    Formatter formNegative = new Formatter();
    formNegative.format("%d", -100);
    System.out.println(formNegative);
    formNegative.close();
  }
}
