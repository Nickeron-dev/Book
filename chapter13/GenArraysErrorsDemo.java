package generalizationMain;

public class GenArraysErrorsDemo {
  public static void main(String[] args) {
    Integer[] array = {1, 2, 3, 4, 5};

    generalization.GenArraysErrors<Integer> object =
                new generalization.GenArraysErrors<Integer>(5, array);

    //it is impossible (page 544)
//  generalization.GenArraysErrors<Integer>[] impossible =
//              new generalization.GenArraysErrors<Integer>[10];

    generalization.GenArraysErrors<?>[] possible =
                new generalization.GenArraysErrors<?>[10];
  }
}
