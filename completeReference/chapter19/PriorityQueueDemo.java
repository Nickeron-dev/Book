package classes;

import java.util.*;

public class PriorityQueueDemo {
  public static void main(String[] args) {
    Queue collection = new PriorityQueue();
    collection.offer("one"); // offer is same as add() method
    collection.offer("two");
    collection.offer("three");
    //collection.add("four"); // same as offer(it adds element)
    for(int i = 0; i < collection.size(); i++) {
      System.out.println("Element on i is: " + collection.peek()); // peek() just takes an element
    }
    System.out.println("Entire queue: " + collection); // just printing queue without loop
    String polledElement = (collection.poll()).toString(); // takes element
    System.out.println("Queue after polling element 'two': " + collection);
    // something strange is with PriorityQueue
  }
}
