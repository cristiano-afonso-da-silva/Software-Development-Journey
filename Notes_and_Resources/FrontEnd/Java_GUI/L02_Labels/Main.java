package Notes_and_Resources.FrontEnd.Java_GUI.L02_Labels;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;

public class Main {

    public static void main(String[] args) {
        
        //JLabel = a GUI display area for a string of text, an image, or both

        ImageIcon originalImage = new ImageIcon("/Users/cristianoafonsodasilva/Desktop/Software-Development-Journey/Weekly_Logs/Week1/java_gui_full_course/labels/logo.jpg");
        Image image = originalImage.getImage(); // Transform it 
        Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // Scale it the smooth way  
        ImageIcon imageIcon = new ImageIcon(newimg);  // Transform it back

        Border border = BorderFactory.createLineBorder(Color.BLACK,3);

        JLabel label = new JLabel(); //create a label
        label.setText("Bro, do you even code?"); //set text of label
        label.setIcon(imageIcon);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); //set text TOP, CENTER, BOTTOM of imageicon
        label.setForeground(Color.BLUE); //set font color of text
        label.setFont(new Font("Times",Font.PLAIN,20)); //set font of text
        label.setIconTextGap(10); //set gap of text to image
        label.setBackground(Color.DARK_GRAY); //set background color
        label.setOpaque(true); //display background color
        label.setBorder(border); //set border of label (not image+text)
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
        label.setBounds(100,100,250,250); //set x,y position within frame as well as dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);
        //frame.setLayout(null);
        frame.add(label);
        frame.setVisible(true);
        frame.pack();
    }
    
}
