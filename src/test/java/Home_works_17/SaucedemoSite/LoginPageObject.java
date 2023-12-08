package Home_works_17.SaucedemoSite;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPageObject {
    private SelenideElement emailField = $("[id='user-name']");
    private SelenideElement passwordField = $("[id='password']");

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
}
