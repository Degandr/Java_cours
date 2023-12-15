package Home_work_20.PageObject.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CartPage {
    private SelenideElement bikeLightTitle = $x("//div[contains(text(), 'Sauce Labs Bike Light')]");
    private SelenideElement backpackTitle = $x("//div[contains(text(), 'Sauce Labs Backpack')]");
    private SelenideElement cartBadge = $("[class='shopping_cart_badge']");
    private SelenideElement bikeLightRemoveButton = $("[id='remove-sauce-labs-bike-light']");
    private SelenideElement backpackRemoveButton = $("[id='remove-sauce-labs-backpack']");
    private SelenideElement checkoutButton = $("[id='checkout']");

    public boolean checkBikeLightTitle(String str) {
        return bikeLightTitle.getText().equals(str);
    }

    public boolean checkBackpackTitle(String str) {
        return backpackTitle.getText().equals(str);
    }

    public boolean checkCartBadgeNumber(String num) {
        return cartBadge.getText().equals(num);
    }

    public boolean checkBikeLightRemoveButton() {
        return bikeLightRemoveButton.isEnabled();
    }

    public boolean checkBackpackRemoveButton() {
        return backpackRemoveButton.isEnabled();
    }

    public void clickCheckout() {
        checkoutButton
                .shouldBe(enabled)
                .click();
    }

    public void clickRemoveButtonForBikeLight() {
        bikeLightRemoveButton
                .shouldBe(enabled)
                .click();
    }

    public boolean checkBikeLightTitleIsNotVisible() {
        return bikeLightTitle.is(not(visible));
    }

    public boolean checkCartBadgeIsNotVisible() {
        return cartBadge.is(not(visible));
    }
}
