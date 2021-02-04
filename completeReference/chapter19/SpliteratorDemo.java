package classes;

import java.util.*;

public class SpliteratorDemo {
  public static void main(String[] args) {
    ArrayList<Double> doubleArrayList = new ArrayList<Double>(10);
    // I always put capacity in constructor not to forget that performance
    // degradates without it.
    double counter = 1.0;
    for(int i = 0; i < 5; i++) { 
      doubleArrayList.add(counter++);
    }

    // using tryAdvance() to display the ArrayList
    System.out.println("ArrayList: ");
    Spliterator<Double> spliter = doubleArrayList.spliterator();
    while(spliter.tryAdvance((n) -> System.out.println(n + " ")));
    System.out.println();

    spliter = doubleArrayList.spliterator(); // reinitializing in order to come at the beginning
    ArrayList<Double> squares = new ArrayList<Double>(10);
    while(spliter.tryAdvance((n) -> squares.add(Math.sqrt(n))));

    System.out.println("Contents of squares: ");
    spliter = squares.spliterator(); // reinitializing in order to come at the beginning
    spliter.forEachRemaining((n) -> System.out.println(n));
    System.out.println();
  }
}
