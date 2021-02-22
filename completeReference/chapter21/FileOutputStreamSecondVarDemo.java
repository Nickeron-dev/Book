package classes;

import java.io.*;

public class FileOutputStreamSecondVarDemo {
  public static void main(String[] args) {
    String source = "Now is the time for all good men\n" +
     " to come to the aid of their country\n" +
     " and pay their due taxes.";
    byte[] array = source.getBytes();

    try(FileOutputStream file1 = new FileOutputStream("file1.txt");
        FileOutputStream file2 = new FileOutputStream("file2.txt");
        FileOutputStream file3 = new FileOutputStream("file3.txt")) {
      for(int i = 0; i < array.length; i += 2) file1.write(array[i]);

      file2.write(array);

      file3.write(array, array.length - array.length / 4, array.length / 4);
    } catch(IOException exc) {
      System.out.println("An I/O Error occurred");
    }
  }
}
