package seirpinski;

import javax.swing.*;
import java.awt.*;

public class TrianglePanel extends JPanel {

    public TrianglePanel() {
    }

    public void drawTriangle(Graphics g, int x, int y, int width, int height) {
        if (height == 1) {
            g.drawRect(x, y, width, height);
        } else {
            drawTriangle(g, x + (width / 4), y, width / 2, height / 2);
            drawTriangle(g, x, y + (height / 2), width / 2, height / 2);
            drawTriangle(g, x + (width / 2), y + (height / 2), width / 2, height / 2);
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawTriangle(g, 0, 0, this.getWidth(), this.getHeight());
    }
}
