package Projects.P02_Healthy4You_GUI.ui;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class SignUpUI {
    private JFrame frame;
    private JPanel mainpanel;
    private JPanel toppanel;
    private JPanel usernamepanel;
    private JLabel usernamelabel;
    private JPanel passwordpanel;
    private JLabel passwordlabel;
    private JButton backbutton;
    private JLabel headinglabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton signupbutton;
    private Font headingfont = new Font("Monospaced", Font.BOLD, 30);
    private Font buttonfont = new Font("SansSerif", Font.BOLD, 14);
    private Font textfont = new Font("SansSerif", Font.PLAIN, 16);
    private Color bgcolor = new Color(41, 41, 41);
    private Color themecolor = new Color(143, 88, 178);
    private Color headingcolor = new Color(255, 255, 255);
    private Color textcolor = new Color(156, 156, 156);
    private Border line = BorderFactory.createLineBorder(textcolor);
    private Border margin = new EmptyBorder(5, 10, 5, 5);
    public SignUpUI(){
        //frame setup
        frame = new JFrame();
        frame.setTitle("Healthy4You Sign Up");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(530, 1100);
        frame.setBackground(bgcolor);

        //-----------------------------main panel-----------------------------
        //mainpanel setup
        mainpanel = new JPanel();
        mainpanel.setBackground(bgcolor);
        mainpanel.setLayout(new BoxLayout(mainpanel, BoxLayout.Y_AXIS));

        //-----------------------------top panel-----------------------------

        // Panel for back button with left alignment
        toppanel = new JPanel();
        toppanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        toppanel.setMaximumSize(new Dimension(400, 150));
        toppanel.setBackground(bgcolor);
        toppanel.setLayout(new BoxLayout(toppanel, BoxLayout.Y_AXIS));

        // backbutton setup
        backbutton = new JButton("<");
        backbutton.setAlignmentX(Component.LEFT_ALIGNMENT);
        backbutton.setHorizontalAlignment(SwingConstants.CENTER);
        backbutton.setPreferredSize(new Dimension(40, 40));
        backbutton.setMaximumSize(new Dimension(40, 40));
        backbutton.setFont(textfont);
        backbutton.setForeground(textcolor);
        backbutton.setBackground(bgcolor);
        backbutton.setBorder(BorderFactory.createLineBorder(textcolor));
        backbutton.setFocusPainted(true);
        backbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                HomePageUI homePageUI = new HomePageUI();
            }
        });

        //signuplabel setup
        headinglabel = new JLabel("Sign Up");
        headinglabel.setFont(headingfont);
        headinglabel.setForeground(headingcolor);
        headinglabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        //toppanel component
        toppanel.add(Box.createVerticalStrut(40));
        toppanel.add(backbutton);
        toppanel.add(Box.createVerticalStrut(30));
        toppanel.add(headinglabel);
        toppanel.add(Box.createVerticalGlue());

        //-----------------------------username panel-----------------------------

        //usernamepanel setup
        usernamepanel = new JPanel();
        usernamepanel.setMaximumSize(new Dimension(400, 100));
        usernamepanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        usernamepanel.setBackground(bgcolor);
        usernamepanel.setLayout(new BoxLayout(usernamepanel, BoxLayout.Y_AXIS));

        //usernamelabel setup
        usernamelabel = new JLabel("Username");
        usernamelabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        usernamelabel.setFont(textfont);
        usernamelabel.setForeground(textcolor);

        //usernameField setup
        usernameField = new JTextField();
        usernameField.setAlignmentX(Component.LEFT_ALIGNMENT);
        usernameField.setMaximumSize(new Dimension(400, 60));
        usernameField.setPreferredSize(new Dimension(400, 60));
        usernameField.setFont(textfont);
        usernameField.setCaretColor(headingcolor);
        usernameField.setForeground(headingcolor);
        usernameField.setBackground(bgcolor);
        usernameField.setBorder(new CompoundBorder(line, margin));

        //usernamepanel component
        usernamepanel.add(Box.createVerticalGlue());
        usernamepanel.add(usernamelabel);
        usernamepanel.add(Box.createVerticalStrut(10));
        usernamepanel.add(usernameField);
        usernamepanel.add(Box.createVerticalGlue());

        //-----------------------------password panel-----------------------------

        //passwordpanel setup
        passwordpanel = new JPanel();
        passwordpanel.setMaximumSize(new Dimension(400, 100));
        passwordpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        passwordpanel.setBackground(bgcolor);
        passwordpanel.setLayout(new BoxLayout(passwordpanel, BoxLayout.Y_AXIS));

        //passwordlabel setup
        passwordlabel = new JLabel("Password");
        passwordlabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        passwordlabel.setFont(textfont);
        passwordlabel.setForeground(textcolor);

        //passwordField setup
        passwordField = new JPasswordField();
        passwordField.setAlignmentX(Component.LEFT_ALIGNMENT);
        passwordField.setMaximumSize(new Dimension(400, 60));
        passwordField.setPreferredSize(new Dimension(400, 60));
        passwordField.setFont(textfont);
        passwordField.setCaretColor(headingcolor);
        passwordField.setForeground(headingcolor);
        passwordField.setBackground(bgcolor);
        passwordField.setBorder(new CompoundBorder(line, margin));

        //passwordpanel component
        passwordpanel.add(Box.createVerticalGlue());
        passwordpanel.add(passwordlabel);
        passwordpanel.add(Box.createVerticalStrut(10));
        passwordpanel.add(passwordField);
        passwordpanel.add(Box.createVerticalGlue());

        //-----------------------------signup button-----------------------------

        //signupbutton setup
        signupbutton = new JButton("Sign Up");
        signupbutton.setAlignmentX(Component.CENTER_ALIGNMENT);
        signupbutton.setHorizontalAlignment(SwingConstants.CENTER);
        signupbutton.setMaximumSize(new Dimension(400, 60));
        signupbutton.setFont(buttonfont);
        signupbutton.setForeground(headingcolor);
        signupbutton.setBackground(themecolor);
        signupbutton.setOpaque(true);
        signupbutton.setBorderPainted(false);
        signupbutton.setFocusPainted(false);
        signupbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                HomePageUI homePageUI = new HomePageUI();
            }
        });

        //mainpanel component
        mainpanel.add(Box.createVerticalStrut(30));
        mainpanel.add(toppanel);
        mainpanel.add(Box.createVerticalStrut(20));
        mainpanel.add(usernamepanel);
        mainpanel.add(Box.createVerticalStrut(20));
        mainpanel.add(passwordpanel);
        mainpanel.add(Box.createVerticalStrut(50));
        mainpanel.add(signupbutton);

        //frame component and display
        frame.setContentPane(mainpanel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SignUpUI();
    }
}
