package Home_work_15.PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CompleteCheckoutPage {
    private SelenideElement gratefullText = $x("//h2[contains(text(), 'Thank you for your order!')]");
    private SelenideElement backHomeButton = $("[id='back-to-products']");
    private SelenideElement cartBadge = $("[class='shopping_cart_badge']");

    public boolean checkGratefullText() {
        return gratefullText.isDisplayed();
    }
    public boolean checkCartBadgeIsNotVisible() {
        return cartBadge.is(not(visible));
    }
    public void clickBackHome() {
        backHomeButton
                .shouldBe(enabled)
                .click();
    }
}
