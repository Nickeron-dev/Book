package swingsMain;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlagsDemo implements ItemListener {
  JLabel labelSelected, labelChanged;
  JCheckBox symbols, spaces, numbers;

  public FlagsDemo() {
    // creating JFrame
    JFrame jframe = new JFrame("Here I used 'ticks'");

    // setting layout
    jframe.setLayout(new FlowLayout());

    // setting size
    jframe.setSize(300, 500);

    // setting close operation
    jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // initializing JLabel
    labelSelected = new JLabel("");
    labelChanged = new JLabel("");

    // initializing JCheckBox
    symbols = new JCheckBox("Include Symbols");
    spaces = new JCheckBox("Include Spaces");
    numbers = new JCheckBox("Include Numbers");

    // adding ItemListener
    symbols.addItemListener(this);
    spaces.addItemListener(this);
    numbers.addItemListener(this);

    // adding all elements to JFrame
    jframe.add(labelSelected);
    jframe.add(labelChanged);
    jframe.add(symbols);
    jframe.add(spaces);
    jframe.add(numbers);

    // making JFrame visible
    jframe.setVisible(true);
  }

  public void itemStateChanged(ItemEvent ie) {
    String str = "";

    // get reference to the JCheckBox
    JCheckBox checkbox = (JCheckBox) ie.getItem();

    if(checkbox.isSelected()) {
      labelChanged.setText(checkbox.getText() + " was chosen");
    } else {
      labelChanged.setText(checkbox.getText() + " was canceled");
    }

    if(symbols.isSelected()) {
      str += symbols.getText();
    }
    if(spaces.isSelected()) {
      str += spaces.getText();
    }
    if(numbers.isSelected()) {
      str += numbers.getText();
    }

    labelSelected.setText("All pressed: " + str);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {  // here starts program
        new FlagsDemo();
      }
    });
  }
}
