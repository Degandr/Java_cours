package Home_work_23.Generator;

import com.github.javafaker.Faker;

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
