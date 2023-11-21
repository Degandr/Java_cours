package Home_work_8;

import java.util.HashMap;
import java.util.Map;

public class Hmap {
    public static Map<String, Integer> sets = new HashMap<>();

    public static void iterate() {
        for (Map.Entry<String, Integer> item : sets.entrySet()) {
            System.out.printf("Key %s Value %d \n", item.getKey(), item.getValue());
        }
    }

    public static void keySet() {
        System.out.println("KeySet - " + sets.keySet());
    }

    public static void values() {
        System.out.println("Values - " + sets.values());
    }

    public static void main(String[] args) {
        sets.put("book_1", 1);
        sets.put("book_2", 2);
        sets.put("book_3", 3);
        sets.put("book_4", 4);
        iterate();
        keySet();
        values();
    }
}
