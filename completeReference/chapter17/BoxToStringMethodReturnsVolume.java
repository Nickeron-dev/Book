package classes;

public class BoxToStringMethodReturnsVolume {
  private double width;
  private double height;
  private double depth;

  public BoxToStringMethodReturnsVolume(double width, double height, double depth) {
    this.width = width;
    this.height = height;
    this.depth = depth;
  }

  public String toString() {
    return "Volume is: " + width * height * depth;
  }
}
