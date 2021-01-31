package classes;

public class ElapsedTime {
  public static void main(String[] args) {
    long start, end;

    System.out.println("Timing a for loop from 0 to 100,000,000");

    // time a for loop from 0 to 100 000 000

    start = System.currentTimeMillis(); // get current time
    for(long i = 0; i < 100000000L; i++);
    end = System.currentTimeMillis(); // get current time after loop

    System.out.println("Elapsed time: " + (end - start));
  }
}
