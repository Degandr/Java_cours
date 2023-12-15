package Home_work_20.Tests.DataProvider.OldCode;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataFakerGenerate {
    private static final Faker faker = new Faker(new Locale("ru"));

    public static String generateUsername() {
        return faker.internet().emailAddress();
    }

    public static String generatePassword() {
        return faker.internet().password();
    }
}