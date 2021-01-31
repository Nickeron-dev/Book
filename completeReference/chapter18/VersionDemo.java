package classes;

public class VersionDemo {
  public static void main(String[] args) {
    Runtime.Version version = Runtime.version();

    System.out.println("Feature is: " + version.feature());
    System.out.println("Interim is: " + version.interim());
    System.out.println("Update is: " + version.update());
    System.out.println("Patch is: " + version.patch());
  }
}
