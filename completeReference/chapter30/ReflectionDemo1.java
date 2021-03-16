package classes;

import java.lang.reflect.*;

public class ReflectionDemo1 {
  public static void main(String[] args) {
    try {
      Class<?> clss = Class.forName("java.awt.Dimension");

      System.out.println("Constructors: ");
      Constructor<?>[] constructorArray = clss.getConstructors();

      for (int i = 0; i < constructorArray.length; i++) {
        System.out.println(" " + constructorArray[i]);
      }

      System.out.println("Fields: ");
      Field[] fields = clss.getFields();
      for (int i = 0; i < fields.length; i++) {
        System.out.println(" " + fields[i]);
      }

      System.out.println("Methods: ");
      Method[] methods = clss.getMethods();
      for (int i = 0; i < methods.length; i++) {
        System.out.println(" " + methods[i]);
      }
    } catch (Exception exc) {
      System.out.println("Exception: " + exc);
    }
  }
}
