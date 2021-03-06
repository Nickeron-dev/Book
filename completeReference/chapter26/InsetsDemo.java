package classes;

import java.awt.*;
import java.awt.event.*;

public class InsetsDemo extends Frame {

  public InsetsDemo() {
    // here, BorderLayout is used by default

    setBackground(Color.cyan);

    setLayout(new BorderLayout());
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

  public Insets getInsets() {
    return new Insets(40, 20, 10, 20);
  }

  public static void main(String[] args) {
    InsetsDemo appObj = new InsetsDemo();

    appObj.setSize(new Dimension(300, 220));
    appObj.setTitle("InsetsDemo");
    appObj.setVisible(true);
  }
}
