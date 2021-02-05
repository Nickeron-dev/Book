package classes;

import java.util.*;
import java.io.*;

public class People {
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out, true);
    List<Person> list = new LinkedList<Person>();
    // it is better(higher performance) to create an ArrayList because it will be short

    var otto = new Person("Otto", 54, "Berlin", "Programmer");
    var john = new Person("John", 65, "New York", "Software engineer");
    list.add(john);
    list.add(otto);

    for(Person p : list) {
      pw.println(p + "\n");
    }
  }
}
