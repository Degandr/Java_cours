package Home_work_15.Tests;

import Home_work_15.PageObject.LoginPage;
import Home_work_15.PageObject.ProductsPage;
import Home_work_15.Steps.LoginSteps;
import Home_work_15.Steps.ProductsSteps;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {
    @Test
    public void logoutPageObject() {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.fillLogin(Credentials.USER_LOGIN);
        loginPage.fillPassword(Credentials.USER_PASSWORD);
        loginPage.clickLogin();
        ProductsPage productsPage = new ProductsPage();
        productsPage.burgerMenuOpen();
        productsPage.logoutButtonClick();
        loginPage.checkBoxWithCredentials();
    }
    @Test
    public void logoutSteps(){
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.login(Credentials.USER_LOGIN, Credentials.USER_PASSWORD);
        ProductsSteps productsSteps = new ProductsSteps();
        productsSteps.logout();
    }
}
