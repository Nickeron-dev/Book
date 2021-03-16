package classes;

import java.util.*;
import java.util.stream.*;

public class StreamDemo6 {
  public static void main(String[] args) {
    ArrayList<Double> myList = new ArrayList<>( );

    myList.add(7.0);
    myList.add(18.0);
    myList.add(10.0);
    myList.add(24.0);
    myList.add(17.0);
    myList.add(5.0);

    System.out.print("Original values in myList: ");
    myList.stream().forEach((obj) -> {
      System.out.print(obj + " ");
    });
    System.out.println();

    IntStream streamMap = myList.stream().mapToInt((obj) -> (int) Math.ceil(obj));

    System.out.println("The ceilings of the values in myList: ");
    streamMap.forEach((obj) -> {
      System.out.println(obj + " ");
    });
  }
}
