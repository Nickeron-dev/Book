package classes;

public class MemoryDemo {
  public static void main(String[] args) {
    Runtime runT = Runtime.getRuntime();
    long memory1, memory2;
    Integer[] arrayOfInts = new Integer[1000];

    System.out.println("Total memory is: " + runT.freeMemory());
    memory1 = runT.freeMemory();

    System.out.println("Initial free memory: " + memory1);

    runT.gc(); // collecting garbage
    memory1 = runT.freeMemory();
    System.out.println("Memory after collecting: " + memory1);

    for(int i = 0; i < arrayOfInts.length; i++) {
      arrayOfInts[i] = i; // Integer.valueOf(i) is also possible but my variant parses it by default
    }

    memory2 = runT.freeMemory();
    System.out.println("After allocating: " + memory2);
    System.out.println("Result is: " + (memory1 - memory2));

    // discard changes

    for(int i = 0; i < arrayOfInts.length; i++) {
      arrayOfInts[i] = null;
    }

    runT.gc(); // collect garbage

    memory2 = runT.freeMemory();
    System.out.println("After discarding and collecting garbage: " + memory2);

  }
}
