package classes;

import java.util.*;

public class TreeMapDemo {
  public static void main(String[] args) {
    var tMap = new TreeMap<String, Double>(); // no capacity

    // putting
    tMap.put("John", 2343.1);
    tMap.put("Harry", 423.5);
    tMap.put("Mary", 432.5);
    tMap.put("John", 654.2); // this won't add one more John, it will edit old one
    tMap.put("Tom", 4234.);

    Set<Map.Entry<String, Double>> set = tMap.entrySet();

    for(Map.Entry<String, Double> item : set) { // it just goes through all element in set(variable)
      System.out.println("Just with variable: " + item +
              ". Same with methods: " + item.getKey() + ": " + item.getValue());
    }

    // Editing someone's value
    double oldValue = tMap.get("Harry"); // getting his value(423.5)
    tMap.put("Harry", oldValue + 4234); // just putting in Harry new value

    System.out.println(tMap); // printing TreeMap with just object variable
    System.out.println("Modified Harry: " + tMap.get("Harry"));
  }
}
