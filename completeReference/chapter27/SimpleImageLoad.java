package classes;

import java.awt.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;

public class SimpleImageLoad extends Frame {
  Image img;

  public SimpleImageLoad() {
    try {
      File imageFile = new File("equal60.jpg");

      img = ImageIO.read(imageFile);
    } catch (IOException exc) {
      System.out.println("Cannot load image file");
    }

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
  }

  public void paint(Graphics g) {
    g.drawImage(img, getInsets().left, getInsets().top, null);
  }

  public static void main(String[] args) {
    SimpleImageLoad appObj = new SimpleImageLoad();

    appObj.setSize(new Dimension(400, 365));
    appObj.setTitle("SimpleImageLoad");
    appObj.setVisible(true);
  }
}
