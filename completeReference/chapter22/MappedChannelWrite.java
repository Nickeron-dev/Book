package classes;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class MappedChannelWrite {
  public static void main(String[] args) {
    try (FileChannel fChan = (FileChannel)
        Files.newByteChannel(Path.of("test.txt"),
        StandardOpenOption.WRITE,
        StandardOpenOption.READ,
        StandardOpenOption.CREATE)) {
      MappedByteBuffer buff = fChan.map(FileChannel.MapMode.READ_WRITE, 0, 26);

      for(int i = 0; i < 26; i++) {
        buff.put((byte)('A' + i));
      }
    } catch (InvalidPathException exc) {
      System.out.println("Path Error: " + exc);
    } catch (IOException exc) {
      System.out.println("I/O error: " + exc);
    }
  }
}
