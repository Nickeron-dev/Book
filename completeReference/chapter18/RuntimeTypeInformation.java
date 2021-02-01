package classes;

class X {
  private int a;
}

class Y extends X {
  private int b;
  private double c;
}

public class RuntimeTypeInformation {
  public static void main(String[] args) {
    var x = new X();
    var y = new Y();
    Class<?> cloneObject;

    cloneObject = x.getClass(); // getting class reference
    System.out.println("X is the object of type: " + cloneObject.getName());

    cloneObject = y.getClass(); // getting reference
    System.out.println("Y is the object of type: " + cloneObject.getName());

    cloneObject = cloneObject.getSuperclass(); // getting reference on superclass
    System.out.println("The superclass of Y is type: " + cloneObject.getName());
  }
}
