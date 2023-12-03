package Home_work_16.Elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class ProductsNameLinkElement {
    private String linkXpath = "//a[@id='item_%s_title_link']";
    private String identifier;
    private SelenideElement link;

    public ProductsNameLinkElement(String identifier) {
        this.identifier = identifier;
    }

    private void initElement() {
        String locator = String.format(linkXpath, identifier);
        link = $x(locator).shouldBe(visible);
    }

    public void clickLink() {
        initElement();
        link.click();
    }
}
