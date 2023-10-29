package Home_work_2;

import java.util.Arrays;
import java.util.Random;

public class Home_work_2 {
    public static void first() {
        int[] arrs = new int[55];
        int summ = 0;
        int avr;
        for (int i = 0; i < arrs.length ; i++) {
            arrs[i] = i;
            summ += arrs[i];
        }
        avr = summ / arrs.length;
        System.out.println(avr);
        //secondApproach
        System.out.println(Arrays.stream(arrs).average());
    }

    public static void second() {
        int maxValue = 0;
        Random random = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
            if (i == 0) {
                maxValue = numbers[i];
            } else if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        System.out.println(maxValue);
        //second approach
        System.out.println(Arrays.stream(numbers).max());
    }

    public static void main(String[] args) {
        first();
        second();
    }
}
