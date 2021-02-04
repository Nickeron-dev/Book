package classes;

import java.util.TreeSet;

public class TreeSetDemo {
  public static void main(String[] args) {
    TreeSet<String> tree = new TreeSet<String>();

    tree.add("In tree");
    tree.add("Everything");
    tree.add("is stored");
    tree.add("in order");
    tree.add("as it was added");
    tree.add("In tree"); // trying to add a duplicate

    // it is a set so it doesn't allow adding duplicates

    System.out.println("Here is a TreeSet: " + tree);
  }
}
