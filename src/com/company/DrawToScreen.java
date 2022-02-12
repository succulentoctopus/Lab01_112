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

        double scale = 1.0 * 1/10;
        double scalepos = 1.0 * 1/20;

        for (int i = 0; i < 800; i+=160) {
            for (int j = 0; j < 800; j+=160) {
                // base solution

                // face shape
                g.setColor(Color.YELLOW);
                g.fillOval(5+j, 5+i, 100, 100);

                // eyes
                g.setColor(Color.BLUE);
                g.fillRect(30+j, 30+i, 10, 10);
                g.fillRect(70+j, 30+i, 10, 10);

                // cheeks
                g.setColor(Color.PINK);
                g.fillOval(25+j, 45+i, 20, 10);
                g.fillOval(65+j, 45+i, 20, 10);

                // nose
                g.setColor(Color.ORANGE);
                g.fillOval(40+j, 60+i, 30, 15);

                // mouth
                g.setColor(Color.BLACK);
                g.drawArc(30+j, 70+i, 60, 20, -140, 90);

                // outline for face
                g.drawOval(5+j, 5+i, 100, 100);

                // challenge solution
                // distort face based on position

                /*
                int scalei = (int) (i*scale);
                int scalej = (int) (j*scale);

                int scaleipos = (int) (i*scalepos);
                int scalejpos = (int) (j*scalepos);

                // face shape
                g.setColor(Color.YELLOW);
                g.fillOval(5+j, 5+i, 100 + scalej, 100 + scalei);

                // eyes
                g.setColor(Color.BLUE);
                g.fillRect(30+j+scalejpos, 30+i+scaleipos, 10, 10);
                g.fillRect(70+j+scalejpos, 30+i+scaleipos, 10, 10);

                // cheeks
                g.setColor(Color.PINK);
                g.fillOval(25+j+scalejpos, 45+i+scaleipos, 20, 10);
                g.fillOval(65+j+scalejpos, 45+i+scaleipos, 20, 10);

                // nose
                g.setColor(Color.ORANGE);
                g.fillOval(40+j+scalejpos, 60+i+scaleipos, 30, 15);

                // mouth
                g.setColor(Color.BLACK);
                g.drawArc(30+j+scalejpos, 70+i+scaleipos, 60, 20, -140, 90);

                // outline for face
                g.drawOval(5+j, 5+i, 100 + scalej, 100+ scalei);
                 */

            }
        }

    }

    public static void main(String args[]){
        JFrame frame = new JFrame("DrawToScreen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new DrawToScreen());
        frame.pack();
        frame.setVisible(true);
    }
}