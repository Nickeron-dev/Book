package classes;

import java.io.*;

public class PushbackInputStreamDemo {
  public static void main(String[] args) {
    String str = "if (a == 4) a = 0;";
    byte[] buf = str.getBytes();
    ByteArrayInputStream input = new ByteArrayInputStream(buf);
    int character;

    try (PushbackInputStream pushStream = new PushbackInputStream(input)) {
      while((character = pushStream.read()) != -1) {
        switch(character) {
        case '=':
          if ((character = pushStream.read()) == '=') {
            System.out.print(".equal.");
          }
          else {
            System.out.print("<-");
            pushStream.unread(character);
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
    System.out.println();
  }
}
