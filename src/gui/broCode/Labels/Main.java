package gui.broCode.Labels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Border border = BorderFactory.createLineBorder(Color.GREEN);

        JLabel label = new JLabel();
        label.setText("Hello wassup!");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.blue);
        label.setFont(new Font("MV Boli", Font.PLAIN, 0b11111));
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0,0,300,300);

        JFrame frame = new JFrame();
        frame.setTitle("labels");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.setLayout(null);
        frame.add(label);

        frame.setVisible(true);


    }
}
