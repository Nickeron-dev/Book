package classes;

import java.io.*;

public class CharArrayReaderDemo {
  public static void main(String[] args) {
    String tmp = "abcdefghijklmnopqrstuvwxyz";
    int length = tmp.length();
    char[] array = new char[length];
    tmp.getChars(0, length, array, 0);
    int i;

    try (CharArrayReader readF = new CharArrayReader(array)) {
      System.out.println("readF is: ");
      while((i = readF.read()) != -1) {
        System.out.print((char) i);
      }
      System.out.println();
    } catch(IOException exc) {
      System.out.println("I/O Error: " + exc);
    }

    try (CharArrayReader readF1 = new CharArrayReader(array, 0, 5)) {
      System.out.println("readF1 is: ");
      while((i = readF1.read()) != -1) {
        System.out.print((char) i);
      }
      System.out.println();
    } catch(IOException exc) {
      System.out.println("I/O Error: " + exc);
    }
  }
}
