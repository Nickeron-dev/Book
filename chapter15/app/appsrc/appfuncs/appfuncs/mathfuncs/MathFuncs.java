package appfuncs.mathfuncs;

public class MathFuncs {
  // tells if a is b multiplier of a
  public static boolean isFactor(int a, int b) {
    if(a % b == 0) return true;
    return false;
  }

  // returns lower factor of a and b
  public static int lowerFactor(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);

    // getting lower number
    int min = a < b ? a : b;

    for(int i = 2; i < min / 2; i++) {
      if(isFactor(i, a) && isFactor(i, b)) return i;
    }
    return 1;
  }

  public static int greaterFactor(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);

    // getting lower number;
    int min = a < b ? a : b;

    for(int i = min / 2; i >= 2; i--) {
      if(isFactor(i, a) && isFactor(i, b)) return i;
    }
    return 1;
  }
}
