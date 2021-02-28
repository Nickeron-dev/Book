package classes;

import java.io.*;
import java.nio.file.*;

public class ShowFile {
  public static void main(String[] args) {
    int i;

    if(args.length != 1) {
      System.out.println("Usage: ShowFile filename");
      return;
    }

    try (InputStream fin = Files.newInputStream(Path.of(args[0]))) {
      do {
        i = fin.read();
        if (i != -1) System.out.print((char) i);
      } while (i != -1);
    } catch(InvalidPathException exc) {
      System.out.println("Path Error: " + exc);
    } catch (IOException exc) {
      System.out.println("I/O Error: " + exc);
    }
    
    System.out.println();
  }
}
