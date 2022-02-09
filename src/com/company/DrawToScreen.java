package com.company;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class DrawToScreen extends JPanel{
    public static final int BOX_WIDTH = 1024;
    public static final int BOX_HEIGHT = 768;

    public DrawToScreen(){
        this.setPreferredSize(new Dimension(BOX_WIDTH, BOX_HEIGHT));
    }

    //Your code here, if you want to define additional methods.

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Your code here: feel free to remove what is below        
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, BOX_WIDTH, BOX_HEIGHT);

        g.setColor(Color.GREEN);
        g.fillOval(50, 50, 30, 20);

        g.setColor(Color.RED);
        g.fillRect(100, 100, 20, 30);

        g.setColor(Color.BLUE);
        g.drawRoundRect(300, 200, 100, 200, 50, 100);

        g.setColor(Color.ORANGE);
        g.drawArc(200, 100, 200, 300, 90, 140);
    }

    public static void main(String args[]){
        JFrame frame = new JFrame("DrawToScreen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new DrawToScreen());
        frame.pack();
        frame.setVisible(true);
    }
}