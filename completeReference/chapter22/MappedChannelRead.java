package classes;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class MappedChannelRead {
  public static void main(String[] args) {
    try (FileChannel channel = (FileChannel) Files.newByteChannel(Path.of("test.txt"))) {
      long size = channel.size();

      MappedByteBuffer buff = channel.map(FileChannel.MapMode.READ_ONLY, 0, size);

      for(int i = 0; i < size; i++) {
        System.out.print((char) buff.get());
      }
      System.out.println();
    } catch (InvalidPathException exc) {
      System.out.println("Path error: " + exc);
    } catch (IOException exc) {
      System.out.println("I/O Error: " + exc);
    }
  }
}
