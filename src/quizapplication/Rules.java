package quizapplication;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start;
    
    Rules(String name){

        this.name=name;
        getContentPane().setBackground(Color.PINK);
        setLayout(null);

        JLabel heading = new JLabel("Blackpink - Blinks  :  The Rules");
        heading.setBounds(69, 33, 700, 50);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40 ));
        heading.setForeground(new Color(170, 51, 106));
        add(heading);

        JLabel names = new JLabel(name + ",  It's Not A Comeback Since We Have Never Left.");
        names.setBounds(60, 109, 700, 30);
        names.setFont(new Font("Serif", Font.BOLD, 23 ));
        names.setForeground(new Color(150, 75, 0));
        add(names);

        JLabel rule1 = new JLabel(" 1:- Jennie is going 'SOLO' so go after her.");
        rule1.setBounds(50, 190, 700, 30);
        rule1.setFont(new Font("Monospaced", Font.BOLD, 19 ));
        rule1.setForeground(Color.BLACK);
        add(rule1);

        JLabel rule2 = new JLabel(" 2:- Lisa is a RockStar so you gotta Rock Hard.");
        rule2.setBounds(50, 240, 800, 30);
        rule2.setFont(new Font("Monospaced", Font.BOLD, 19 ));
        rule2.setForeground(Color.BLACK);
        add(rule2);

        JLabel rule3 = new JLabel(" 3:- Rose worked her whole life for you to 'Realise'.");
        rule3.setBounds(50, 290, 800, 30);
        rule3.setFont(new Font("Monospaced", Font.BOLD, 19 ));
        rule3.setForeground(Color.BLACK);
        add(rule3);

        JLabel rule4 = new JLabel(" 4:- Remember, All Eyes are on Jisoo.");
        rule4.setBounds(50, 340, 800, 30);
        rule4.setFont(new Font("Monospaced", Font.BOLD, 19 ));
        rule4.setForeground(Color.BLACK);
        add(rule4);

        JLabel rule5 = new JLabel(" 5:- Warning!, BLACKPINK is a Pretty Pretty Savage.");
        rule5.setBounds(50, 390, 800, 30);
        rule5.setFont(new Font("Monospaced", Font.BOLD, 19 ));
        rule5.setForeground(Color.BLACK);
        add(rule5);

        JLabel rule6 = new JLabel(" 6:- Bring Money to the table not the 'Dinner'.");
        rule6.setBounds(50, 440, 800, 30);
        rule6.setFont(new Font("Monospaced", Font.BOLD, 19 ));
        rule6.setForeground(Color.BLACK);
        add(rule6);

        JLabel rule7 = new JLabel(" 7:- It's hard to love, better get the trust.");
        rule7.setBounds(50, 490, 800, 30);
        rule7.setFont(new Font("Monospaced", Font.BOLD, 19 ));
        rule7.setForeground(Color.BLACK);
        add(rule7);

        JLabel text = new JLabel("BLACKPINK  IN  YOUR  AREA");
        text.setBounds(390, 540, 360, 50);
        text.setFont(new Font("Serif", Font.BOLD, 23 ));
        text.setForeground(new Color(170, 51, 106));
        add(text);

        start = new JButton("Let's Start");
        start.setBounds(70, 550, 190, 35);
        start.setFont(new Font("Serif", Font.ITALIC, 37));
        start.setBackground(Color.BLACK);
        start.addActionListener(this);
        // start.setMargin(new Insets(3, 3, 3, 3));
        start.setForeground(new Color(255, 0, 255));
        add(start);

        setSize(800, 650);
        setLocation(360, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            setVisible(false);
            new Quiz(name);
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
