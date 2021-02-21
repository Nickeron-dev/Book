package classes;

import java.io.*;

public class FileDemo {
  static void prnt(String s) {
    System.out.println(s);
  }
  public static void main(String[] args) {
    File f1 = new File("/java/COPYRIGHT");

    prnt("File Name: " + f1.getName());
    prnt("Path: " + f1.getPath());
    prnt("Abs Path" + f1.getAbsolutePath());
    prnt("Parent: " + f1.getParent());
    prnt(f1.exists() ? "exists" : "does not exist");
    prnt(f1.canWrite() ? "is writable" : "is not writable");
    prnt(f1.canRead() ? "is readable" : "is not readable");
    prnt("is " + (f1.isDirectory() ? "" : "not" + " a directory"));
    prnt(f1.isFile() ? "is a normal file" : "might be a named pipe");
    prnt(f1.isAbsolute() ? "is absolute" : "is not absolute");
    prnt("File last modified: " + f1.lastModified());
    prnt("File size: " + f1.length() + " Bytes");
  }
}
