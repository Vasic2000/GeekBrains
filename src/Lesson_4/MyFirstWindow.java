package Lesson_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Lesson_4.Solution.msw;


public class MyFirstWindow extends JFrame {

    private String name = "Иван";
    private String surname = "Иванов";
    private String secondName = "Иванович";


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
        JTextArea jta1 = new JTextArea();
        jta1.append(name);
        jta1.setPreferredSize(new Dimension(200, 100));
        jta1.setEditable(false);
        JScrollPane jsp1 = new JScrollPane(jta1);
        jp[0][0].add(jsp1);

        jp[1][0].setLayout(new BorderLayout());
        JTextArea jta2 = new JTextArea();
        jta2.append(secondName);
        jta2.setPreferredSize(new Dimension(200, 100));
        jta2.setEditable(false);
        JScrollPane jsp2 = new JScrollPane(jta2);
        jp[1][0].add(jsp2);

        jp[2][0].setLayout(new BorderLayout());
        JTextArea jta3 = new JTextArea();
        jta3.append(surname);
        jta3.setPreferredSize(new Dimension(200, 100));
        jta3.setEditable(false);
        JScrollPane jsp3 = new JScrollPane(jta3);
        jp[2][0].add(jsp3);

        jp[3][0].setLayout(new BorderLayout());
        JButton jbtn2 = new JButton("Edit");
        jbtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                msw.setVisible(true);
            }
        });
        jp[3][0].add(jbtn2);

        setVisible(true);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSecondName() {
        return secondName;
    }

}
