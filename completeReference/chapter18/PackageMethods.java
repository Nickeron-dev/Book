package classes;

public class PackageMethods {
  public static void main(String[] args) {
    Package[] pack;

    pack = Package.getPackages();

    for(int i = 0; i < pack.length; i++) {
      System.out.println(pack[i].getName() + " " +
                        pack[i].getImplementationTitle() + " " +
                        pack[i].getImplementationVendor() + " " +
                        pack[i].getImplementationVersion());
    }
  }
}
