package classes;

import java.util.*;

public class BitSetDemo {
  public static void main(String[] args) {
    BitSet bit1 = new BitSet(16); // setting capacity
    BitSet bit2 = new BitSet(16); // setting capacity

    for(int i = 0; i < 16; i++) {
      if((i % 2) == 0) bit1.set(i); // adding only numbers which can be divided by 2
      if((i % 5) != 0) bit2.set(i); // adding all except dividers of 5
    }

    System.out.println("first BitSet:");
    System.out.println(bit1);
    System.out.println("second BitSet:");
    System.out.println(bit2);

    // AND bits
    bit2.and(bit1); // bit2 will be changed
    System.out.println("bit2 AND bit1 is:");
    System.out.println(bit2);

    // OR bits
    bit2.or(bit1); // bit2 will be changed
    System.out.println("bit2 OR bit1 is:");
    System.out.println(bit2);

    // XOR bits
    bit2.xor(bit1); // bit2 will be changed
    System.out.println("bit2 XOR bit1 is:");
    System.out.println(bit2);
  }
}
