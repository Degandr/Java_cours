package Home_work_20.Steps;

import Home_work_20.PageObject.Pages.LoginPage;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class LoginSteps {

    public void login(String email, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.fillLogin(email);
        loginPage.fillPassword(password);
        loginPage.clickLogin();
        log.info("Method '{}' was executed successfully", new Object(){}.getClass().getEnclosingMethod().getName());
    }
}
