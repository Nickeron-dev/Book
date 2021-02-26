package classes;

import java.io.*;

public class FileWriterDemo {
  public static void main(String[] args) {
    String src = "Now is the time for all good men\n"
      + " to come to the aid of their country\n"
      + " and pay their due taxes.";
    char[] buffer = new char[src.length()];
    src.getChars(0, src.length(), buffer, 0);

    try (FileWriter f4 = new FileWriter("file4.txt");
         FileWriter f5 = new FileWriter("file5.txt");
         FileWriter f6 = new FileWriter("file6.txt")) {
      for(int i = 0; i < buffer.length; i++) {
        f4.write(buffer[i]);
      }

      f5.write(buffer);

      f6.write(buffer, buffer.length-buffer.length/4, buffer.length/4);
    } catch(IOException exc) {
      System.out.println("An I/O Error Occurred");
    }
  }
}
