package appfuncs.simplefuncs;

public class SimpleMathFuncs {
  // looking for boolean which tells is a factor of b
  public static boolean isFactor(int a, int b) {
    if((b % a) == 0) return true;
    return false;
  }

  // returns the lowest factor for both (not 1(if it is possible))
  public static int lcf(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);

    int min = a < b ? a : b; // just for reducing for loop repeats

    for(int i = 2; i < min/2; i++) {
      if(isFactor(i, a) && isFactor(i, b)) return i;
    }
    return 1;
  }

  // returns the greatest factor for both
  public static int gcf(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);

    int min = a < b ? a : b; // same purpose as min variable in lcf()

    for(int i = min / 2; i >= 2; i--) {
      if(isFactor(i, a) && isFactor(i, b)) return i;
    }
    return 1;
  }
}
