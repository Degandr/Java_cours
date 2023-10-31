package Home_work_1;

public class Home_work_1 {
    public static void first() {
        for (int i = 1; i < 5; i++) {
            if (i == 1) {
                System.out.println("one");
            } else if (i == 2) {
                System.out.println("two");
            } else if (i == 3) {
                System.out.println("three");
            } else {
                System.out.println("four");
            }
        }
    }

    public static void second() {
        for (int i = 1; i < 5; i++) {
            switch (i) {
                case 1 -> System.out.println("one");
                case 2 -> System.out.println("two");
                case 3 -> System.out.println("tree");
                case 4 -> System.out.println("four");
                default -> System.out.println("Not a one, two, three or four");
            }
        }
    }

    public static void third() {
        int i = 10;
        int result = 0;
        while ((10 <= i) && (i < 55)) {
            if (i % 2 == 0) {
                result += i;
            }
            i++;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        first();
        second();
        third();
    }
}
