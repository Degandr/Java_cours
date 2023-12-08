package Home_works_17.PrepareRegistrationData;

import Home_works_17.dataGenerate.DataFakerGenerate;
import Home_works_17.dataGenerate.DataStaticGenerate;
import Home_works_17.models.SaucedemoModel;

public class PrepareRegistrationData {
    public static SaucedemoModel fakerPreparation() {
        DataStaticGenerate data = new DataStaticGenerate();
        return SaucedemoModel
                .builder()
                .url(data.getUrl())
                .username(DataFakerGenerate.generateUsername())
                .password(DataFakerGenerate.generatePassword())
                .build();
    }

    public static SaucedemoModel staticStandartPreparation() {
        DataStaticGenerate data = new DataStaticGenerate();
        return SaucedemoModel
                .builder()
                .url(data.getUrl())
                .username(data.getStandartUser())
                .password(data.getPassword())
                .build();
    }

    public static SaucedemoModel staticLockedPreparation() {
        DataStaticGenerate data = new DataStaticGenerate();
        return SaucedemoModel
                .builder()
                .url(data.getUrl())
                .username(data.getLockedOutUser())
                .password(data.getPassword())
                .build();
    }

    public static SaucedemoModel staticProblemUserPreparation() {
        DataStaticGenerate data = new DataStaticGenerate();
        return SaucedemoModel
                .builder()
                .url(data.getUrl())
                .username(data.getProblemUser())
                .password(data.getPassword())
                .build();
    }

    public static SaucedemoModel staticPerformanceGlitchUserPreparation() {
        DataStaticGenerate data = new DataStaticGenerate();
        return SaucedemoModel
                .builder()
                .url(data.getUrl())
                .username(data.getPerformanceGlitchUser())
                .password(data.getPassword())
                .build();
    }

    public static SaucedemoModel staticErrorUserPreparation() {
        DataStaticGenerate data = new DataStaticGenerate();
        return SaucedemoModel
                .builder()
                .url(data.getUrl())
                .username(data.getErrorUser())
                .password(data.getPassword())
                .build();
    }

    public static SaucedemoModel staticVisualUserPreparation() {
        DataStaticGenerate data = new DataStaticGenerate();
        return SaucedemoModel
                .builder()
                .url(data.getUrl())
                .username(data.getVisualUser())
                .password(data.getPassword())
                .build();
    }
}
