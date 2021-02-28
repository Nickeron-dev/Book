package classes;

import java.io.*;
import java.nio.file.*;

public class NIOStreamWrite {
  public static void main(String[] args) {
    try (OutputStream fout =
        new BufferedOutputStream(Files.newOutputStream(Path.of("test.txt")))) {
      // Writing bytes into a stream
      for(int i = 0; i < 26; i++) {
        fout.write((byte) ('Z' - i));
      }
    } catch (InvalidPathException exc) {
      System.out.println("Path Error: " + exc);
    } catch (IOException exc) {
      System.out.println("IOException: " + exc);
    }
  }
}
