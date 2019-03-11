package Lesson_3.Phonebook;

import java.util.*;

public class Phonebook {

    private HashMap<String, HashSet<String>> book = new HashMap<>();

//  Пустой конструктор
    public Phonebook() {
    }

//    Сеттер. Мутод добавления записи в справочник.
    public void newInfo(String name, String phone) {
        HashSet<String> phone_set = book.getOrDefault(name, new HashSet<>());
        phone_set.add(phone);
        book.put(name, phone_set);
        }

//  Метод поиска номеров по имени
    public HashSet<String> getNumberByName (String key){
        for (Map.Entry<String, HashSet<String>> entries : book.entrySet()) {
            if (entries.getKey().equals(key)) return entries.getValue();
        }
        return new HashSet<>();
    }

}
