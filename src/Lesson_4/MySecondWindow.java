package Lesson_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Lesson_4.Solution.mfw;

public class MySecondWindow extends JFrame {

    public MySecondWindow() {
        setTitle("My First Window");
        setBounds(600,300,500,500);

        setLayout(new GridLayout(4 ,2));
        JPanel[][] jp = new JPanel[4][2];
        for(int i = 0; i < 4; i++)
            for (int j = 0; j < 2; j++) {
                jp[i][j] = new JPanel();
                add(jp[i][j]);
                jp[i][j].setBackground(new Color( 100 + i * 40, 90 + i * 40, 120 - j * 40));
            }

        jp[0][0].setLayout(new BorderLayout());
        JTextArea jta21 = new JTextArea();
        jta21.append(mfw.getName());
        jta21.setPreferredSize(new Dimension(200, 100));
        jp[0][0].add(jta21);

        jp[1][0].setLayout(new BorderLayout());
        JTextArea jta22 = new JTextArea();
        jta22.append(mfw.getSecondName());
        jta22.setPreferredSize(new Dimension(200, 100));
        jp[1][0].add(jta22);

        jp[2][0].setLayout(new BorderLayout());
        JTextArea jta23 = new JTextArea();
        jta23.append(mfw.getSurname());
        jta23.setPreferredSize(new Dimension(200, 100));
        jp[2][0].add(jta23);

        jp[3][0].setLayout(new BorderLayout());
        JButton jbtn = new JButton("Confirm");
        jbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setVisible(false);
            }
        });
        jp[3][0].add(jbtn);

    }
}
