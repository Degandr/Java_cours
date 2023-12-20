package Home_work_22.Generator;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataGenerator {
    private static final Faker faker = new Faker();

    public static String generateName() {
        return faker.name().firstName();
    }

    public static String generateJob() {
        return faker.job().position();
    }

    public static String generatePassword() {
        return faker.internet().password();
    }
}
