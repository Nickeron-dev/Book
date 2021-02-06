package classes;

import java.util.*;

public class CollectionsAlgorithms {
  public static void main(String[] args) {
    LinkedList<Integer> lList = new LinkedList<Integer>();

    lList.add(124);
    lList.add(-124);
    lList.add(23);
    lList.add(-24);

    Comparator<Integer> sortType = Collections.reverseOrder();

    Collections.sort(lList, sortType); // sorting in reverse order

    System.out.println("Reversed: ");

    for(int i : lList) {
      System.out.print(i + " ");
    }

    System.out.println();

    Collections.shuffle(lList); // Shuffling randomly

    System.out.println("Shuffled: ");

    for(int i : lList) {
      System.out.print(i + " ");
    }

    System.out.println();
    System.out.println("Maximum value: " + Collections.max(lList));
    System.out.println("Minimum value: " + Collections.min(lList));
  }
}
