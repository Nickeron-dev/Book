package classes;

public class InsertReverseDeleteCharAt {
  public static void main(String[] args) {
    StringBuffer java = new StringBuffer("I Java");

    System.out.println(java);
    java.insert(2, "love ");
    // inserts String "love " starting with 2nd index('J')
    // so 'J' moves forward and there inserts "love "
    System.out.println(java);

    // reversing a String with StringBuffer
    java.reverse();
    System.out.println("Reverse: " + java);

    java.reverse(); // reversing back
    System.out.println("Reversing again: " + java);

    // deleting a sequence from 1 to  6(6 doesn't delete)
    java.delete(1, 6);
    System.out.println("After delete(1, 6): " + java);

    // deleting char at 0('J')
    java.deleteCharAt(0);
    java.deleteCharAt(0); // deleting char at 0(' ') now it is ' '
    System.out.println("After deleteCharAt(0): " + java);
  }
}
