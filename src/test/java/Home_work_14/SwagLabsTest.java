package Home_work_14;

import org.testng.Assert;
import org.testng.annotations.Test;

import static Home_work_14.Locators.Locators.*;
import static Home_work_14.StaticParam.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SwagLabsTest extends BaseTest {

    public static String productsTitle = "Products";
    public static String cartBadgeNumber = "1";
    public static String yourCartTitle = "Your Cart";
    public static String bikeLightTitle = "Sauce Labs Bike Light";

    @Test
    public void addToCart() {
        open(SITE_URL);
        $(LOGIN_INPUT).sendKeys(USER_LOGIN);
        $(PASSWORD_INPUT).sendKeys(USER_PASSWORD);
        $(LOGIN_BUTTON).click();
        Assert.assertEquals(productsTitle, $(PRODUCT_TITLE).getText());
        $(BIKE_LIGHT_ADD_TO_CART_BUTTON).click();
        Assert.assertTrue($(BIKE_LIGHT_REMOVE_BUTTON).isDisplayed());
        Assert.assertEquals(cartBadgeNumber, $(CART_BADGE).getText());
        $(CART_LINK).click();
        Assert.assertEquals(yourCartTitle, $(CART_TITLE).getText());
        Assert.assertEquals(bikeLightTitle, $(BIKE_LIGHT_CART_TITLE).getText());
        Assert.assertEquals(cartBadgeNumber, $(CART_BADGE).getText());
        Assert.assertTrue($(BIKE_LIGHT_REMOVE_BUTTON).isDisplayed());
    }
}
