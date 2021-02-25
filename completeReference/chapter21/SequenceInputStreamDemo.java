package classes;

import java.io.*;
import java.util.*;

public class SequenceInputStreamDemo {
  public static void main(String[] args) {
    int character;
    Vector<String> files = new Vector<String>();

    files.addElement("file1.txt");
    files.addElement("file2.txt");
    files.addElement("file3.txt");

    InputStreamEnumerator ise = new InputStreamEnumerator(files);
    InputStream input = new SequenceInputStream(ise);

    try {
      while ((character = input.read()) != -1) {
        System.out.print((char) character);
      }
    } catch (IOException exc) {
      System.out.println("I/O Error: " + exc);
    } finally {
      try {
        input.close();
      } catch(IOException exc) {
        System.out.println("Error Closing SequenceInputStream");
      }
    }

  }
}
