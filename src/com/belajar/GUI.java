package com.belajar;

import javax.swing.*;
import java.awt.*;

public class GUI {
    public GUI(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("FUCK DAPA");
        JButton button = new JButton("CLICK ME");

        panel.setBorder(BorderFactory.createEmptyBorder(30,30,0,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Project GUI MURNI PERTAMA");
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new GUI();
    }
}
