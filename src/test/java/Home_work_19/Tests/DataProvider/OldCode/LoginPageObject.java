package Home_work_19.Tests.DataProvider.OldCode;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPageObject {
    private SelenideElement emailField = $("[id='user-name']");
    private SelenideElement passwordField = $("[id='password']");
    private SelenideElement loginButton = $("[id='login-button']");
    private SelenideElement errorBox = $("[data-test='error']");
    private String url = "https://www.saucedemo.com/";

    public void openPage() {
        open(url);
    }

    public void fillLogin(String email) {
        emailField
                .shouldBe(visible)
                .sendKeys(email);
    }

    public void fillPassword(String password) {
        passwordField
                .shouldBe(visible)
                .sendKeys(password);
    }

    public void clickLogin() {
        loginButton
                .shouldBe(enabled)
                .click();
    }

    public boolean checkErrorBox() {
        return errorBox.is(visible);
    }
}
