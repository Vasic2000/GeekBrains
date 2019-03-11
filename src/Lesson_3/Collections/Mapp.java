package Lesson_3.Collections;

import java.util.HashMap;
import java.util.Map;

public class Mapp {
    private HashMap<String, Integer> hm = new HashMap<>();

    public Mapp(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (hm.isEmpty())       // Проверяю, чтобы книга была непустая и сразу добавлять, ничего не искать и не получать NullPointerException
                hm.put(array[i], 1);
            else {
                if (hm.containsKey(array[i]))
                    hm.put(array[i], getValueByKey(array[i]) + 1);
                else
                    hm.put(array[i], 1);
            }
        }
    }

    public int getValueByKey (String key){
        for (Map.Entry<String, Integer> entries : hm.entrySet()) {
            if (entries.getKey().equals(key)) return entries.getValue();
        }
        return -1;
    }

    public HashMap<String, Integer> getHm() {
        return hm;
    }
}
