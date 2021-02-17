package classes;

import java.util.Random;

public class RandomDemo {
  public static void main(String[] args) {
    Random r = new Random();
    double value;
    double sum = 0;
    int[] bell = new int[100];

    for(int i = 0; i < 100; i++) {
      value = r.nextGaussian();
      sum += value;
      double t = -2;

      for(int j = 0; j < 10; j++, t += 0.5) {
        if(value < t) {
          bell[j]++;
          break;
        }
      }
    }

    System.out.println("Average of values: " + (sum / 100));

    for(int i = 0; i < 10; i++) {
      for(int x = bell[i]; x > 0; x--) {
        System.out.print("*");
      }
      System.out.println();
    }


  }
}
