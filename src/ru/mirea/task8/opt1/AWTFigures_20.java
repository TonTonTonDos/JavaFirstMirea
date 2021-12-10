package ru.mirea.task8.opt1;
import java.awt.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
class AWTFigures extends JFrame {

    AWTFigures() {
        super("Main window");
        setSize(1920, 1080);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    Random rand = new Random();
    int s = rand.nextInt(254 + 1);
    int r = rand.nextInt(254 + 1);
    int g = rand.nextInt(254 + 1);
    int b = rand.nextInt(254 + 1);
    public void paint(Graphics gr) {
        Color random_color = new Color(s,r,g,b);
        int c;
        for (int i = 0; i < 10; i++) {
            s = rand.nextInt(254 + 1);
            r = rand.nextInt(254 + 1);
            g = rand.nextInt(254 + 1);
            b = rand.nextInt(254 + 1);
            c = rand.nextInt(150);
            random_color = new Color(s,r,g,b);
            gr.setColor(random_color);
            gr.fillOval(rand.nextInt(1920), rand.nextInt(1080), c, 2*c);
            gr.fillOval(rand.nextInt(1920), rand.nextInt(1080), c, c);
            gr.fillRect(rand.nextInt(1920), rand.nextInt(1080), c, c);
        }
    }
    public static void main(String args[]) {
// creating instance of Frame class
        AWTFigures f = new AWTFigures();
    }
}
