import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Score extends JFrame implements ActionListener {


    Score(String name,int score){
        setBounds(0, 0, 1550, 900);
        getContentPane().setBackground(Color.ORANGE);
        setLayout(null);

        // image

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("imgs/score3.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(170, 90, 1000, 400);
        add(image);

        JLabel heading = new JLabel("Thank you " + name + " for playing Quiz2Me");
        heading.setBounds(450, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);

        if (score>=50) {
            JLabel lblScore = new JLabel("Congratulations! "+ name +" You have passed the test ");
            lblScore.setBounds(450, 550, 700, 30);
            lblScore.setFont(new Font("Tahoma", Font.PLAIN, 26));
            add(lblScore);
            
        } else {
            JLabel lblScore = new JLabel("OOP! "+ name +" You are fell, try again" );
            lblScore.setBounds(450, 550, 700, 30);
            lblScore.setFont(new Font("Tahoma", Font.PLAIN, 26));
            add(lblScore);
        }
        JLabel lblScore = new JLabel("Your Score is " + score );
        lblScore.setBounds(500, 600, 300, 30);
        lblScore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(lblScore);

        JButton submit = new JButton("Home");
        submit.setBounds(500, 670, 120, 30);
        submit.setFont(new Font("Tohama", Font.PLAIN, 22));
        submit.setBackground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        setVisible(true);
        
    }

    public void actionPerformed(ActionEvent ae){
      setVisible(false);
     // new Login();
    }

 public static void main(String[] args) {
    new Score("User",0);
 }    
}
