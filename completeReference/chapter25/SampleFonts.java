package classes;

import java.awt.*;
import java.awt.event.*;

public class SampleFonts extends Frame {
  int next = 0;
  Font f;
  String msg;

  public SampleFonts() {
    f = new Font("Dialog", Font.PLAIN, 20);
    msg = "Dialog";
    setFont(f);

    addMouseListener(new MyMouseAdapter(this));

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent event) {
        System.exit(0);
      }
    });
  }

  public void paint(Graphics g) {
    g.drawString(msg, 10, 60);
  }

  public static void main(String[] args) {
    SampleFonts appObj = new SampleFonts();

    appObj.setSize(new Dimension(500, 300));
    appObj.setTitle("SampleFonts");
    appObj.setVisible(true);
  }
}

class MyMouseAdapter extends MouseAdapter {
  SampleFonts sampleFonts;

  public MyMouseAdapter(SampleFonts sampleFonts) {
    this.sampleFonts = sampleFonts;
  }

  public void mousePressed(MouseEvent mouseE) {
    // switching fonts on each click
    sampleFonts.next++;

    switch(sampleFonts.next) {
      case 0:
        sampleFonts.f = new Font("Dialog", Font.PLAIN, 20);
        sampleFonts.msg = "Dialog";
        break;
      case 1:
        sampleFonts.f = new Font("DialogInput", Font.PLAIN, 20);
        sampleFonts.msg = "DialogInput";
        break;
      case 2:
        sampleFonts.f = new Font("SansSerif", Font.PLAIN, 20);
        sampleFonts.msg = "SansSerif";
        break;
      case 3:
        sampleFonts.f = new Font("Serif", Font.PLAIN, 20);
        sampleFonts.msg = "Serif";
        break;
      case 4:
        sampleFonts.f = new Font("Monospaced", Font.PLAIN, 20);
        sampleFonts.msg = "Monospaced";
        break;
    }

    if (sampleFonts.next == 4) sampleFonts.next = -1;
    // comeback if last is reached
    sampleFonts.setFont(sampleFonts.f);
    sampleFonts.repaint();
  }
}
