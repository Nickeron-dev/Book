package classes;

public class UsingStringBufferAndMethodCapacity {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("Nickeron-dev");

    System.out.println(sb + " this is a string");
    System.out.println("Length is " + sb.length());
    System.out.println("Capacity is " + sb.capacity() + "(" + sb.length() + " + " + 16 + ")");
  }
}
