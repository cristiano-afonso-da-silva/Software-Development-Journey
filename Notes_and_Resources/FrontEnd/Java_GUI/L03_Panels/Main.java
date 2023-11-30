package Notes_and_Resources.FrontEnd.Java_GUI.L03_Panels;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

    public static void main(String[] args) {

        // JPanel = a GUI component that funcitons as a container to hold other components

        ImageIcon originalImage = new ImageIcon("/Users/cristianoafonsodasilva/Desktop/Software-Development-Journey/Weekly_Logs/Week1/java_gui_full_course/panels/logo.jpg");
        Image image = originalImage.getImage(); // Transform it 
        Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // Scale it the smooth way  
        ImageIcon imageIcon = new ImageIcon(newimg);  // Transform it back

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(imageIcon);
        label.setVerticalAlignment(JLabel.TOP); //for border layout
        label.setHorizontalAlignment(JLabel.RIGHT); //for border layout
        label.setBounds(0,0,200,200);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250); // Position and size of the panel
        redPanel.setLayout(null);
        // redPanel.setLayout(new BorderLayout());

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250, 0, 250, 250); // Position and size of the panel
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250); // Position and size of the panel
        greenPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        
        bluePanel.add(label);

        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

        frame.setVisible(true);
    }
    
}
