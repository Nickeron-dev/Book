package classes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import java.awt.event.KeyEvent;

public class MenuDemo implements ActionListener {
  JLabel label;
  JPopupMenu popMenu;

  public MenuDemo() {
    JFrame frame = new JFrame("MenuDemo");
    //frame.setLayout(new FlowLayout());
    frame.setSize(220, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    label = new JLabel();
    frame.add(label, BorderLayout.CENTER);
    popMenu = new JPopupMenu();

    JMenuItem itemCut = new JMenuItem("Cut");
    JMenuItem itemCopy = new JMenuItem("Copy");
    JMenuItem itemPaste = new JMenuItem("Paste");

    popMenu.add(itemCut);
    popMenu.add(itemCopy);
    popMenu.add(itemPaste);

    frame.addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent event) {
        if (event.isPopupTrigger())
          popMenu.show(event.getComponent(), event.getX(), event.getY());
      }

      public void mouseReleased(MouseEvent event) {
        if (event.isPopupTrigger())
          popMenu.show(event.getComponent(), event.getX(), event.getY());
      }
    });

    JMenuBar menu = new JMenuBar();

    JMenu file = new JMenu("File");
    file.setMnemonic(KeyEvent.VK_F);
    JMenuItem fileOpen = new JMenuItem("Open", KeyEvent.VK_O);
    fileOpen.setAccelerator(KeyStroke
                      .getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
    JMenuItem fileClose = new JMenuItem("Close", KeyEvent.VK_C);
    fileClose.setAccelerator(KeyStroke
                        .getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
    JMenuItem fileSave = new JMenuItem("Save", KeyEvent.VK_S);
    fileSave.setAccelerator(KeyStroke
                        .getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
    JMenuItem fileExit = new JMenuItem("Exit", KeyEvent.VK_E);
    fileExit.setAccelerator(KeyStroke
                        .getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));
    file.add(fileOpen);
    file.add(fileClose);
    file.add(fileSave);
    file.add(fileExit);
    menu.add(file);

    JMenu options = new JMenu("Options");

    JMenu colors = new JMenu("Colors");
    JCheckBoxMenuItem colorRed = new JCheckBoxMenuItem("Red");
    JCheckBoxMenuItem colorGreen = new JCheckBoxMenuItem("Green");
    JCheckBoxMenuItem colorBlue = new JCheckBoxMenuItem("Blue");
    colors.add(colorRed);
    colors.add(colorGreen);
    colors.add(colorBlue);
    options.add(colors);

    JMenu priority = new JMenu("Priority");

    JRadioButtonMenuItem high = new JRadioButtonMenuItem("High", true);
    JRadioButtonMenuItem low = new JRadioButtonMenuItem("Low");
    priority.add(high);
    priority.add(low);
    options.add(priority);

    JMenuItem reset = new JMenuItem("Reset");
    options.addSeparator();
    options.add(reset);

    menu.add(options);

    JMenu help = new JMenu("Help");
    ImageIcon icon = new ImageIcon("smth.png");
    JMenuItem about = new JMenuItem("About", icon);
    help.add(about);
    menu.add(help);

    fileOpen.addActionListener(this);
    fileClose.addActionListener(this);
    fileSave.addActionListener(this);
    fileExit.addActionListener(this);
    colorRed.addActionListener(this);
    colorGreen.addActionListener(this);
    colorBlue.addActionListener(this);
    high.addActionListener(this);
    low.addActionListener(this);
    reset.addActionListener(this);
    about.addActionListener(this);
    itemCut.addActionListener(this);
    itemCopy.addActionListener(this);
    itemPaste.addActionListener(this);

    frame.add(label);
    frame.setJMenuBar(menu);

    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent event) {
    String comStr = event.getActionCommand();

    if (comStr.equals("Exit")) System.exit(0);

    label.setText(comStr + " Selected");
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new MenuDemo();
      }
    });
  }
}
