package Lesson_2.ArraySum;

public class Solution {

//    Урок 2. Исключения
//
//  1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4, при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//  2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException – с детализацией, в какой именно ячейке лежат неверные данные.
//  3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException и вывести результат расчета.

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
