package classes;

public class EqualsCompareTo {
  public static void main(String[] args) {
    String str1 = "I am String one";
    String str2 = new String(str1);
    System.out.println(str1 + " equals() " + str2 + "? " + str1.equals(str2));
    System.out.println(str1 + " == " + str2 + "? " + (str1 == str2));
    // two strings are different in case of == because str1 and str2 are not referred
    // from one object
  }
}
