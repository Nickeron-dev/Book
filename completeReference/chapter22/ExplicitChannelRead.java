package classes;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class ExplicitChannelRead {
  public static void main(String[] args) {
    int count;
    Path filepath = null;

    try {
      filepath = Path.of("test.txt");
    } catch(InvalidPathException exc) {
      System.out.println("Path Error " + exc);
      return; // exiting
    }

    try (SeekableByteChannel fChan = Files.newByteChannel(filepath)) {
      ByteBuffer buff = ByteBuffer.allocate(128);
      do {
        // reading
        count = fChan.read(buff);
        if(count != -1) {
          buff.rewind();
          for(int i = 0; i < count; i++) {
            System.out.print((char) buff.get());
          }
        }
      } while(count != -1);

      System.out.println();
    } catch (IOException exc) {
      System.out.println("I/O Error: " + exc);
    }
  }
}
