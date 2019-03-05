package Lesson_2.ArraySum;

public class ArraySum {
    private String array[][] = new String[4][4];
    private int ArraySum = 0;

    public int summa (String[][] array) throws MyArrayDataException, MyArraySizeException {

//        Столкнулся с тем, что массив [][] не обязательно ровный!
//        В нем может быть в перввой строке 5 элементов, во второй 4...
//        Поэтому проверяю сначала на количество строк, потом длину каждой строки (можно было бы обрезать).
        if(array.length != 4) throw new MyArraySizeException("Массив должен быть 4 x 4\nВ нем :" + array.length + " строк!");
        for(int i = 0; i < 4; i++) if(array[i].length != 4) throw new MyArraySizeException("Массив должен быть 4 x 4\nВ нем в " +
                (i+1) + " строе " + array[i].length + " элементов!");


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