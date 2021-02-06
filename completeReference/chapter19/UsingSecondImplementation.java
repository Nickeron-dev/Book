package classes;

import java.util.*;

class SecondImplementation implements Comparator<String> {
  public int compare(String first, String second) {
    int i, j, k;

    i = first.lastIndexOf(' ');
    j = second.lastIndexOf(' ');

    k = first.substring(i).compareToIgnoreCase(second.substring(j));
    if(k == 0) return first.compareToIgnoreCase(second);
    else return k;
  }
}

public class UsingSecondImplementation {
  public static void main(String[] args) {
    TreeMap<String, Double> map = new TreeMap<String, Double>(new SecondImplementation());

    map.put("Lemon Johnson", 432.5);
    map.put("Tod Hall", 234.6);
    map.put("Jane Baker", 99.3);
    map.put("Tom Raider", 5343.6);
    map.put("Ralph Smith", 423.5);
    map.put("John Petrov", 4234.5);

    Set<Map.Entry<String, Double>> setOfValues = map.entrySet();

    for(Map.Entry<String, Double> element : setOfValues) {
      System.out.println(element.getKey() + " " + element.getValue());
    }

    System.out.println();

    // Changing
    double oldValue = map.get("Tom Raider");
    map.put("Tom Raider", oldValue + 10000);

    System.out.println("Tom's balance is: " + map.get("Tom Raider"));
  }
}
