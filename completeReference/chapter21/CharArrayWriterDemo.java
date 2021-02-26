package classes;

import java.io.*;

public class CharArrayWriterDemo {
  public static void main(String[] args) {
    CharArrayWriter write = new CharArrayWriter();
    String content = "This should end up in the array";
    char[] buffer = new char[content.length()];

    content.getChars(0, content.length(), buffer, 0);

    try {
      write.write(buffer);
    } catch(IOException exc) {
      System.out.println("Error Writing to Buffer");
      return;
    }

    System.out.println("Buffer as a String");
    System.out.println(content.toString());
    System.out.println("Into array");

    char[] array = write.toCharArray();
    for(int i = 0; i < array.length; i++) {
      System.out.print(array[i]);
    }

    System.out.println("\nTo a FileWriter()");

    try (FileWriter fw = new FileWriter("FileWriter.txt")) {
      write.writeTo(fw);
    } catch(IOException exc) {
      System.out.println("I/O Error: " + exc);
    }

    System.out.println("Doing a reset");
    write.reset();

    for(int i = 0; i < 3; i++) write.write('X');

    System.out.println(write.toString());
  }
}
