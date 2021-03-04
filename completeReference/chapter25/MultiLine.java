package classes;

import java.awt.*;
import java.awt.event.*;

public class MultiLine extends Frame {
  int curX = 20, curY = 40;

  public MultiLine() {
    Font f = new Font("SansSerif", Font.PLAIN, 20);
    setFont(f);

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent event) {
        System.exit(0);
      }
    });
  }

  public void paint(Graphics g) {
    FontMetrics fm = g.getFontMetrics();

    nextLine("This is on line one.", g);
    nextLine("This is on line two.", g);
    sameLine(" This is on same line.", g);
    sameLine(" This, too.", g);
    nextLine("This is on line three.", g);

    curX = 20;
    curY = 40; // resetting coordinates
  }

  public void nextLine(String s, Graphics g) {
    FontMetrics fm = g.getFontMetrics();

    curY += fm.getHeight(); // advance to next line
    curX = 20;
    g.drawString(s, curX, curY);
    curX += fm.stringWidth(s);
  }

  public void sameLine(String s, Graphics g) {
    FontMetrics fm = g.getFontMetrics();

    g.drawString(s, curX, curY);
    curX += fm.stringWidth(s);
  }

  public static void main(String[] args) {
    MultiLine appObj = new MultiLine();

    appObj.setSize(new Dimension(500, 300));
    appObj.setTitle("MultiLine");
    appObj.setVisible(true);
  }
}
