package classes;

import java.io.*;

public class FileOutputStreamDemo {
  public static void main(String[] args) {
    String source = "Now is the time for all good men\n" +
     " to come to the aid of their country\n" +
     " and pay their due taxes.";
    byte[] array = source.getBytes();

    // just declaring
    FileOutputStream file1 = null;
    FileOutputStream file2 = null;
    FileOutputStream file3 = null;

    try {
      file1 = new FileOutputStream("file1.txt");
      file2 = new FileOutputStream("file2.txt");
      file3 = new FileOutputStream("file3.txt");

      for(int i = 0; i < array.length; i += 2) file1.write(array[i]);

      file2.write(array);

      file3.write(array, array.length - array.length / 4, array.length / 4);
    } catch(IOException exc) {
      System.out.println("An I/O Error occurred");
    } finally {
      try {
        if(file1 != null) file1.close();
      } catch(IOException exc) {
        System.out.println("Closing file1.txt error");
      }
      try {
        if(file2 != null) file2.close();
      } catch(IOException exc) {
        System.out.println("Closing file2.txt error");
      }

      try {
        if(file3 != null) file3.close();
      } catch(IOException exc) {
        System.out.println("Closing file3.txt error");
      }
    }
  }
}
