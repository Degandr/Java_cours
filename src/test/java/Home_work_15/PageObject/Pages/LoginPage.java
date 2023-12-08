package Home_work_15.PageObject.Pages;

import Home_work_15.PageObject.StartPageUrl;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    private SelenideElement emailField = $("[id='user-name']");
    private SelenideElement passwordField = $("[id='password']");
    private SelenideElement loginButton = $("[id='login-button']");
    private SelenideElement boxWithCredentials = $("[class='login_credentials_wrap-inner']");

    public void openPage() {
        open(StartPageUrl.SITE_URL);
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

    public void checkBoxWithCredentials() {
        boxWithCredentials.shouldBe(visible);
    }
}
