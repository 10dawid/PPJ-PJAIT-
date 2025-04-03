package gui.broCode.Frame;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("MyJFrame");
        this.setSize(420,420);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application and stops our program
        this.setResizable(false); // prevent frame from being resized

        ImageIcon image = new ImageIcon("icon.png"); //introducing our new icon
        this.setIconImage(image.getImage());  //setting new icon
        this.getContentPane().setBackground(Color.GRAY); //change color of background
    }
}
