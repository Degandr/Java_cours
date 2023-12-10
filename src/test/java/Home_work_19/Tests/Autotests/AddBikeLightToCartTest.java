package Home_work_19.Tests.Autotests;

import Home_work_19.PageObject.Pages.CartPage;
import Home_work_19.PageObject.Pages.LoginPage;
import Home_work_19.PageObject.Pages.ProductsPage;
import Home_work_19.Steps.CartSteps;
import Home_work_19.Steps.LoginSteps;
import Home_work_19.Steps.ProductsSteps;
import Home_work_19.Tests.BaseTest;
import org.testng.annotations.Test;

public class AddBikeLightToCartTest extends BaseTest {

    private final String CART_BADGE_NUMBER = "1";
    private final String BIKE_LIGHT_TITLE = "Sauce Labs Bike Light";

    @Test
    public void addBikeLightToCartPageObjectTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.fillLogin(System.getProperty("username"));
        loginPage.fillPassword(System.getProperty("password"));
        loginPage.clickLogin();
        ProductsPage productsPage = new ProductsPage();
        productsPage.bikeLightAddToCart();
        productsPage.checkBikeLightRemoveButton();
        productsPage.checkCartBadgeNumber(CART_BADGE_NUMBER);
        productsPage.goToCart();
        CartPage cartPage = new CartPage();
        cartPage.checkBikeLightTitle(BIKE_LIGHT_TITLE);
        cartPage.checkCartBadgeNumber(CART_BADGE_NUMBER);
        cartPage.checkBikeLightRemoveButton();
    }

    @Test
    public void addBikeLightToCartStepsTest() {
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.login(System.getProperty("username"), System.getProperty("password"));
        ProductsSteps productsSteps = new ProductsSteps();
        productsSteps.buyBikeLightOnly(CART_BADGE_NUMBER);
        CartSteps cartSteps = new CartSteps();
        cartSteps.checkBikeLightIsOnCart(BIKE_LIGHT_TITLE, CART_BADGE_NUMBER);
    }
}
