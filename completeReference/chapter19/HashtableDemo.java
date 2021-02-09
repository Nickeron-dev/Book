package classes;

import java.util.*;

public class HashtableDemo {
  public static void main(String[] args) {
    Hashtable<String, Integer> products = new Hashtable<String, Integer>();
    // default capacity is 11

    Enumeration<String> keys;

    products.put("apple", 243);
    products.put("lemon", 3244);
    products.put("mango", 4232);
    products.put("pineapple", 423);

    keys = products.keys(); // put in an enum with keys


    while(keys.hasMoreElements()) {
      String element = keys.nextElement();
      System.out.println(element + ": " + products.get(element)); // get() returns key
    }

    // using Set and keySet()
    Set<String> keySet = products.keySet();
    // creating an Iterator
    Iterator<String> iter = keySet.iterator();
    while(iter.hasNext()) {
      System.out.println(iter.next() + " " + products.get(iter.next()));
    }

    //change value
    int oldPrice = products.get("lemon");
    products.put("lemon", oldPrice + 10000);
    System.out.println("now the price of the lemon is: " + products.get("lemon"));
  }
}
