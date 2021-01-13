package classes;

import java.io.*;

public class StringConstructorsExamples {
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out, true);

    // String constructor exapmple
    char[] charArray = {'H', 'e', 'l', 'l', 'o'};
    String str = new String(charArray);
    pw.println(str);

    // String(char char[], int startIndex, int numChars);
    String secondString = new String(charArray, 2, 3);
    pw.println(secondString);

    // String(String obj)
    String objString = new String(str);

    // byte value is 8-bit(ASCII)
    // char value is 16-bit(Unicode)
    byte[] byteArray = {63, 64, 65, 66, 67};
    String stringFromByteArray = new String(byteArray);
    pw.println(stringFromByteArray);

    String deadlinedStringFromByte = new String(byteArray, 1, 4);
    pw.println(deadlinedStringFromByte);
    // NOTE: it wouldn't show the error in compiling. Only when showing the result.
  }
}
