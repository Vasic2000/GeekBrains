package Lesson_3.Phonebook;

import java.util.HashSet;

public class Solution {

    //       Урок 3. Коллекции
//
//      2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
//      В этот телефонный справочник с помощью метода add() можно добавлять записи.
//      С помощью метода get() искать номер телефона по фамилии.
//      Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
//      тогда при запросе такой фамилии должны выводиться все телефоны.

    public static void main(String[] args) {
        Phonebook book = new Phonebook();

//        Это тест
        book.newInfo("Алексеева", "282-46-33");
        book.newInfo("Петрова", "602-22-15");
        book.newInfo("Иванова", "479-85-39");
        book.newInfo("Сидорова", "550-49-18");
        book.newInfo("Смирнова", "282-50-91");
        book.newInfo("Лондарская", "615-51-33");
        book.newInfo("Скорина", "616-32-33");
        book.newInfo("Шмелёва", "945-17-15");
        book.newInfo("Халипова", "215-98-76");
        book.newInfo("Самойлова", "215-03-88");
//        Новый номер
        book.newInfo("Алексеева", "282-46-34");
        book.newInfo("Алексеева", "282-46-35");
//        Существующий номер
        book.newInfo("Алексеева", "282-46-33");
//        Вытаскиваю номера Алексеевой
        PrintNumbers("Алексеева", book);
//        Несуществующий номер
        PrintNumbers("Олексеева", book);
    }

    static void PrintNumbers(String name, Phonebook book) {
        HashSet<String> phones = book.getNumberByName(name);
        if(phones.isEmpty())
            System.out.println("Нет такого имени = " + name);
        else for(String str : phones)
            System.out.println(str);
    }

}
