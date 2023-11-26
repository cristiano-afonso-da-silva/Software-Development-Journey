package Weekly_Logs.Week1.java_gui_full_course.frames;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Image;


public class MyFrame extends JFrame{
    
    MyFrame(){
        this.setTitle("Jthis title goes here"); //sets title of this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out the application
        this.setResizable(false); //prevent this from being reized
        this.setSize(420,420); //x-dimension, y-dimesion
        this.setVisible(true); //make this visible

        ImageIcon originalImage = new ImageIcon("/Users/cristianoafonsodasilva/Desktop/Software-Development-Journey/Weekly_Logs/Week1/java_gui_full_course/frames/logo.png"); //create an ImageIcon
        Image image = originalImage.getImage(); // Transform it 
        Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // Scale it the smooth way  
        ImageIcon imageIcon = new ImageIcon(newimg);  // Transform it back
        this.setIconImage(imageIcon.getImage()); //change icon of this
        this.getContentPane().setBackground(Color.DARK_GRAY); //new Color(x,y,z), change color background
    }
}
