package Lesson_3.RegEx;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {

//  1 Обязательно есть хоть 1 цифра
//  2 Не менее 8 символов и не более 20
//  3 Должны быть большие и маленькие буквы
//  4 Обязательно дожен быть спец символ


        String password = Read();
        String[] message = checkPassword_4Step(password);
        while (!(message[0].equals("Ok") && message[1].equals("Ok") && message[2].equals("Ok") && message[3].equals("Ok"))) {
            JOptionPane.showMessageDialog(null, message, "Ненадёжный пароль", JOptionPane.WARNING_MESSAGE);
            password = Read();
            message = checkPassword_4Step(password);
        }
        JOptionPane.showMessageDialog(null, "\"" + password + "\"" + " отличный пароль!", "Отличный пароль", JOptionPane.INFORMATION_MESSAGE);


//        Тест
//        System.out.println(checkPassword_1Step("AAAAAAAAAAAAA"));
//        System.out.println(checkPassword_1Step("AAaaaaaaaaaa"));
//        System.out.println(checkPassword_1Step("Aaaaaaaaaaa3"));
//        System.out.println(checkPassword_1Step("8Aa+qqqqqqqqq"));
//        System.out.println(checkPassword_1Step("Aaaaaaaaaa+"));
    }



    public static String Read() {
        return JOptionPane.showInputDialog(null, "Придумайте надёжный пароль, в котором:\n" +
                "   1 Обязательно есть хоть 1 цифра\n" +
                "   2 Не менее 8 символов и не более 20\n" +
                "   3 Должны быть большие и маленькие буквы\n" +
                "   4 Обязательно дожен быть спец символ", "Password", JOptionPane.QUESTION_MESSAGE);
    }



    public static String[] checkPassword_4Step(String password) {
        String[] messages = new String[4];

        Pattern p1 = Pattern.compile("^.*\\d.*$");
        Matcher m1 = p1.matcher(password);
        if (m1.matches())
            messages[0] = "Ok";
        else
            messages[0] = "Пароль должен содержать хоть одну цифорку";

        Pattern p2 = Pattern.compile("^.{8,20}$");
        Matcher m2 = p2.matcher(password);
        if (m2.matches())
            messages[1] = "Ok";
        else
            messages[1] = "Пароль должен быть не менее 8 и не более 20 знаков!";

//        Кириллицу считаю спецсимволами
        Pattern p3 = Pattern.compile("^.*([A-Z].*[a-z])|([a-z].*[A-Z]).*$");
        Matcher m3 = p3.matcher(password);
        if (m3.matches())
            messages[2] = "Ok";
        else
            messages[2] = "Должны быть латинские буквы разного регистра!";

//    Кириллицу считаю спецсимволами
        Pattern p4 = Pattern.compile("^.*\\W.*$");
        Matcher m4 = p4.matcher(password);
        if (m4.matches())
            messages[3] = "Ok";
        else
            messages[3] = "Нужен хотябы один спцсимвол!";

        return messages;
    }


//    С одним RegX не получилось (
    public static boolean checkPassword_1Step(String password) {

//        Pattern p5 = Pattern.compile("^(\\d+[A-Z]+[a-z]+\\W)|(\\d+[a-z]+[A-Z]+\\W)|(\\d+\\W+[A-Z]+[a-z])|(\\d+\\W+[a-z]+[A-Z]+\\W)|" +
//                "([A-Z]+\\d+[a-z]+\\W)|([a-z]+\\d+[A-Z]+\\W)|(\\W+\\d+[A-Z]+[a-z])|(\\W+\\d+[a-z]+[A-Z]+\\W)|" +
//                "([A-Z]+[a-z]+\\d+\\W)|([a-z]+[A-Z]+\\d+\\W)|(\\W+[A-Z]+\\d+[a-z])|(\\W+[a-z]+[A-Z]+\\d+\\W)" +
//                "([A-Z]+[a-z]+\\W+\\d)|([a-z]+[A-Z]+\\W+\\d)|(\\W+[A-Z]+[a-z]+\\d)|(\\W+[a-z]+[A-Z]+\\W+\\d){8,20}$");


        Pattern p5 = Pattern.compile("^(\\d*.*\\W){8,20}$");
        Matcher m5 = p5.matcher(password);
        return m5.matches();
    }
}