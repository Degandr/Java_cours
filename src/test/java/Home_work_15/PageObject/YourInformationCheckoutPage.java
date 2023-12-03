package Home_work_15.PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class YourInformationCheckoutPage {
    private SelenideElement firstNameInput = $("[id='first-name']");
    private SelenideElement lastNameInput = $("[id='last-name']");
    private SelenideElement postalCodeInput = $("[id='postal-code']");
    private SelenideElement continueButton = $("[id='continue']");

    public void fillFirstName(String firstName) {
        firstNameInput
                .shouldBe(visible)
                .sendKeys(firstName);
    }
    public void fillLastName(String lastName) {
        lastNameInput
                .shouldBe(visible)
                .sendKeys(lastName);
    }
    public void fillPostalCode(String postalCode) {
        postalCodeInput
                .shouldBe(visible)
                .sendKeys(postalCode);
    }
    public void clickContinue() {
        continueButton
                .shouldBe(enabled)
                .click();
    }
}
