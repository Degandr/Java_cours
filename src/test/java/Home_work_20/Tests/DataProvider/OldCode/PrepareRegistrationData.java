package Home_work_20.Tests.DataProvider.OldCode;

public class PrepareRegistrationData {
    public static SaucedemoModel fakerPreparation() {
        return SaucedemoModel
                .builder()
                .username(DataFakerGenerate.generateUsername())
                .password(DataFakerGenerate.generatePassword())
                .build();
    }

    public static SaucedemoModel staticLockedPreparation() {
        DataStaticGenerate data = new DataStaticGenerate();
        return SaucedemoModel
                .builder()
                .username(data.getLockedOutUser())
                .password(data.getPassword())
                .build();
    }
}
