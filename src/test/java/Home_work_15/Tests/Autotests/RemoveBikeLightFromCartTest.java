package Home_work_15.Tests.Autotests;

import Home_work_15.PageObject.Pages.CartPage;
import Home_work_15.PageObject.Pages.LoginPage;
import Home_work_15.PageObject.Pages.ProductsPage;
import Home_work_15.Steps.CartSteps;
import Home_work_15.Steps.LoginSteps;
import Home_work_15.Steps.ProductsSteps;
import Home_work_15.Tests.BaseTest;
import Home_work_15.Tests.Credentials;
import org.testng.annotations.Test;

public class RemoveBikeLightFromCartTest extends BaseTest {
    private final String CART_BADGE_NUMBER = "1";

    @Test
    public void removeBikeLightFromCartPageObject() {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.fillLogin(Credentials.USER_LOGIN);
        loginPage.fillPassword(Credentials.USER_PASSWORD);
        loginPage.clickLogin();
        ProductsPage productsPage = new ProductsPage();
        productsPage.bikeLightAddToCart();
        productsPage.checkBikeLightRemoveButton();
        productsPage.checkCartBadgeNumber(CART_BADGE_NUMBER);
        productsPage.goToCart();
        CartPage cartPage = new CartPage();
        cartPage.clickRemoveButtonForBikeLight();
        cartPage.checkCartBadgeIsNotVisible();
        cartPage.checkBikeLightTitleIsNotVisible();
    }

    @Test
    public void removeBikeLightFromCartSteps() {
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.login(Credentials.USER_LOGIN, Credentials.USER_PASSWORD);
        ProductsSteps productsSteps = new ProductsSteps();
        productsSteps.buyBikeLightOnly(CART_BADGE_NUMBER);
        CartSteps cartSteps = new CartSteps();
        cartSteps.removeBikeLightFromCart();
    }
}
