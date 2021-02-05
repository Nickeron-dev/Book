package classes;

public class Person {
  private String name;
  private int age;
  private String city;
  private String job;

  public Person(String name, int age, String city, String job) {
    this.name = name;
    this.age = age;
    this.city = city;
    this.job = job;
  }

  public String toString() {
    return "Name: " + name + " age: " + age + " city: " + city + " job: " + job;
  }
}
