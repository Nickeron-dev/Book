package classes;

class ClassA {
  ClassA() {
    System.out.println("This is ClassA");
  }
}

class ClassB extends ClassA {
  ClassB() {
    System.out.println("This is ClassB");
  }
  ClassB(int i) {
    System.out.println(i);
  }
}

class ClassC extends ClassB {
  int y = 2;
  ClassC() {
    super(2);
    System.out.println("This is ClassC");
  }
}

class ClassD extends ClassC {
  int x = 1;
  public ClassD() {
    System.out.println("This is ClassD");
  }
}

public class Combiner {
  public static ClassA getObj(int item) {
    switch(item) {
      case 1:
        return new ClassC();
      case 2:
        return new ClassD();
      default:
        return new ClassA();
    }
  }
  public static void main(String[] args) {
//  var variable; // impossible because it needs initializing
    var clssD = new ClassD();
    System.out.println("\nSpace between ClassD and C\n");
    var clssC = new ClassC();
    System.out.println("\nAnother initializing with getObj method\n");
    var first = getObj(1);
    System.out.println("\nSpace between them\n");
    var second = getObj(2);
//  first.y = 3;  // impossible because it has got only ClassA(by type of getObj method)
//  second.x = 4;
  }
}
