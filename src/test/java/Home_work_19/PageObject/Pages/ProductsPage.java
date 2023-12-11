package Home_work_19.PageObject.Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$x;

public class ProductsPage {
    private SelenideElement bikeLightAddButton = $("[id='add-to-cart-sauce-labs-bike-light']");
    private SelenideElement bikeLightRemoveButton = $("[id='remove-sauce-labs-bike-light']");
    private SelenideElement backpackAddToCart = $("[id='add-to-cart-sauce-labs-backpack']");
    private SelenideElement backpackRemoveButton = $("[id='remove-sauce-labs-backpack']");
    private SelenideElement cartLink = $("[class='shopping_cart_link']");
    private SelenideElement cartBadge = $("[class='shopping_cart_badge']");
    private SelenideElement dropdownSorting = $("[data-test='product_sort_container']");
    private SelenideElement lowToHighSorting = $("[value='lohi']");
    private SelenideElement highToLowSorting = $("[value='hilo']");
    private SelenideElement burgerMenu = $("[id='react-burger-menu-btn']");
    private SelenideElement logoutButton = $("[id='logout_sidebar_link']");
    private ElementsCollection prices = $$x("//div[@class='inventory_item_price']");

    public void bikeLightAddToCart() {
        bikeLightAddButton
                .shouldBe(enabled)
                .click();
    }

    public void backpackAddToCart() {
        backpackAddToCart
                .shouldBe(enabled)
                .click();
    }

    public boolean checkBikeLightRemoveButton() {
        return bikeLightRemoveButton.isEnabled();
    }

    public boolean checkBackpackRemoveButton() {
        return backpackRemoveButton.isEnabled();
    }

    public void goToCart() {
        cartLink
                .shouldBe(exist)
                .click();
    }

    public boolean checkCartBadgeNumber(String num) {
        return cartBadge.getText().equals(num);
    }

    public ArrayList<String> priceSequenceCurrent() {
        ArrayList<String> arr = new ArrayList<>();
        for (SelenideElement price : prices) {
            arr.add(price.getText().substring(1));
        }
        return arr;
    }

    public void sortingDropdownOpening() {
        dropdownSorting
                .shouldBe(visible)
                .click();
    }

    public void lowToHighSortingSelection() {
        lowToHighSorting.click();
    }

    public ArrayList<String> priceSequenceLowToHigh() {
        ArrayList<String> arr = priceSequenceCurrent();
        arr.sort((price1, price2) -> {
            double doublePrice1 = Double.parseDouble(price1);
            double doublePrice2 = Double.parseDouble(price2);
            return Double.compare(doublePrice1, doublePrice2);
        });
        return arr;
    }

    public void highToLowSortingSelection() {
        highToLowSorting.click();
    }

    public ArrayList<String> priceSequenceHighToLow() {
        ArrayList<String> arr = priceSequenceCurrent();
        arr.sort((price1, price2) -> {
            double doublePrice1 = Double.parseDouble(price1);
            double doublePrice2 = Double.parseDouble(price2);
            return Double.compare(doublePrice2, doublePrice1);
        });
        return arr;
    }

    public void burgerMenuOpen() {
        burgerMenu
                .shouldBe(enabled)
                .click();
    }

    public void logoutButtonClick() {
        logoutButton
                .shouldBe(enabled)
                .click();
    }
}
