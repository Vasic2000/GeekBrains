package Lesson_1.Vowels;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) throws IOException {
        printAll(FRead(System.getProperty("user.dir") + "\\src\\Lesson_1\\Vowels\\Stroka.txt"));
    }


    public static List<String> FRead(String file) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while(reader.ready()) list.add(reader.readLine());
        return list;
    }


    public static int vowelCount(String str) {
        String vowel = "AEIOUaeiou";
        int vowels = 0;
        char[] sst = str.toCharArray();
        char[] vowelsString = vowel.toCharArray();

        for(char s : sst)
            for(char a : vowelsString) {
                if (s == a) {
                    vowels++;
                }
            }
        return vowels;
    }


    public static void printAll(List<String> list) {
        for(String s : list)
            System.out.println(vowelCount(s));
    }

}
