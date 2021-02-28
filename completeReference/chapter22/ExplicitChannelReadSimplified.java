package classes;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class ExplicitChannelReadSimplified {
  public static void main(String[] args) {
    int count;

    try (SeekableByteChannel channel = Files.newByteChannel(Path.of("test.txt"))) {
      ByteBuffer buff = ByteBuffer.allocate(128);

      do {
        count = channel.read(buff);

        if(count != -1) {
          buff.rewind();

          for(int i = 0; i < count; i++) {
            System.out.print((char) buff.get());
          }
        }
      } while (count != -1);
      System.out.println();
    } catch(InvalidPathException exc) {
      System.out.println("Path Error: " + exc);
    } catch(IOException exc) {
      System.out.println("I/O Error: " + exc);
    }
  }
}
