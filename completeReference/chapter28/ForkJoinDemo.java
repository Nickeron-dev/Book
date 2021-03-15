package classes;

import java.util.concurrent.*;
import java.util.*;

class SqrtTransform extends RecursiveAction {
  final int seqThreshold = 1000;
  double[] data;
  int start, end;

  public SqrtTransform(double[] data, int start, int end) {
    this.data = data;
    this.start = start;
    this.end = end;
  }

  protected void compute() {
    if ((end - start) < seqThreshold) {
      for (int i = start; i < end; i++) {
        data[i] = Math.sqrt(data[i]);
      }
    } else {
      int middle = (start + end) / 2;
      invokeAll(new SqrtTransform(data, start, middle),
                new SqrtTransform(data, middle, end));
    }
  }
}

public class ForkJoinDemo {
  public static void main(String[] args) {
    ForkJoinPool forkJoin = new ForkJoinPool();

    double[] numbers = new double[100000];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = (double) i;
    }

    System.out.println("A portion of the original sequence");

    for (int i = 0; i < 10; i++) {
      System.out.println(numbers[i] + " ");
    }

    System.out.println("\n");

    SqrtTransform task = new SqrtTransform(numbers, 0, numbers.length);

    forkJoin.invoke(task);

    System.out.println("A portion of the transformed sequence" + "(to four decimal)");

    for (int i = 0; i < 10; i++) {
      System.out.format("%.4f ", numbers[i]);
    }
    System.out.println();
  }
}
