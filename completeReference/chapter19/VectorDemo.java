package classes;

import java.util.*;

public class VectorDemo {
  public static void main(String[] args) {
    Vector<Integer> vec = new Vector<Integer>(3, 2);

    System.out.println("Current size: " + vec.size());
    System.out.println("Current capacity: " + vec.capacity());

    vec.addElement(1);
    vec.addElement(2);
    vec.addElement(3);
    vec.addElement(4);

    System.out.println("Capacity after adding 4:" + vec.capacity());
    vec.addElement(5);
    System.out.println("Capacity after adding 5:" + vec.capacity());
    vec.addElement(6);
    vec.addElement(7);
    System.out.println("Capacity after adding 7:" + vec.capacity());
    vec.addElement(8);
    vec.addElement(9);
    System.out.println("Capacity after adding 9:" + vec.capacity());
    vec.addElement(10);
    vec.addElement(11);
    System.out.println("Capacity after adding 11:" + vec.capacity());
    vec.addElement(12);
    System.out.println("Capacity after adding 12:" + vec.capacity());

    System.out.println("First element: " + vec.firstElement());
    System.out.println("Last element: " + vec.lastElement());

    if(vec.contains(3)) System.out.println("It contains 3");

    // Enumerate
    Enumeration<Integer> myEnum = vec.elements();

    System.out.println("Printing enumeration: ");
    while(myEnum.hasMoreElements()) System.out.print(myEnum.nextElement() + " ");

    System.out.println();

    // using Iterator
    System.out.println("using Iterator: ");
    Iterator<Integer> iterator = vec.iterator();
    while(iterator.hasNext()) {
      System.out.print(iterator.next() + " ");
    }
    System.out.println(); // for normal ending program
  }
}
