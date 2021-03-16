package classes;

import java.util.*;
import java.util.stream.*;

public class StreamDemo7 {
  public static void main(String[] args) {
    ArrayList<NamePhoneEmail> list = new ArrayList<NamePhoneEmail>();

    list.add(new NamePhoneEmail("Jack", "123", "jack.com"));
    list.add(new NamePhoneEmail("John", "456", "john.com"));
    list.add(new NamePhoneEmail("Dan", "789", "dan.com"));

    Stream<NamePhone> namePhoneObj = list.stream()
                        .map((obj) -> new NamePhone(obj.name, obj.phoneNumber));

    List<NamePhone> namePhoneList = namePhoneObj.collect(Collectors.toList());

    System.out.println("Names and phone numbers in a List");
    for (NamePhone element : namePhoneList) {
      System.out.println(element.name + ": " + element.phoneNumber);
    }

    namePhoneObj = list.stream()
                  .map((obj) -> new NamePhone(obj.name, obj.phoneNumber));

    Set<NamePhone> namePhoneSet = namePhoneObj.collect(Collectors.toSet());

    System.out.println("\nNames and phone numbers in a Set: ");
    for (NamePhone i : namePhoneSet) {
      System.out.println(i.name + ": " + i.phoneNumber);
    }
  }
}
