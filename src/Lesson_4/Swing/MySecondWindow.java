package Lesson_4.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Lesson_4.Swing.Solution.mfw;


public class MySecondWindow extends JFrame {
    public JTextField jta21;
    public JTextField jta22;
    public JTextField jta23;

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
        jta21 = new JTextField();
        jta21 = new JTextField(mfw.jta1.getText());
        jp[0][0].add(jta21);

        jp[1][0].setLayout(new BorderLayout());
        jta22 = new JTextField();
        jta22 = new JTextField(mfw.jta2.getText());
        jp[1][0].add(jta22);

        jp[2][0].setLayout(new BorderLayout());
        jta23 = new JTextField();
        jta23 = new JTextField(mfw.jta3.getText());
        jp[2][0].add(jta23);

        jp[3][0].setLayout(new BorderLayout());
        JButton jbtn = new JButton("Confirm");
        jbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mfw.jta1.setText(jta21.getText());
                mfw.jta2.setText(jta22.getText());
                mfw.jta3.setText(jta23.getText());
                setVisible(false);
            }
        });
        jp[3][0].add(jbtn);
    }
}
