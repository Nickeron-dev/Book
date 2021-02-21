package classes;

import java.io.*;

public class DirListOnly {
  public static void main(String[] args) {
    String dirname = "/java";
    File file = new File(dirname);
    FilenameFilter only = new OnlyExt("html");
    String[] s = file.list(only);

    for(int i = 0; i < s.length; i++) {
      System.out.println(s[i]);
    }
  }
}
