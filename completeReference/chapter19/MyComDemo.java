package classes;

import java.util.*;

class MyCompare implements Comparator<String> {
  public int compare(String str, String str1) {
    return str1.compareTo(str);
  }
}

public class MyComDemo {
  public static void main(String[] args) {
    // creating a TreeSet in order to use implemented Comparator
    //TreeSet<String> customSet = new TreeSet<String>(new MyCompare()); // using implementation
    TreeSet<String> set = new TreeSet<String>();
    TreeSet<String> customSet = new TreeSet<String>((String str, String str1) -> str1.compareTo(str));
    // using lambda

    set.add("M");
    set.add("P");
    set.add("O");
    set.add("L");
    set.add("T");
    set.add("L"); // impossible because "L" element already exist

    System.out.println("Alphabet order");

    for(String element : set) {
      System.out.print(element + " ");
    }

    System.out.println();

    customSet.add("M");
    customSet.add("P");
    customSet.add("O");
    customSet.add("L");
    customSet.add("T");
    customSet.add("L"); // impossible because "L" element already exist

    System.out.println("Cutom order");

    for(String element : set) {
      System.out.println(element + " ");
    }
  }
}
