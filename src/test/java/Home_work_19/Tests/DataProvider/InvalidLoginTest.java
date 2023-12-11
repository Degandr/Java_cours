package Home_work_19.Tests.DataProvider;

import Home_work_19.Tests.DataProvider.OldCode.LoginPageObject;
import Home_work_19.Tests.DataProvider.OldCode.PrepareRegistrationData;
import Home_work_19.Tests.DataProvider.OldCode.SaucedemoModel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InvalidLoginTest {

    @Test(dataProvider = "invalidLoginData")
    public void invalidLoginTest(SaucedemoModel saucedemoModel) {
        LoginPageObject page = new LoginPageObject();
        page.openPage();
        page.fillLogin(saucedemoModel.getUsername());
        page.fillPassword(saucedemoModel.getPassword());
        page.clickLogin();
        page.checkErrorBox();
    }

    @DataProvider(name = "invalidLoginData")
    public Object[] input() {
        return new Object[]{
                PrepareRegistrationData.staticLockedPreparation(),
                PrepareRegistrationData.fakerPreparation()
        };
    }
}