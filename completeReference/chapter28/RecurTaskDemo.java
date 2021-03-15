package classes;

import java.util.concurrent.*;

class Sum extends RecursiveTask<Double> {
  final int seqThresHold = 500;

  double[] data;
  int start, end;

  public Sum(double[] vals, int start, int end) {
    this.data = vals;
    this.start = start;
    this.end = end;
  }

  protected Double compute() {
    double sum = 0;

    if ((end - start) < seqThresHold) {
      for (int i = start; i < end; i++) {
        sum += data[i];
      }
    } else {
      int middle = (start + end) / 2;

      Sum subTaskA = new Sum(data, start, middle);
      Sum subTaskB = new Sum(data, middle, end);
      subTaskA.fork();
      subTaskB.fork();

      sum = subTaskA.join() + subTaskB.join();
    }

    return sum;
  }
}

public class RecurTaskDemo {
  public static void main(String[] args) {
    ForkJoinPool fjp = new ForkJoinPool();

    double[] numbers = new double[5000];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = (double) (((i % 2) == 0) ? i : -i);
    }

    Sum task = new Sum(numbers, 0, numbers.length);

    double summation = fjp.invoke(task);

    System.out.println("Summation: " + summation);
  }
}
