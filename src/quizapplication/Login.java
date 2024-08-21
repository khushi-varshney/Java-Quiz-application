package quizapplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements  ActionListener{

    JButton rules, back;
    JTextField tfname;

    Login(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);

        JLabel heading = new JLabel("Blackpink - Blinks");
        heading.setBounds(670, 60, 500, 70);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40 ));
        heading.setForeground(new Color(170, 51, 106));
        add(heading);

        JLabel name = new JLabel("Enter Your Full Name");
        name.setBounds(780, 160, 300, 30);
        name.setFont(new Font("Serif", Font.BOLD, 20 ));
        name.setForeground(Color.BLACK);
        add(name);

        tfname = new JTextField("Khushi Varshney");
        tfname.setBounds(739, 200, 300, 35);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 17));
        tfname.setForeground(new Color(255,105,180));
        tfname.setMargin(new Insets(3, 3, 3, 3));
        add(tfname);

        rules = new JButton("The Rules");
        rules.setBounds(735, 270, 140, 35);
        rules.setFont(new Font("Serif", Font.BOLD, 21));
        rules.setBackground(Color.BLACK);
        rules.addActionListener(this);
        rules.setForeground(new Color(255, 0, 255));
        add(rules);

        back = new JButton("Back");
        back.setBounds(915, 270, 140, 35);
        back.setFont(new Font("Serif", Font.BOLD, 21));
        back.setBackground(Color.BLACK);
        back.addActionListener(this);
        back.setForeground(new Color(255, 0, 255));
        add(back);

        JLabel text = new JLabel("BLACKPINK  IN  YOUR  AREA");
        text.setBounds(730, 340, 360, 50);
        text.setFont(new Font("Serif", Font.BOLD, 23 ));
        text.setForeground(Color.BLACK);
        add(text);

        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true); 

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back){
            setVisible(false);
        }
    }

    public static void main(String[] args) {

        new Login();
    }
}
