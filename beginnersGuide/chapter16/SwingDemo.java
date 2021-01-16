package swingsMain;
import javax.swing.*;

public class SwingDemo {
  public SwingDemo() {
    JFrame jfrm = new JFrame("This is my first app");

    // setting size of the window
    jfrm.setSize(250, 400);

    // stops app after closing window
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel jlbl = new JLabel("This is text Which Will Be Visible");

    // adding label to the frame
    jfrm.add(jlbl);

    // making It Visible
    jfrm.setVisible(true);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new SwingDemo();
      }
    });
  }
}
