package Home_work_21;

import com.github.javafaker.Faker;

public class DataGenerator {
    private static final Faker faker = new Faker();

    public static String generateFirstName() {
        return faker.name().firstName();
    }
}
