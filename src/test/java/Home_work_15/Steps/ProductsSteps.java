package Home_work_15.Steps;

import Home_work_15.PageObject.LoginPage;
import Home_work_15.PageObject.ProductsPage;

import java.util.ArrayList;

public class ProductsSteps {
    public void buyBikeLightOnly(String badge) {
        ProductsPage productsPage = new ProductsPage();
        productsPage.bikeLightAddToCart();
        productsPage.checkBikeLightRemoveButton();
        productsPage.checkCartBadgeNumber(badge);
        productsPage.goToCart();
    }
    public void buyBackpackOnly(String badge) {
        ProductsPage productsPage = new ProductsPage();
        productsPage.backpackAddToCart();
        productsPage.checkBackpackRemoveButton();
        productsPage.checkCartBadgeNumber(badge);
        productsPage.goToCart();
    }
    public void lowToHighSortingSelection() {
        ProductsPage productsPage = new ProductsPage();
        productsPage.sortingDropdownOpening();
        productsPage.lowToHighSortingSelection();
    }
    public boolean lowToHighSortingPriceCheck(ArrayList<String> arrayPriceCurrent, ArrayList<String> arrayPriceLowToHigh) {
        ProductsPage productsPage = new ProductsPage();
        arrayPriceCurrent = productsPage.priceSequenceCurrent();
        arrayPriceLowToHigh = productsPage.priceSequenceLowToHigh();
        return arrayPriceCurrent.equals(arrayPriceLowToHigh);
    }
    public void highToLowSortingSelection() {
        ProductsPage productsPage = new ProductsPage();
        productsPage.sortingDropdownOpening();
        productsPage.highToLowSortingSelection();
    }
    public boolean highToLowSortingCheck(ArrayList<String> arrayPriceCurrent, ArrayList<String> arrayPriceHighToLow) {
        ProductsPage productsPage = new ProductsPage();
        arrayPriceCurrent = productsPage.priceSequenceCurrent();
        arrayPriceHighToLow = productsPage.priceSequenceLowToHigh();
        return arrayPriceCurrent.equals(arrayPriceHighToLow);
    }
    public void logout() {
        ProductsPage productsPage = new ProductsPage();
        productsPage.burgerMenuOpen();
        productsPage.logoutButtonClick();
        LoginPage loginPage = new LoginPage();
        loginPage.checkBoxWithCredentials();
    }
}
