package classes;

import java.awt.*;
import java.awt.event.*;

public class FirstGraphicsDemo extends Frame {
    public FirstGraphicsDemo() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics graph) {
        // Drawing lines
        graph.drawLine(20, 40, 100, 90);
        graph.drawLine(20, 90, 100, 40);
        graph.drawLine(40, 45, 250, 80);

        // Drawing rectangles
        graph.drawRect(20, 150, 60, 50);
        graph.fillRect(110, 150, 60, 50);
        graph.drawRoundRect(200, 150, 60, 50, 15, 15);
        graph.fillRoundRect(290, 150, 60, 50, 30, 40);

        // Drawing elipses and circles
        graph.drawOval(20, 250, 50, 50);
        graph.fillOval(100, 250, 75, 50);
        graph.drawOval(200, 260, 100, 40);

        // Drawing arcs
        graph.drawArc(20, 350, 70, 70, 0, 180);
        graph.fillArc(70, 350, 70, 70, 0, 75);

        // Drawing a polygon
        int[] xPoints = {20, 200, 20, 200, 20};
        int[] yPoints = {450, 450, 650, 650, 450};
        int num = 5;

        graph.drawPolygon(xPoints, yPoints, num);
    }

    public static void main(String[] args) {
        FirstGraphicsDemo obj = new FirstGraphicsDemo();

        obj.setSize(new Dimension(350, 700));
        obj.setTitle("Graphics");
        obj.setVisible(true);
    }
}