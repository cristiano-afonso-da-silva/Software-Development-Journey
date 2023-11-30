package Notes_and_Resources.java_gui_full_course.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MyFrame extends JFrame implements ActionListener{

    JButton button;
    JLabel label;

    MyFrame(){

        ImageIcon originalImage = new ImageIcon("/Users/cristianoafonsodasilva/Desktop/Software-Development-Journey/Weekly_Logs/Week1/java_gui_full_course/panels/logo.jpg");
        Image image = originalImage.getImage(); // Transform it 
        Image newimg = image.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH); // Scale it the smooth way  
        ImageIcon imageIcon = new ImageIcon(newimg);  // Transform it back

        label = new JLabel();
        label.setIcon(imageIcon);
        label.setBounds(150,250,150,150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(200,100,250,100);
        button.addActionListener(this); //e -> System.out.println("poo")
        button.setText("I'm a button!");
        button.setFocusable(false);
        button.setIcon(imageIcon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD, 20));
        button.setIconTextGap(-5);
        button.setForeground(Color.cyan); //set font color
        button.setBackground(Color.DARK_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);

        this.add(button);
        this.add(label);

        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            // System.out.println("poo");
            label.setVisible(true);
            // button.setEnabled(false); //to let the button only available to click once
        }
    }

}
