package classes;

import java.util.concurrent.*;

class Transform extends RecursiveAction {
  int seqThreshold;
  double[] data;
  int start, end;

  public Transform(double[] vals, int s, int e, int t) {
    data = vals;
    start = s;
    end = e;
    seqThreshold = t;
  }

  protected void compute() {
    if ((end - start) < seqThreshold) {
      for (int i = start; i < end; i++) {
        if ((data[i] % 2) == 0) {
          data[i] = Math.sqrt(data[i]);
        } else {
          data[i] = Math.cbrt(data[i]);
        }
      }
    } else {
      int middle = (start + end) / 2;

      invokeAll(new Transform(data, start, middle, seqThreshold),
                new Transform(data, middle, end, seqThreshold));
    }
  }
}

class FJExperiment {
  public static void main(String[] args) {
    int pLevel;
    int threshold;

    if (args.length != 2) {
      System.out.println("Usage: FJExperiment parallelism threshold");
      return;
    }

    pLevel = Integer.parseInt(args[0]);
    threshold = Integer.parseInt(args[1]);

    long beginT, endT;

    ForkJoinPool fjp = new ForkJoinPool(pLevel);

    double[] numbers = new double[1000000];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = (double) i;
    }

    Transform task = new Transform(numbers, 0, numbers.length, threshold);

    beginT = System.nanoTime();

    fjp.invoke(task);

    endT = System.nanoTime();

    System.out.println("Level of parallelism: " + pLevel);
    System.out.println("Sequential threshold: " + threshold);
    System.out.println("Elapsed time: " + (endT - beginT) + " ns");
    System.out.println();
  }
}
