package Lesson_3.Regx;

import javax.swing.*;

public class Solution {
    public static void main(String[] args) {
        String[] warnings = new String[4];
        String password = JOptionPane.showInputDialog(null,"Придумайте парольнадёжный пароль, в котором:\n" +
                "   1 Обязательно есть хоть 1 цифра\n" +
                "   2 Не менее 8 символов и не более 20\n" +
                "   3 Должны быть большие и маленькие буквы\n" +
                "   4 Обязательно дожен быть спец символ", "Password", JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showMessageDialog(null, warnings);

    }

    public static String[] checkPassword_4Step(String password) {
        return null;
    }

    public static String[] checkPassword_1Step(String password) {
        return null;
    }
}
