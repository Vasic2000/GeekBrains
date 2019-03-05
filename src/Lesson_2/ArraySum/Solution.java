package Lesson_2.ArraySum;

public class Solution {
    public static void main(String[] args) {
        String[][] myArray = {
                {"1", "2", "3","4"},
                {"пять","6","7","8"},
                {"1", "2", "3", "4", "5"},
                {"5","6","7", "6"}
        };

//        String[][] myArray = {
//                {"1", "2", "3","4"},
//                {"5","6","7","8"},
//                {"1", "2", "3","4"},
//                {"5","6","7", "8"}
//        };
        //Вариант 1
        try {
            System.out.println("Сумма элементов = " + new ArraySum().summa(myArray));
        }
        catch (MyArraySizeException SE) {
            SE.printStackTrace();
        }
        catch (MyArrayDataException EX) {
            EX.printStackTrace();
        }

        //Вариант 2
        try {
            System.out.println("Сумма элементов = " + new ArraySum2().summa2(myArray));
        }
        catch (MyArraySizeException SE) {
            SE.printStackTrace();
        }
        catch (MyArrayDataException EX) {
            EX.printStackTrace();
        }
    }
}
