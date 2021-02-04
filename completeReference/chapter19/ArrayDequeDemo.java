package classes;

import java.util.*;

public class ArrayDequeDemo {
  public static void main(String[] args) {
    ArrayDeque<String> arrayD = new ArrayDeque<String>(20); // default is 16

    // using ArrayDeque as a stack
    arrayD.push("One");
    arrayD.push("Two");
    arrayD.push("Three");
    arrayD.push("Four");
    arrayD.push("Five");
    arrayD.push("Six");

    System.out.println("Popping the stack: ");
    while(arrayD.peek() != null) {
      System.out.println(arrayD.pop() + " ");
    }
    System.out.println();
  }
}
