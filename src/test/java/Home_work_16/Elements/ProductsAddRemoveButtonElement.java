package Home_work_16.Elements;

import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;

public class ProductsAddRemoveButtonElement {
    private String addButtonCss = "[id='add-to-cart-sauce-labs-%s']";
    private String removeButtonCss = "[id='remove-sauce-labs-%s']";
    private String identifier;
    private SelenideElement addButton;
    private SelenideElement removeButton;

    public ProductsAddRemoveButtonElement(String identifier) {
        this.identifier = identifier;
    }

    private void initAddButtonElement() {
        String locator = String.format(addButtonCss, identifier);
        addButton = $x(locator).shouldBe(visible);
    }

    private void initRemoveButtonElement() {
        String locator = String.format(removeButtonCss, identifier);
        removeButton = $x(locator).shouldBe(visible);
    }

    private void simpleAddClick() {
        initAddButtonElement();
        addButton.click();
    }

    private void simpleRemoveClick() {
        initRemoveButtonElement();
        removeButton.click();
    }

    public void addButtonClickWithCheck() {
        initRemoveButtonElement();
        if (!removeButton.isDisplayed()) {
            simpleAddClick();
        } else {
            Assert.fail("Can't add to cart because product is already on cart!");
        }
    }

    public void removeButtonClickWithCheck() {
        initAddButtonElement();
        if (!addButton.isDisplayed()) {
            simpleRemoveClick();
        } else {
            Assert.fail("Can't remove from cart because product isn't there!");
        }
    }
}
