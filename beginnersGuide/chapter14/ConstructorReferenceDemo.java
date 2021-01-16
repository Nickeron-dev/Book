package lambdaExpressionsMain;

public class ConstructorReferenceDemo {
  public static void main(String[] args) {
    // creating constructor reference
    lambdaExpressions.IncludesMethodReturnsObject constructorReference = lambdaExpressions.ClassKeepsString::new;

    // creating constructor reference for default constructor
    lambdaExpressions.AnotherInterfaceForUsingDefaultMethod defaultConstructorReference =
      lambdaExpressions.ClassKeepsString::new;

    // using it
    lambdaExpressions.ClassKeepsString argumentObject = constructorReference.takeString("This is method with argument");
    System.out.println("The String is: "  + argumentObject.getString());

    // default constructor
    lambdaExpressions.ClassKeepsString defaultObject = defaultConstructorReference.usingDefaultMethod();
    System.out.println("This is String which is created by another interface" +
     " it needs another it because arguments there are same as in reference" +
     " So The String is(it will consist nothing): " + defaultObject.getString());
  }
}
