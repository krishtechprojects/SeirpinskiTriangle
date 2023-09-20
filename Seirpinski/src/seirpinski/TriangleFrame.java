package seirpinski;

import javax.swing.*;

class TriangleFrame extends JFrame {

    private static final int SCREEN_WIDTH = 1024;
    private static final int SCREEN_HEIGHT = 768;

    public TriangleFrame() {
        setTitle("Sierpinski's Triangle");
        setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TrianglePanel panel = new TrianglePanel();
        add(panel);
        setVisible(true);
    }

    public static int getMessageWidth() {
        return SCREEN_WIDTH;
    }

    public static int getMessageHeight() {
        return SCREEN_HEIGHT;
    }
}
