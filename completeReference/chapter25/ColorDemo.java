package classes;

import java.awt.*;
import java.awt.event.*;

public class ColorDemo extends Frame {

  public ColorDemo() {
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
  }

  public void paint(Graphics g) {
    Color colorRed = new Color(255, 100, 100);
    Color colorGreen = new Color(100, 255, 100);
    Color colorBlue = new Color(100, 100, 255);

    // then I set a color that will be used in order to draw something

    g.setColor(colorRed);
    g.drawLine(200, 400, 100, 1000);
    g.drawLine(200, 1000, 1000, 200);

    g.setColor(colorBlue);
    g.drawLine(40, 45, 250, 180);
    g.drawLine(75, 90, 400, 400);

    g.setColor(colorGreen);
    g.drawLine(20, 150, 400, 40);
    g.drawLine(25, 290, 80, 19);

    g.setColor(Color.blue);
    g.drawOval(80, 200, 50, 50);
    g.fillOval(80, 200, 50, 50);

    g.setColor(Color.cyan);
    g.drawOval(1900, 400, 900, 600);
    g.drawRect(400, 400, 550, 500);

    g.setColor(Color.black);
    g.fillRect(400, 400, 550, 500);
    g.drawRoundRect(190, 40, 60, 60, 15, 15);
  }

  public static void main(String[] args) {
    ColorDemo appObj = new ColorDemo();

    appObj.setSize(new Dimension(340, 260));
    appObj.setTitle("ColorDemo");
    appObj.setVisible(true);
  }
}
