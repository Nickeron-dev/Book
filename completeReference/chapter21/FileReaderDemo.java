package classes;

import java.io.*;

public class FileReaderDemo {
  public static void main(String[] args) {
    try (FileReader file = new FileReader("test.txt")) {
      int character;

      while((character = file.read()) != -1) {
        System.out.print((char) character);
      }
    } catch(IOException exc) {
      System.out.println(exc);
    }
    System.out.println();
  }
}
