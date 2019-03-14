package Lesson_4.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Lesson_4.Swing.Solution.msw;


public class MyFirstWindow extends JFrame {
    public JTextField jta1;
    public JTextField jta2;
    public JTextField jta3;

    public MyFirstWindow() {
        setTitle("My First Window");
        setBounds(300,300,500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new GridLayout(4 ,2));
        JPanel[][] jp = new JPanel[4][2];
        for(int i = 0; i < 4; i++)
        for (int j = 0; j < 2; j++) {
            jp[i][j] = new JPanel();
            add(jp[i][j]);
            jp[i][j].setBackground(new Color( 50 + i * 40, 100 + i * 40, 100 - j * 40));
        }

        jp[0][0].setLayout(new BorderLayout());
        jta1 = new JTextField("Иван");
        jta1.setEditable(false);
        jp[0][0].add(jta1);

        jp[1][0].setLayout(new BorderLayout());
        jta2 = new JTextField("Иванович");
        jta2.setEditable(false);
        jp[1][0].add(jta2);

        jp[2][0].setLayout(new BorderLayout());
        jta3 = new JTextField("Иванов");
        jta3.setEditable(false);
        jp[2][0].add(jta3);


        jp[3][0].setLayout(new BorderLayout());
        JButton jbtn1 = new JButton("Edit");
        jbtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                msw.setVisible(true);
            }
        });
        jp[3][0].add(jbtn1);

        setVisible(true);
    }
}
