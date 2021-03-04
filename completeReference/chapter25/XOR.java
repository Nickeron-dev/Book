package classes;

import java.awt.*;
import java.awt.event.*;

public class XOR extends Frame {
  int positionX = 100;
  int positionY = 100;

  public XOR() {
    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseMoved(MouseEvent event) {
        int x = event.getX();
        int y = event.getY();
        positionX = x - 10;
        positionY = y - 10;
        repaint(); // repaint() calls paint method so we override paint()
      }
    });

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent window) {
      System.exit(0);
      }
    });
  }

  public void paint(Graphics g) {
    g.setColor(Color.green);
    g.fillRect(20, 40, 60, 70);

    g.setColor(Color.blue);
    g.fillRect(110, 40, 60, 70);

    g.setColor(Color.black);
    g.fillRect(200, 40, 60, 70);

    g.setColor(Color.red);
    g.fillRect(60, 120, 160, 110);

    g.setXORMode(Color.black);
    g.drawLine(positionX - 10, positionY, positionX + 10, positionY);
    g.drawLine(positionX, positionY - 10, positionX, positionY + 10);
    g.setPaintMode();
  }

  public static void main(String[] args) {
    XOR appObj = new XOR();

    appObj.setSize(new Dimension(300, 260));
    appObj.setTitle("XOR");
    appObj.setVisible(true);
  }
}
