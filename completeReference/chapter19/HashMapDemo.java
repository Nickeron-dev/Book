package classes;

import java.util.*;

public class HashMapDemo {
  public static void main(String[] args) {
    HashMap<String, Double> hMap = new HashMap<String, Double>(7); // capacity

    hMap.put("John", 234.5);
    hMap.put("Peter", 234.5);
    hMap.put("Tom", 2432.1);
    hMap.put("Ivan", 3123.5);
    hMap.put("Maria", 1234.6);
    hMap.put("John", 2342.5); // it won't add new John, it will edit old one

    Set<Map.Entry<String, Double>> set = hMap.entrySet();

    // Displaying whole HashMap
    for(Map.Entry<String, Double> element : set) {
      System.out.println(element.getKey() + " " + element.getValue() +
       ";Printing same with just variable: " + element);
    }

    // changing value
    double oldValue = hMap.get("John");
    hMap.put("John", oldValue + 200);

    System.out.println("Modified balance of John: " + hMap.get("John"));

    System.out.println("Printing HashMap with object variable" + hMap);
  }
}
