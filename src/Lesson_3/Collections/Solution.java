package Lesson_3.Collections;

import java.util.HashMap;
import java.util.Map;

public class Solution {
//    Урок 3. Коллекции
//    1. Создать массив с набором слов (10-20 слов, среди которых должны встречаться повторяющиеся).
//    Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
//    Посчитать, сколько раз встречается каждое слово.


    public static void main(String[] args) {
        String[] array20 = new Array().getArray20();
        HashMap<String, Integer> hm = new Mapp(array20).getHm();

        for (Map.Entry<String, Integer> entries : hm.entrySet()) {
            System.out.println(entries.getKey() + " " + entries.getValue());
        }
    }
}