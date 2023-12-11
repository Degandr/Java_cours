package Home_work_19.PageObject.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class OverviewCheckoutPage {
    private SelenideElement backpackTitle = $x("//div[contains(text(), 'Sauce Labs Backpack')]");
    private SelenideElement backpackPrice = $x("//div[@class='item_pricebar']/div");
    private SelenideElement priceTotal = $("[class='summary_subtotal_label']");
    private SelenideElement finishButton = $("[id='finish']");

    public boolean checkBackpackTitle() {
        return backpackTitle.isDisplayed();
    }

    public String getFinalPrice() {
        return priceTotal.getText();
    }

    public String getBackpackPrice() {
        return backpackPrice.getText();
    }

    public void clickFinish() {
        finishButton
                .shouldBe(enabled)
                .click();
    }
}
