package classes;

import java.awt.*;
import java.awt.event.*;

public class GridBagLayoutDemo extends Frame implements ItemListener {
  String msg = "";
  Checkbox windows, android, linux, mac;

  public GridBagLayoutDemo() {
    GridBagLayout gbag = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();
    setLayout(gbag);

    windows = new Checkbox("Windows", true);
    android = new Checkbox("Android");
    linux = new Checkbox("Linux");
    mac = new Checkbox("Mac OS");

    gbc.weightx = 1.0;
    gbc.ipadx = 200;
    gbc.insets = new Insets(0, 6, 0, 0);

    gbc.anchor = GridBagConstraints.NORTHEAST;

    gbc.gridwidth = GridBagConstraints.RELATIVE;
    gbag.setConstraints(windows, gbc);
    gbc.gridwidth = GridBagConstraints.REMAINDER;
    gbag.setConstraints(android, gbc);

    gbc.weighty = 1.0;
    gbc.gridwidth = GridBagConstraints.RELATIVE;
    gbag.setConstraints(linux, gbc);

    gbc.gridwidth = GridBagConstraints.REMAINDER;
    gbag.setConstraints(mac, gbc);

    add(windows);
    add(android);
    add(linux);
    add(mac);

    windows.addItemListener(this);
    android.addItemListener(this);
    linux.addItemListener(this);
    mac.addItemListener(this);

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
  }

  public void itemStateChanged(ItemEvent event) {
    repaint();
  }

  public void paint(Graphics g) {
    msg = "Current state: ";
    g.drawString(msg, 20, 100);
    msg = " Windows: " + windows.getState();
    g.drawString(msg, 30, 120);
    msg = " Android: " + android.getState();
    g.drawString(msg, 30, 140);
    msg = " Linux: " + linux.getState();
    g.drawString(msg, 30, 160);
    msg = " Mac: " + mac.getState();
    g.drawString(msg, 30, 180);
  }

  public static void main(String[] args) {
    GridBagLayoutDemo appObj = new GridBagLayoutDemo();

    appObj.setSize(new Dimension(300, 220));
    appObj.setTitle("GridBagLayoutDemo");
    appObj.setVisible(true);
  }
}
