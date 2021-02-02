package classes;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>(10); // 10 by default

    // it is much better to set capacity(maximal length). Otherwise, there will
    // be a huge performance degradaiton

    System.out.println("Current size is: " + list.size());
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.add("E");
    list.add("F");
    list.add("G");
    list.add(1, "M"); // adding with index and value

    // set() method
    list.set(2, "set");
    //list.set(9, "impossible"); // impossible because capacity of ArrayList is smaller

    System.out.println("Current size is: " + list.size());
    System.out.println("ArrayList: " + list);

    // removing
    list.remove("M"); // by element
    list.remove(4); // by index

    System.out.println("Current array: " + list);
    System.out.println("Current size: " + list.size());

    System.out.println("\nNext step is using toArray()");

    String[] simpleArray = new String[list.size()];
    simpleArray = list.toArray(simpleArray);

    //String[] array2 = list.toArray(array2); // impossible because it be a ready array

    System.out.println("Array: " + Arrays.toString(simpleArray));
  }
}
