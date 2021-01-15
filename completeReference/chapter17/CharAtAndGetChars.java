package classes;

import java.io.*;

public class CharAtAndGetChars {
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out, true);

    char chr = "hello".charAt(3); // getting character at index 3
    pw.println(chr);

    String givenString = "This string is for test";
    int startIndex = 5;
    int finishIndex = 10;
    // one of constructors is:
    // void getChars(startIndex, finishIndex, targetString, targetStart);
    char[] array = new char[finishIndex - startIndex];
    givenString.getChars(startIndex, finishIndex, array, 0); // using it
    pw.println(array);
    // here I used toCharArray() which I already knew
  }
}
