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
    set.add("John"); // trying to add a duplicate

    // the main difference between sets and lists is that sets don't allow duplicates

    // also, hash means that elements aren't stored as a sertain
    // sequence(their order might be different)

    System.out.println(set);
  }
}
