//package classes;

// this class is very simple just to try testing in Java

// java classes.MainClass // to just run
// java -ea classes.MainClass // to run with enabled asserts

import static org.junit.Assert.*;
//mport org.junit.Text;

public class MainClass {
  //@Test
  public static void main(String[] args) {
    assert (2 != divide(6, 3));
    assertEquals(0, divide(6, 3));
    System.out.println("Hello");
  }

  public static int divide(int a, int b) {
    return a / b; // just divide
  }
}
