package Home_work_20.Tests.Autotests;

import Home_work_20.PageObject.Pages.LoginPage;
import Home_work_20.PageObject.Pages.ProductsPage;
import Home_work_20.Steps.LoginSteps;
import Home_work_20.Steps.ProductsSteps;
import Home_work_20.Tests.BaseTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Description;
import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;
@Log4j2
public class LogoutTest extends BaseTest {
    @Test
    @Description("Check logout functionality using Page Object")
    @Severity(SeverityLevel.CRITICAL)
    public void logoutPageObjectTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.fillLogin(System.getProperty("username"));
        loginPage.fillPassword(System.getProperty("password"));
        loginPage.clickLogin();
        log.info("Login was successful");
        ProductsPage productsPage = new ProductsPage();
        productsPage.burgerMenuOpen();
        productsPage.logoutButtonClick();
        log.info("Logout was successful");
        loginPage.checkBoxWithCredentials();
    }

    @Test
    @Description("Check logout functionality using Steps")
    @Severity(SeverityLevel.CRITICAL)
    public void logoutStepsTest() {
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.login(System.getProperty("username"), System.getProperty("password"));
        ProductsSteps productsSteps = new ProductsSteps();
        productsSteps.logout();
    }
}
