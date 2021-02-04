package classes;

import java.util.*;

public class IteratorListIteratorDemo {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>(10); // 10 by default

    // adding
    list.add("First");
    list.add("Second");
    list.add("Third");
    list.add("Fourth");
    list.add("Fifth");
    list.add("Sixth");
    list.add("Seventh");

    System.out.println("Entire ArrayList: ");

    // creating an Iterator with no arguments
    Iterator<String> iterate = list.iterator();
    while(iterate.hasNext()) { // this method returns true if there is an element on next position
      String element = iterate.next(); // get element
      System.out.print(element + " ");
    }

    // Modify elements in ArrayList
    ListIterator<String> listIter = list.listIterator();
    while(listIter.hasNext()) {
      String element = listIter.next(); // putting it into a String
      listIter.set(element + "+"); // listIter has got each time next element and modifies it
    }

    System.out.println("\n\nDisplaying modified ArrayList by Iterator: ");
    iterate = list.iterator(); // recreating it. Otherwise, it will
                              // continue getting next elements which don't exist
    while(iterate.hasNext()) {
      String element = iterate.next(); // get next element
      System.out.print(element + " ");
    }

    System.out.println("\n\nDisplaying modified ArrayList backwards by ListIterator: ");
    // listIter is at the end so we don't need to reinitialize it in order to move backwards
    while(listIter.hasPrevious()) {
      String element = listIter.previous(); // get previous element
      System.out.print(element + " ");
    }

    System.out.println("\n"); // just for normal further work with terminal

    System.out.println("And now printing the whole array in colomn with for loop: ");

    for(String str : list) {
      System.out.println(str + " ");
    }
  }
}
