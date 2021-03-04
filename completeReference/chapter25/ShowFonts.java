package classes;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ShowFonts extends Frame {
  String msg = "Fonts: \n";
  GraphicsEnvironment graphic;
  public ShowFonts() {
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent event) {
        System.exit(0);
      }
    });

    graphic = GraphicsEnvironment.getLocalGraphicsEnvironment();

    String[] fontArray = graphic.getAvailableFontFamilyNames();
    for(int i = 0; (i < 5) && (i < fontArray.length); i++)
      msg += fontArray[i];

  }

  public void paint(Graphics g) {
    g.drawString(msg, 10, 60);
  }

  public static void main(String[] args) {
    ShowFonts appObj = new ShowFonts();

    appObj.setSize(new Dimension(500, 100));
    appObj.setTitle("ShowFonts");
    appObj.setVisible(true);
  }
}
