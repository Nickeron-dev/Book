package classes;

import java.io.*;

public class FileInputStreamDemo {
  public static void main(String[] args) {
    int size;

    try (FileInputStream file = new FileInputStream("FileInputStreamDemo.java")) {
      System.out.println("Total Available Bytes: " + (size = file.available()));
      int n = size / 40;
      System.out.println("First " + n + " bytes of the file one read() at a time");
      for(int i = 0; i < n; i++) {
        System.out.print((char) file.read());
      }

      System.out.println("\nStill available: " + file.available());
      System.out.println("Reading the next " + n + " with one read(b[])");

      byte[] b = new byte[n];
      if(file.read(b) != n) {
        System.out.println("couldn't read " + n + " bytes");
      }

      System.out.println(new String(b, 0, n));
      System.out.println("\nStill Available: " + (size = file.available()));
      System.out.println("Skipping half of remaining bytes with skip()");
      file.skip(size / 2);
      System.out.println("\nStill Available: " + file.available());

      System.out.println("Reading " + n / 2 + " into the end of array");
      if(file.read(b, n / 2, n / 2) != n / 2) {
        System.out.println("couldn't read " + n / 2 + " bytes.");
      }

      System.out.println(new String(b, 0, b.length));
      System.out.println("\nStill available: " + file.available());
    } catch(IOException exc) {
      System.out.println("I/O error: " + exc);
    }
  }
}
