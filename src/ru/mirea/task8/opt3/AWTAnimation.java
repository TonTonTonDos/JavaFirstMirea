package ru.mirea.task8.opt3;

import javax.swing.*;
import java.awt.*;

public class AWTAnimation extends JFrame {
    AWTAnimation() {
        super("Picture.jpg");
        setSize(270, 750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

    }
    public static void main(String args[]) {


// creating instance of Frame class
        AWTAnimation f = new AWTAnimation();
    }
    public void paint(Graphics g){
        String path1 = "C:\\Users\\User\\IdeaProjects\\JavaFirstMirea-1\\src\\ru\\mirea\\task8\\opt3\\1.jpg";
        String path2 = "C:\\Users\\User\\IdeaProjects\\JavaFirstMirea-1\\src\\ru\\mirea\\task8\\opt3\\2.jpg";
        Image image1 = new ImageIcon(path1).getImage();
        Image image2 = new ImageIcon(path2).getImage();
        for(int i = 0; i < 100000; i++) {
            g.drawImage(image1, 0, 0, null);//выводим линию
            g.drawImage(image2, 0, 0, null);//выводим линию
        }



    }
}
