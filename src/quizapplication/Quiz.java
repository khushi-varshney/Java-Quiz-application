package quizapplication;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Quiz extends JFrame implements ActionListener{

    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String userAnswers[][] = new String[10][1];

    String name;

    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    JButton next, lifeLine, submit;
    ButtonGroup groupOptions;

    
    public static int timer=15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;

    Quiz(String name){

        this.name = name;

        setBounds(50, 5, 1400, 800);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/blackpink1.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 10, 1400, 330);
        add(image);

        qno = new JLabel();
        qno.setBounds(100, 390,50, 30);
        qno.setForeground(new Color(170, 51, 106));
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);

        question = new JLabel();
        question.setBounds(137, 390,1200, 30);
        question.setForeground(new Color(170, 51, 106));
        question.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(question);

        questions[0][0] = "Choose the correct order in which Blackpink were first revealed befor their debut through YG's Official Social Media.";
        questions[0][1] = "Jisoo-Jennie-Rose-Lisa";
        questions[0][2] = "Jennie-Lisa-Jisoo-Rose";
        questions[0][3] = "Lisa-Rose-Jennie-Jisoo";
        questions[0][4] = "Rose-Jisoo-Jennie-Lisa";

        questions[1][0] = "Choose the correct sum of all BLACKPINK member's birthdates.";
        questions[1][1] = "757";
        questions[1][2] = "700";
        questions[1][3] = "770";
        questions[1][4] = "773";

        questions[2][0] = "What is the title of first dance video uploaded to the BLACKPINK ?";
        questions[2][1] = "Boombayah";
        questions[2][2] = "As if it's your Last";
        questions[2][3] = "Whistle";
        questions[2][4] = "Playing With Fire";

        questions[3][0] = "Choose the correct order in which Blackpink Alnum's were relaesed.";
        questions[3][1] = "The Album - Square Up - Born Pink - Kill This Love";
        questions[3][2] = "Square Up - Kill This Love - The Album - Born Pink";
        questions[3][3] = "Born Pink - The Album - Kill This Love - Square Up";
        questions[3][4] = "Kill This Love - Born Pink - Square Up - The Album";

        questions[4][0] = "Choose the correct meaning of the BORN PINK TOUR Content.";
        questions[4][1] = "Blackpink Memories";
        questions[4][2] = "Blackpink Moments";
        questions[4][3] = "Born Pink Memories";
        questions[4][4] = "Born Pink Moments";

        questions[5][0] = "What kind of flower does Jennie recieve from her mom every birthday ?";
        questions[5][1] = "Yellow Hyacinth";
        questions[5][2] = "Black Roses";
        questions[5][3] = "Pink Roses";
        questions[5][4] = "Blue Roses";

        questions[6][0] = "What was not the ending fairy pose for the 'SHUT DOWN' stage on 22.09.25 ?";
        questions[6][1] = "Cheek Poke";
        questions[6][2] = "Wink";
        questions[6][3] = "Heart";
        questions[6][4] = "Flying Kiss";

        questions[7][0] = "Choose a song that rose have never sung ?";
        questions[7][1] = "On The Ground";
        questions[7][2] = "Hard To Love";
        questions[7][3] = "Sticky";
        questions[7][4] = "Gone";

        questions[8][0] = "Messed Up, I'm still in _________ .";
        questions[8][1] = "Celine";
        questions[8][2] = "DIOR";
        questions[8][3] = "CHANEL";
        questions[8][4] = "GUCCI";

        questions[9][0] = "We're wards of pain, THe past and a ______ picture.";
        questions[9][1] = "three";
        questions[9][2] = "cause";
        questions[9][3] = "damn";
        questions[9][4] = "perfect";

        // questions[10][0] = "When did BLACKPINK debutes?";
        // questions[10][1] = "7 JULY 2016";
        // questions[10][2] = "8 AUGUST 2016";
        // questions[10][3] = "8 JULY 2016";
        // questions[10][4] = "7 AUGUST 2016";

        answers[0][1] = "Jennie-Lisa-Jisoo-Rose";
        answers[1][1] = "757";
        answers[2][1] = "Whistle";
        answers[3][1] = "Square Up - Kill This Love - The Album - Born Pink";
        answers[4][1] = "Born Pink Memories";
        answers[5][1] = "Blue Roses";
        answers[6][1] = "Cheek Poke";
        answers[7][1] = "Sticky";
        answers[8][1] = "Celine";
        answers[9][1] = "perfect";

        opt1 = new JRadioButton();
        opt1.setBounds(170, 460, 700, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setMargin(new Insets(3, 3, 3, 3));
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(170, 520, 700, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setMargin(new Insets(3, 3, 3, 3));
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(170, 580, 700, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setMargin(new Insets(3, 3, 3, 3));
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(170, 640, 700, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setMargin(new Insets(3, 3, 3, 3));
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);

        groupOptions = new ButtonGroup();
        groupOptions.add(opt1);
        groupOptions.add(opt2);
        groupOptions.add(opt3);
        groupOptions.add(opt4);

        next = new JButton("Next");
        next.setBounds(1100, 490, 200, 40);
        next.setFont(new Font("Tahoma", Font.ITALIC, 27));
        next.setBackground(Color.pink);
        next.addActionListener(this);
        add(next);

        lifeLine = new JButton("50-50 LifeLine");
        lifeLine.setBounds(1100, 570, 200, 40);
        lifeLine.setFont(new Font("Tahoma", Font.BOLD, 20));
        lifeLine.setBackground(Color.pink);
        lifeLine.addActionListener(this);
        add(lifeLine);

        submit = new JButton("Sumbit");
        submit.setBounds(1100, 650, 200, 40);
        submit.setFont(new Font("Tahoma", Font.ITALIC, 27));
        submit.setBackground(Color.pink);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);

        start(count);



        setVisible(true);
    }

    public void paint(Graphics g){
        super.paint(g);

        String time = "Time-Left : " + timer + " seconds";
        g.setColor(Color.RED);
        g.setFont(new Font("Times New Roman", Font.BOLD, 23));

        if (timer>0){
            g.drawString(time, 1000, 490);
        }else{
            g.drawString("Time's Up!", 1000, 490);
        }

        timer--;

        try{
            Thread.sleep(1000);   
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }

        if(ans_given == 1){
            ans_given = 0;
            timer=15;

        }else if(timer<0){
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count == 9){
                if(groupOptions.getSelection() == null){
                    userAnswers[count][0] = "";
                }else{
                    userAnswers[count][0] = groupOptions.getSelection().getActionCommand();
                }
                for(int i=0;i<userAnswers.length;i++){
                    if(userAnswers[i][0].equals(answers[i][1])){
                        score += 10;
                    }else{
                        score += 0;
                    }
                }
                setVisible((false));
                new Score(name, score);
            }else{
                if(groupOptions.getSelection() == null){
                    userAnswers[count][0] = "";
                }else{
                    userAnswers[count][0] = groupOptions.getSelection().getActionCommand();
                }
            }
 
            count++;
            start(count);
        }

    }

    public void start(int count){
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);

        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        groupOptions.clearSelection();

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == next){
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            ans_given = 1;
            if(groupOptions.getSelection() == null){
                userAnswers[count][0] = "";
            }else{
                userAnswers[count][0] = groupOptions.getSelection().getActionCommand();
            }

            if(count==8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            count++;
            start(count);
        }else if(ae.getSource() == lifeLine){
            if(count ==1 || count==6 || count==5||count==9 || count==8){
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }else{
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeLine.setEnabled(false);  
        }else{
            ans_given = 1;
            if(groupOptions.getSelection() == null){
                userAnswers[count][0] = "";
            }else{
                userAnswers[count][0] = groupOptions.getSelection().getActionCommand();
            }
            for(int i=0;i<userAnswers.length;i++){
                if(userAnswers[i][0].equals(answers[i][1])){
                    score += 10;
                }else{
                    score += 0;
                }
            }
            setVisible((false));
            new Score(name, score);
        }
    }

    public static void main(String[] args) {
        new Quiz("User");
    }

}
