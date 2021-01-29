package classes;

public class Test {
  public static void main(String[] args) {
    /* Every class implements Object that's why we can use this method
     by the way, hashcode() is not implemented in java(it is native).

     Also, hashCode returns a unique int value which is not a memory address
     it is a bit changed memory address(address * 31 + 1)
     Even different elements can have same hashcode. Thus, we can't rely on hashcode() method

     Good hashCode is when every your object has got unique code so you can rely on it.
     */
    Human john = new Human(1000, "John"); // creating an object
    System.out.println("Hashcode for John is: " + john.hashCode());
    // not to type Human 2 times I will use var
    var ivan = new Human(1001, "Ivan");
    System.out.println("Hashcode for Ivan is: " + ivan.hashCode());

    var vasya = new Human(1002, "Vasya");
    System.out.println("Hashcode for Vasya is: " + vasya.hashCode());

    System.out.println("\nNext step is overriding hashCode() and returning always 1123\n");

    // now I will use hashCode() which I overrode
    HumanExtension artem = new HumanExtension(1003, "Artem");
    System.out.println("Hashcode for Artem is: " + artem.hashCode()); // it is overridden

    HumanExtension sasha = new HumanExtension(1004, "Sasha");
    System.out.println("Hashcode for Sasha is: " + sasha.hashCode()); // it is overridden

    HumanExtension oleg = new HumanExtension(1005, "Oleg");
    System.out.println("Hashcode for Oleg is: " + oleg.hashCode()); // it is overridden


    System.out.println("\nNext step is overriding hashCode() and it returns "
    + "number which is given as an argument\n");

    HumanExtensionUnique masha = new HumanExtensionUnique(1006, "Masha");
    System.out.println("Hashcode for Masha is: " + masha.hashCode());

    HumanExtensionUnique pasha = new HumanExtensionUnique(1007, "Pasha");
    System.out.println("Hashcode for Pasha is: " + pasha.hashCode());

    HumanExtensionUnique dasha = new HumanExtensionUnique(1008, "Dasha");
    System.out.println("Hashcode for Dasha is: " + dasha.hashCode());


    System.out.println("\nNext step is creating Strings and "
    + "getting hashcode of them\n");

    String illia = "Illia";
    int illiaHashCode = illia.hashCode();
    System.out.println("Hashcode for 'Illya' is: " + illiaHashCode);

    String taras = "Taras";
    int tarasHashCode = taras.hashCode();
    System.out.println("Hashcode for 'Taras' is: " + tarasHashCode);
    // creating a few more tarases
    String taras1 = "Taras";
    System.out.println("Hashcode for 'Taras1' is: " + taras1.hashCode());
    String taras2 = "Taras";
    System.out.println("Hashcode for 'Taras2' is: " + taras2.hashCode());
    // As a conclusion, I can say that same objects have same hashCodes

    // following strings(different strings) have got same hashcode
    String str1 = "FB";
    String str2 = "Ea";
    System.out.println(str1.hashCode() + " " + str2.hashCode());
  }
}
