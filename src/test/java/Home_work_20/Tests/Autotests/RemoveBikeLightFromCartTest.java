package Home_work_20.Tests.Autotests;

import Home_work_20.PageObject.Pages.CartPage;
import Home_work_20.PageObject.Pages.LoginPage;
import Home_work_20.PageObject.Pages.ProductsPage;
import Home_work_20.Steps.CartSteps;
import Home_work_20.Steps.LoginSteps;
import Home_work_20.Steps.ProductsSteps;
import Home_work_20.Tests.BaseTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Description;
import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;

@Log4j2
public class RemoveBikeLightFromCartTest extends BaseTest {
    private final String CART_BADGE_NUMBER = "1";

    @Test
    @Description("Check removing functionality using Page Object")
    @Severity(SeverityLevel.NORMAL)
    public void removeBikeLightFromCartPageObjectTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.fillLogin(System.getProperty("username"));
        loginPage.fillPassword(System.getProperty("password"));
        loginPage.clickLogin();
        log.info("User login was successful");
        ProductsPage productsPage = new ProductsPage();
        productsPage.bikeLightAddToCart();
        productsPage.checkBikeLightRemoveButton();
        productsPage.checkCartBadgeNumber(CART_BADGE_NUMBER);
        productsPage.goToCart();
        log.info("Bike Light was successfully added to the Cart");
        CartPage cartPage = new CartPage();
        cartPage.clickRemoveButtonForBikeLight();
        cartPage.checkCartBadgeIsNotVisible();
        cartPage.checkBikeLightTitleIsNotVisible();
        log.info("Bike Light was successfully removed from the Cart");
    }

    @Test
    @Description("Check removing functionality using Steps")
    @Severity(SeverityLevel.NORMAL)
    public void removeBikeLightFromCartStepsTest() {
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.login(System.getProperty("username"), System.getProperty("password"));
        ProductsSteps productsSteps = new ProductsSteps();
        productsSteps.buyBikeLightOnly(CART_BADGE_NUMBER);
        CartSteps cartSteps = new CartSteps();
        cartSteps.removeBikeLightFromCart();
    }
}
