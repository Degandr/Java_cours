package Home_work_15.Steps;

import Home_work_15.PageObject.Pages.LoginPage;

public class LoginSteps {
    public void login(String email, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.fillLogin(email);
        loginPage.fillPassword(password);
        loginPage.clickLogin();
    }
}
