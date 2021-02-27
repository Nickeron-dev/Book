package classes;

import java.io.*;

public class PushbackReaderDemo {
  public static void main(String[] args) {
    String str = "if (a == 4) a = 0;\n";
    char[] buf = new char[str.length()];
    str.getChars(0, str.length(), buf, 0);
    CharArrayReader input = new CharArrayReader(buf);

    int character;

    try (PushbackReader read = new PushbackReader(input)) {
      while ((character = read.read()) != -1) {
        switch (character) {
          case '=':
            if ((character = read.read()) == '=')
              System.out.print(".eq.");
            else {
              System.out.print("<-");
              read.unread(character);
            }
            break;
          default:
            System.out.print((char) character);
            break;
        }
      }
    } catch(IOException exc) {
      System.out.println("I/O Error: " + exc);
    }
  }
}
