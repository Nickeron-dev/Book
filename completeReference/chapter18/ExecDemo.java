package classes;

public class ExecDemo {
  public static void main(String[] args) {
    Runtime r = Runtime.getRuntime();
    Process p = null;

    try {
      p = r.exec("GitHub.png"); // so if in this folder was an app it would be possible to execute it
    } catch(Exception e) {
      System.out.println("Error");
    }
  }
}
