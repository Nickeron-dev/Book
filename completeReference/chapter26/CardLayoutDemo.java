package classes;

import java.awt.*;
import java.awt.event.*;

public class CardLayoutDemo extends Frame implements ActionListener {
  Checkbox windows10, windows7, windows8, android, linux, mac;
  Panel osCards;
  CardLayout cardLO;
  Button Win, Other;

  public CardLayoutDemo() {
    setLayout(new FlowLayout());

    cardLO = new CardLayout();
    osCards = new Panel();
    osCards.setLayout(cardLO);

    windows7 = new Checkbox("Windows 7", true);
    windows8 = new Checkbox("Windows 8");
    windows10 = new Checkbox("Windows 10");
    android = new Checkbox("Android");
    linux = new Checkbox("Linux");
    mac = new Checkbox("Mac OS");

    Panel winPan = new Panel();
    winPan.add(windows7);
    winPan.add(windows8);
    winPan.add(windows10);

    Panel otherPan = new Panel();
    otherPan.add(android);
    otherPan.add(linux);
    otherPan.add(mac);

    osCards.add(winPan, "Windows");
    osCards.add(otherPan, "Other");

    add(osCards);

    Win.addActionListener(this);
    Other.addActionListener(this);

    addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent me) {
        cardLO.next(osCards);
      }
    });

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
  }

  public void actionPerformed(ActionEvent ae) {
    if (ae.getActionCommand().equals("Win")) cardLO.show(osCards, "Windows");
    else cardLO.show(osCards, "Other");
  }

  public static void main(String[] args) {
    CardLayoutDemo appObj = new CardLayoutDemo();

    appObj.setSize(new Dimension(300, 220));
    appObj.setTitle("CardLayoutDemo");
    appObj.setVisible(true);
  }
}
