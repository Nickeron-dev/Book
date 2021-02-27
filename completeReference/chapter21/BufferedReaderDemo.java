package classes;

import java.io.*;

public class BufferedReaderDemo {
  public static void main(String[] args) {
    String str = "This is a &copy; copyright symbol " + "but this is &copy not.\n";
    char[] buf = new char[str.length()];
    str.getChars(0, str.length(), buf, 0);

    CharArrayReader input = new CharArrayReader(buf);
    int character;
    boolean marked = false;

    try (BufferedReader br = new BufferedReader(input)) {
      while ((character = br.read()) != -1) {
        switch (character) {
          case '&':
            if (!marked) {
              br.mark(32);
              marked = true;
            } else {
              marked = false;
            }
            break;

          case ';':
            if (marked) {
              marked = false;
              System.out.print("(c)");
            } else
              System.out.print((char) character);
            break;

          case ' ':
            if (marked) {
              marked = false;
              br.reset();
              System.out.print("&");
            } else
              System.out.print((char) character);
            break;
          default:
            if (!marked) System.out.print((char) character);
          break;
        }
      }
    } catch (IOException exc) {
      System.out.println("I/O Error: " + exc);
    }
  }
}
