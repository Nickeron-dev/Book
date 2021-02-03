package classes;

import java.util.*;

public class HashSetDemo {
  public static void main(String[] args) {
    HashSet<String> set = new HashSet<String>(10);

    set.add("John");
    set.add("Someone");
    set.add("Lemon");
    set.add("Terry");
    set.add("George");

    System.out.println(set);
  }
}
