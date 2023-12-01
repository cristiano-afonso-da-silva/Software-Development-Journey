package Projects.P02_Healthy4You_GUI.ui;

import javax.swing.*;
import java.awt.*;

public class HomePageUI {
    private JFrame frame;
    private JPanel mainpanel;
    private JPanel toppanel;
    private JPanel centerpanel;
    private JLabel applicationname;
    private JLabel applicationslogan;
    private JPanel bottompannel;
    private Font headingfont = new Font("Nunito",Font.BOLD,30);
    private Font textfont = new Font("San Francisco",Font.PLAIN,12);
    private Color bgcolor = new Color(41,41,41);
    private Color themecolor = new Color(0,130,155);
    private Color headingcolor = new Color(255,255,255);
    private Color textcolor = new Color(156,156,156);

    public HomePageUI(){
        frame = new JFrame();
        frame.setTitle("Healthy4You");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(530,1100);
        frame.setBackground(bgcolor);

        mainpanel = new JPanel();
        mainpanel.setBackground(bgcolor);
        mainpanel.setLayout(new BoxLayout(mainpanel, BoxLayout.Y_AXIS));

        toppanel = new JPanel();
        toppanel.setPreferredSize(new Dimension(530, 450));
        toppanel.setBackground(bgcolor);

        applicationname = new JLabel("Healthy4You");
        applicationname.setFont(headingfont);
        applicationname.setForeground(headingcolor);
        applicationname.setAlignmentX(Component.CENTER_ALIGNMENT);

        applicationslogan = new JLabel("");
        applicationslogan.setFont(textfont);
        applicationslogan.setForeground(textcolor);
        applicationslogan.setAlignmentX(Component.CENTER_ALIGNMENT);

        centerpanel = new JPanel();
        centerpanel.setPreferredSize(new Dimension(530,300));
        centerpanel.setBackground(bgcolor);

        centerpanel.add(Box.createVerticalGlue());
        centerpanel.add(applicationname);
        centerpanel.add(applicationslogan);
        centerpanel.add(Box.createVerticalGlue());

        bottompannel = new JPanel();
        bottompannel.setPreferredSize(new Dimension(530,350));
        bottompannel.setBackground(bgcolor);

        mainpanel.add(toppanel);
        mainpanel.add(centerpanel);
        mainpanel.add(bottompannel);

        frame.setContentPane(mainpanel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
