package Home_work_19.Tests.Autotests;

import Home_work_19.PageObject.Pages.LoginPage;
import Home_work_19.PageObject.Pages.ProductsPage;
import Home_work_19.Steps.LoginSteps;
import Home_work_19.Steps.ProductsSteps;
import Home_work_19.Tests.BaseTest;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {
    @Test
    public void logoutPageObjectTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.fillLogin(System.getProperty("username"));
        loginPage.fillPassword(System.getProperty("password"));
        loginPage.clickLogin();
        ProductsPage productsPage = new ProductsPage();
        productsPage.burgerMenuOpen();
        productsPage.logoutButtonClick();
        loginPage.checkBoxWithCredentials();
    }

    @Test
    public void logoutStepsTest() {
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.login(System.getProperty("username"), System.getProperty("password"));
        ProductsSteps productsSteps = new ProductsSteps();
        productsSteps.logout();
    }
}
