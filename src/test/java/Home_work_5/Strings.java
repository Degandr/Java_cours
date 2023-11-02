package Home_work_5;

public class Strings {
    public static final String str = "I like Java!!!";

    public static void methods() {
        System.out.println("The last character is - " + str.charAt(str.length()-1));
        System.out.println("Is the string contain 'Java' word? - " + str.contains("Java"));
        System.out.println("Replace all 'a' on 'o' - " + str.replace("a", "o"));
        System.out.println("String in uppercase - " + str.toUpperCase());
        System.out.println("String in lowercase - " + str.toLowerCase());
        System.out.println("Cut 'Java' string from 'str' - " + str.substring(7, 11));
    }

    public static void format() {
        String sourceStr = "корж %s корж";
        String newStr = String.format(sourceStr, "крем");
        System.out.println(newStr);
    }


    public static void main(String[] args) {
        methods();
        format();
    }
}
