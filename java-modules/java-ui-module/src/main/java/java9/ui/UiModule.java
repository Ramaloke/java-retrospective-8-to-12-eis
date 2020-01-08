package java9.ui;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class UiModule {
    private static final int RGB_BOUND = 256;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(getRandomInt(RGB_BOUND), getRandomInt(RGB_BOUND), getRandomInt(RGB_BOUND)));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private static int getRandomInt(int exclusiveBound) {
        return new Random().nextInt(exclusiveBound);
    }
}
