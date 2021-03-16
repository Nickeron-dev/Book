package classes;

import java.util.*;
import java.util.stream.*;

public class StreamDemo10 {
  public static void main(String[] args) {
    ArrayList<String> myList = new ArrayList<String>( );

    myList.add("One");
    myList.add("Two");
    myList.add("Three");
    myList.add("Four");
    myList.add("Five");
    myList.add("Six");

    Stream<String> myStream = myList.stream();

    Spliterator<String> spliteratorStream = myStream.spliterator();

    Spliterator<String> spliteratorStream2 = spliteratorStream.trySplit();

    if (spliteratorStream2 != null) {
      System.out.println("Output form spliteratorStream2: ");
      spliteratorStream2.forEachRemaining((obj) -> System.out.println(obj));
    }

    System.out.println("\nOutput from spliteratorStream: ");
    spliteratorStream.forEachRemaining((obj) -> System.out.println(obj));
  }
}
