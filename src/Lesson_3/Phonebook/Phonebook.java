package Lesson_3.Phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    private HashMap<String, ArrayList<String>> book = new HashMap<>();

//  Пустой конструктор
    public Phonebook() {
    }

//    Сеттер. Мутод добавления записи в справочник.
    public void newInfo(String name, String phone) {
        if(!book.isEmpty()) {
            if (book.containsKey(name)) {
                ArrayList<String> phones = getNumberByName(name);
                if (!phones.contains(phone)) phones.add(phone);
                book.put(name, phones);
            } else {
                ArrayList<String> phones = new ArrayList<>();
                phones.add(phone);
                book.put(name, phones);
            }
        }else {       // Проверяю, чтобы книга была непустая и сразу добавлять, ничего не искать и не получать NullPointerException
                ArrayList<String> phones = new ArrayList<>();
                phones.add(phone);
                book.put(name, phones);
            }
        }

//  Метод поиска номеров по имени
    public ArrayList<String> getNumberByName (String key){
        for (Map.Entry<String, ArrayList<String>> entries : book.entrySet()) {
            if (entries.getKey().equals(key)) return entries.getValue();
        }
        return new ArrayList<>();
    }

}
