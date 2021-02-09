package classes;

import java.util.*;

public class PropertiesDemo {
  public static void main(String[] args) {
    var statesAndCapitals = new Properties();

    statesAndCapitals.setProperty("Illinois", "Springfield");
    statesAndCapitals.setProperty("Missouri", "Jefferson City");
    statesAndCapitals.setProperty("Washington", "Olympia");
    statesAndCapitals.setProperty("California", "Sacramento");
    statesAndCapitals.setProperty("Indiana", "Indianapolis");

    // Get a set of keys
    Set<?> keys = statesAndCapitals.keySet();

    for(Object name : keys) {
      System.out.println("The capital of " + name + " is " +
        statesAndCapitals.getProperty((String)name));
        // var name is an object now so we must convert it to String
    }

    System.out.println();

    // trying to get value that does not exist
    String capital = statesAndCapitals.getProperty("Florida", "Not Found");
    // second element in constructor is default(it will return it if it won't be found)
    System.out.println("The capital of Florida is " + capital);

    // trying to get value that does not exist
    String capitalNull = statesAndCapitals.getProperty("Florida");
    // second element in constructor is default(it will return it if it won't be found)
    System.out.println("The capital of Florida is " + capitalNull);

    System.out.println();

    Set<?> secondSet = statesAndCapitals.keySet();
    for(Object name : secondSet) {
      System.out.println("The capital of " + name + " is " +
        statesAndCapitals.getProperty((String)name));
    }
  }
}
