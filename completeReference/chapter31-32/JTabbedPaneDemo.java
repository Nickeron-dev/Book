package classes;

import java.awt.*;
import javax.swing.*;

public class JTabbedPaneDemo {
  public JTabbedPaneDemo() {
    JFrame frame = new JFrame("JTabbedPaneDemo");
    frame.setLayout(new FlowLayout());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 200);

    JTabbedPane pane = new JTabbedPane();
    pane.addTab("Cities", new CitiesPanel());
    pane.addTab("Colors", new ColorsPanel());
    pane.addTab("Flavors", new FlavorsPanel());

    frame.add(pane);

    frame.setVisible(true);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new JTabbedPaneDemo();
      }
    });
  }
}

class CitiesPanel extends Panel {
  public CitiesPanel() {
    JButton button1 = new JButton("New York");
    JButton button2 = new JButton("London");
    JButton button3 = new JButton("Hong Kong");
    JButton button4 = new JButton("Tokyo");

    add(button1);
    add(button2);
    add(button3);
    add(button4);
  }
}

class ColorsPanel extends Panel {
  public ColorsPanel() {
    JCheckBox box1 = new JCheckBox("Red");
    JCheckBox box2 = new JCheckBox("Red");
    JCheckBox box3 = new JCheckBox("Red");

    add(box1);
    add(box2);
    add(box3);
  }
}

class FlavorsPanel extends Panel {
  public FlavorsPanel() {
    JComboBox<String> combo = new JComboBox<String>();
    combo.addItem("Vanilla");
    combo.addItem("Strawberry");
    combo.addItem("Chocolate");

    add(combo);
  }
}
