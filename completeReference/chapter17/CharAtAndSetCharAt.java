package classes;

public class CharAtAndSetCharAt {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("Nickeron-dev");
    System.out.println("First String: " + sb);

    System.out.println("charAt(3): " + sb.charAt(3));

    sb.setCharAt(4, 'y');
    sb.setLength(5);
    System.out.println("This is final String: " + sb);
  }
}
