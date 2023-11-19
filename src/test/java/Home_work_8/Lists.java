package Home_work_8;

import java.util.*;

public class Lists {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 7; i++) {
            if (i == 4) {
                numbers.add(i);
                numbers.add(i);
            } else numbers.add(i);
        }
        Set<Integer> set = new HashSet<>(numbers);
        System.out.println("ArrayList - " + numbers);
        System.out.println("Set - " + set);
    }
}
