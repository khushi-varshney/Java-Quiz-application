package quizapplication;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Score extends JFrame implements ActionListener{

    String name;
    int score;
    JButton again;

    Score(String name, int score){

        this.name=name;
        this.score=score;

        setBounds(400, 150, 750, 630);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/blackpink.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(75, -50, 600, 250);
        add(image);

        JLabel heading = new JLabel("Thank You " + name + " for Playing");
        heading.setBounds(170, 230,700, 400);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.ITALIC, 26));
        add(heading);

        JLabel lblscore = new JLabel("Your Score is :  " + score);
        lblscore.setBounds(242, 330,700, 300);
        lblscore.setForeground(new Color(170, 51, 106));
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 34));
        add(lblscore);

        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icons/gifs.gif"));
        JLabel image2 = new JLabel(i2);
        image2.setBounds(0, 0, 750, 550);
        add(image2);

        again = new JButton("Play Again");
        again.setBounds(230, 530, 300, 40);
        again.setFont(new Font("Tahoma", Font.ITALIC, 27));
        again.setBackground(Color.pink);
        again.addActionListener(this);
        add(again);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    
    public static void main(String[] args) {
        new Score("User", 0);
    }

}
