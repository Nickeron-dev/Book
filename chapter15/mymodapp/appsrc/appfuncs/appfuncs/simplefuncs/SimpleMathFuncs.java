package appfuncs.simplefuncs;

public class SimpleMathFuncs {
  // find out is b multiplier of a
  public boolean isFactor(int a, int b) {
    if(a % b == 0) return true;
    return false;
  }

  // returns the biggest multiplier of a and b
  public int getLowestMultiplier(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);

    // getting lower number
    int min = a < b ? a : b;

    for(int i = 2; i <= min/2; i++) {
      if(isFactor(i, a) && isFactor(i, b)) {
        return i;
      }
    }
    return 1;
  }

  public int getBiggestMulitlier(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);

    //getting lower number
    int min = a < b ? a : b;

    for(int i = min/2; i <= 2; i--) {
      if(isFactor(i, a) && isFactor(i, b)) {
        return i;
      }
    }
    return 1;
  }
}
