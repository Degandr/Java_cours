package Home_works_17.SaucedemoSite;

import Home_works_17.PrepareRegistrationData.PrepareRegistrationData;
import Home_works_17.models.SaucedemoModel;
import org.testng.annotations.Test;

public class LoginStepsTest {
    LoginPageObject page = new LoginPageObject();
    private void fillInLoginPage(SaucedemoModel model) {
        page.openPage();
        page.fillLogin(model.getUsername());
        page.fillPassword(model.getPassword());
    }
    @Test
    public void execute() {
        fillInLoginPage(PrepareRegistrationData.fakerPreparation());
        fillInLoginPage(PrepareRegistrationData.staticStandartPreparation());
        fillInLoginPage(PrepareRegistrationData.staticLockedPreparation());
        fillInLoginPage(PrepareRegistrationData.staticProblemUserPreparation());
        fillInLoginPage(PrepareRegistrationData.staticPerformanceGlitchUserPreparation());
        fillInLoginPage(PrepareRegistrationData.staticErrorUserPreparation());
        fillInLoginPage(PrepareRegistrationData.staticVisualUserPreparation());
    }
}
