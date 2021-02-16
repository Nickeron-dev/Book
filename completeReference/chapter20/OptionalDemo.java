package classes;

import java.util.*;
import java.io.*;

public class OptionalDemo {
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out, true);
    Optional<String> empty = Optional.empty(); // this object won't have elements
    Optional<String> containsElement = Optional.of("ABCDEFG"); // this will have

    if(empty.isPresent()) {  // returns true if there are elements
      pw.println("Object 'empty' has got elements");
    }
    else {
      pw.println("Object 'empty' is empty");
    }

    if(containsElement.isPresent()) {
      pw.println("Object 'containsElement' has got: " + containsElement.get());
    }

    String justStr = empty.orElse("Just String");
    pw.println(justStr);
  }
}
