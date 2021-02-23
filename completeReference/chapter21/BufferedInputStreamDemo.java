package classes;

import java.io.*;

public class BufferedInputStreamDemo {
  public static void main(String[] args) {
    String str = "This is a &copy; copyright symbol " +
      "but this is &copy not.\n";
    byte[] array = str.getBytes();

    ByteArrayInputStream in = new ByteArrayInputStream(array);
    int c;
    boolean marked = false;

    try (BufferedInputStream f = new BufferedInputStream(in)) {
      while((c = f.read()) != -1) {
        switch(c) {
        case '&':
          if(!marked) {
            f.mark(32);
            marked = true;
          } else {
            marked = false;
          }
          break;
        case ';':
          if(marked) {
            marked = false;
            System.out.print("(c)");
          } else {
            System.out.print((char) c);
          }
          break;
        case ' ':
          if(marked) {
            marked = false;
            f.reset();
            System.out.print("&");
          } else {
            System.out.print((char) c);
          }
          break;
        default:
          if(!marked) {
            System.out.print((char) c);
          }
          break;
        }
      }
    } catch(IOException exc) {
      System.out.println("I/O Error: " + exc);
    }
  }
}
