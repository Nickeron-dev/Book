package classes;

public class UsingJoinMethod {
  public static void main(String[] args) {
    // this method is static and adds first argument between others
    String addingSpaces = String.join(" ", "One", "Two", "Three");
    System.out.println(addingSpaces);

    String addingCommas = String.join(", ", "page 46", "45", "50");
    System.out.println(addingCommas);
  }
}
