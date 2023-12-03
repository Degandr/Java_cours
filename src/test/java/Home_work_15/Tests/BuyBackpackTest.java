package Home_work_15.Tests;

import Home_work_14.BaseTest;
import Home_work_15.PageObject.*;
import Home_work_15.Steps.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyBackpackTest extends BaseTest {
    private String backpackPrice;
    private String finalPrice;
    private final String CART_BADGE_NUMBER = "1";
    private final String BACKPACK_TITLE = "Sauce Labs Backpack";
    private final String FIRST_NAME = "Andrew";
    private final String LAST_NAME = "Test";
    private final String POSTAL_CODE = "12345";

    @Test
    public void buyBackpackPageObject() {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.fillLogin(Credentials.USER_LOGIN);
        loginPage.fillPassword(Credentials.USER_PASSWORD);
        loginPage.clickLogin();
        ProductsPage productsPage = new ProductsPage();
        productsPage.backpackAddToCart();
        productsPage.checkBackpackRemoveButton();
        productsPage.checkCartBadgeNumber(CART_BADGE_NUMBER);
        productsPage.goToCart();
        CartPage cartPage = new CartPage();
        cartPage.checkBackpackTitle(BACKPACK_TITLE);
        cartPage.checkCartBadgeNumber(CART_BADGE_NUMBER);
        cartPage.checkBackpackRemoveButton();
        cartPage.clickCheckout();
        YourInformationCheckoutPage yourInformationCheckoutPage = new YourInformationCheckoutPage();
        yourInformationCheckoutPage.fillFirstName(FIRST_NAME);
        yourInformationCheckoutPage.fillLastName(LAST_NAME);
        yourInformationCheckoutPage.fillPostalCode(POSTAL_CODE);
        yourInformationCheckoutPage.clickContinue();
        OverviewCheckoutPage overviewCheckoutPage = new OverviewCheckoutPage();
        overviewCheckoutPage.checkBackpackTitle();
        backpackPrice = overviewCheckoutPage.getBackpackPrice();
        finalPrice = overviewCheckoutPage.getFinalPrice();
        Assert.assertEquals(backpackPrice, finalPrice.substring(12));
        overviewCheckoutPage.clickFinish();
        CompleteCheckoutPage completeCheckoutPage = new CompleteCheckoutPage();
        completeCheckoutPage.checkGratefullText();
        completeCheckoutPage.checkCartBadgeIsNotVisible();
        completeCheckoutPage.clickBackHome();
    }
    @Test
    public void buyBackpackSteps() {
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.login(Credentials.USER_LOGIN, Credentials.USER_PASSWORD);
        ProductsSteps productsSteps = new ProductsSteps();
        productsSteps.buyBackpackOnly(CART_BADGE_NUMBER);
        CartSteps cartSteps = new CartSteps();
        cartSteps.checkBackpackIsOnCart(BACKPACK_TITLE, CART_BADGE_NUMBER);
        YourInformationSteps yourInformationSteps = new YourInformationSteps();
        yourInformationSteps.fillYourInformation(FIRST_NAME, LAST_NAME, POSTAL_CODE);
        OverviewCheckoutPriceSteps overviewCheckoutPriceSteps = new OverviewCheckoutPriceSteps();
        overviewCheckoutPriceSteps.overviewCheckoutBackpackItemPrice();
        OverviewCheckoutSteps overviewCheckoutSteps = new OverviewCheckoutSteps();
        overviewCheckoutSteps.overviewCheckoutBackpackItem();
        CompleteCheckoutSteps completeCheckoutSteps = new CompleteCheckoutSteps();
        completeCheckoutSteps.completeCheckout();
    }
}
