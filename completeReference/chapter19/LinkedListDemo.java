package classes;

import java.util.*;

public class LinkedListDemo {
  public static void main(String[] args) {
    LinkedList<Integer> linkList = new LinkedList<Integer>();

    linkList.add(2);
    linkList.add(5);
    linkList.add(3);
    linkList.add(8);
    linkList.addFirst(10);
    linkList.addLast(22);

    System.out.println("This is my list: " + linkList);
    System.out.println("Size is: " + linkList.size());

    linkList.remove(2);
    linkList.removeFirst();

    System.out.println("This is my list after removing: " + linkList);

    Integer number = linkList.get(3); // we put index in constructor
    int numberint = linkList.get(1);

    linkList.set(2, 65); // deletes element on index 2 and puts there 65

    System.out.println("This is my list after everything" + linkList);

  }
}
