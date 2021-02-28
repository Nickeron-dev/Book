package classes;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class ExplicitChannelWrite {
  public static void main(String[] args) {
    try (FileChannel fChannel = (FileChannel) Files.newByteChannel(Path.of("test.txt"), StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
      ByteBuffer buff = ByteBuffer.allocate(26);
      for (int i = 0; i < 26; i++) {
        buff.put((byte) ('A' + i));
      }

      buff.rewind();

      fChannel.write(buff);
      } catch (InvalidPathException exc) {
      System.out.println("Path Error: " + exc);
    } catch (IOException exc) {
      System.out.println("I/O Error: " + exc);
      System.exit(1);
    }
  }
}
