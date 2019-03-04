package Lesson_2;

public class Solution {
    public static void main(String[] args) {
        String[][] myArray = {{"1", "2", "3","4"}, {"пять","6","7","8"}, {"1", "2", "3","4"}, {"5","6","7","8"}, {"1", "2", "3","4"}, {"5","6","7","8"}};
        try {
            System.out.println("Сумма элементов = " + new ArraySum().summa(myArray));
        } catch (MyArrayDataException EX) {
            EX.printStackTrace();
        }
    }
}
