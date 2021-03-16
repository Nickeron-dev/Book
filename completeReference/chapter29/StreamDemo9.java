package classes;

import java.util.*;
import java.util.stream.*;

public class StreamDemo9 {
  public static void main(String[] args) {
    ArrayList<String> myList = new ArrayList<String>( );

    myList.add("One");
    myList.add("Two");
    myList.add("Three");
    myList.add("Four");
    myList.add("Five");
    myList.add("Six");

    Stream<String> myStream = myList.stream();

    Spliterator<String> iteratorStream = myStream.spliterator();

    while (iteratorStream.tryAdvance((obj) -> System.out.println(obj)));
  }
}
