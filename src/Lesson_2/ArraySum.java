package Lesson_2;

public class ArraySum {
    private String array[][] = new String[4][4];
    private int ArraySum = 0;

    public int summa (String[][] array) throws MyArrayDataException {


        this.array = array;
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
