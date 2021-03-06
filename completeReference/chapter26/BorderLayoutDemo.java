package classes;

import java.awt.*;
import java.awt.event.*;

public class BorderLayoutDemo extends Frame {

  public BorderLayoutDemo() {
    add(new Button("This is across the top"), BorderLayout.NORTH);
    add(new Button("The footer message might go here."), BorderLayout.SOUTH);
    add(new Button("RIGHT"), BorderLayout.EAST);
    add(new Button("LEFT"), BorderLayout.WEST);

    String msg = "The reasonable man adapts " +
                 "himself to the world;\n" +
                 "the unreasonable one persists in" +
                 "jfoiasjdfoisadfosidjfsdfjosafjidsjfij" +
                 "shdfioashfioasdhfoisdahfoisdahfoiasfh\n" +
                 "hoisahfiosadhfihweofiahsfijaasFASDFDfiahsdf\n";
    add(new TextArea(msg), BorderLayout.CENTER);

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
  }

  public static void main(String[] args) {
    BorderLayoutDemo appObj = new BorderLayoutDemo();

    appObj.setSize(new Dimension(300, 220));
    appObj.setTitle("BorderLayoutDemo");
    appObj.setVisible(true);
  }
}
