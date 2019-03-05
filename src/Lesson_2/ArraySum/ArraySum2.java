package Lesson_2.ArraySum;

public class ArraySum2 {

    private String array[][] = new String[4][4];
    private int ArraySum = 0;

    public int summa2 (String[][] array) throws MyArrayDataException, MyArraySizeException {

//          Второй вариант решения:

        for(int a = 0; a < array.length; a++)
            for(int b = 0; b < array[a].length; b++)
                try {
                    this.array[b][a] = array[b][a];
                } catch (ArrayIndexOutOfBoundsException IO) {
                    throw new MyArraySizeException("Массив должен быть 4 x 4\nВ нем в " + (a+1) + " строке " + (b+1) + " элементов!");
                }

        for(int i = 0; i < array[0].length; i++)
            for(int j = 0; j < array.length; j++)
                try {
                    ArraySum += Integer.parseInt(array[j][i]);
                } catch(NumberFormatException NF) {
                    throw new MyArrayDataException("В строке " + (j + 1) +
                            " столбце " + (i + 1) + " не цифра, там \""+ array[j][i] + "\"!");
                }
        return ArraySum;
    }
}
