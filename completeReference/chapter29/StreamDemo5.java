package classes;

import java.util.*;
import java.util.stream.*;

class NamePhoneEmail {
  public String name;
  public String phoneNumber;
  public String email;

  public NamePhoneEmail(String name, String phoneNumber, String email) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.email = email;
  }
}

class NamePhone {
  public String name;
  public String phoneNumber;

  public NamePhone(String name, String phoneNumber) {
    this.name = name;
    this.phoneNumber = phoneNumber;
  }
}

public class StreamDemo5 {
  public static void main(String[] args) {
    ArrayList<NamePhoneEmail> list = new ArrayList<NamePhoneEmail>();

    list.add(new NamePhoneEmail("Jack", "123", "jack.com"));
    list.add(new NamePhoneEmail("John", "456", "john.com"));
    list.add(new NamePhoneEmail("Dan", "789", "dan.com"));

    System.out.println("Original values in list: ");
    list.stream().forEach((obj) -> {
      System.out.println(obj.name + " " + obj.phoneNumber + " " + obj.email);
    });
    System.out.println();

    Stream<NamePhone> namePhoneStream = list.stream().map(
                  (obj) -> new NamePhone(obj.name, obj.phoneNumber));

    System.out.println("List a names and phone numbers");
    namePhoneStream.forEach((obj) -> {
      System.out.println(obj.name + " " + obj.phoneNumber);
    });
  }
}
