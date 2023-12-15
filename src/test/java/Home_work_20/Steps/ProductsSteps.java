package Home_work_20.Steps;

import Home_work_20.PageObject.Pages.LoginPage;
import Home_work_20.PageObject.Pages.ProductsPage;
import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
@Log4j2
public class ProductsSteps {
    public void buyBikeLightOnly(String badge) {
        ProductsPage productsPage = new ProductsPage();
        productsPage.bikeLightAddToCart();
        productsPage.checkBikeLightRemoveButton();
        productsPage.checkCartBadgeNumber(badge);
        productsPage.goToCart();
        log.info("Method '{}' was executed successfully", new Object(){}.getClass().getEnclosingMethod().getName());
    }

    public void buyBackpackOnly(String badge) {
        ProductsPage productsPage = new ProductsPage();
        productsPage.backpackAddToCart();
        productsPage.checkBackpackRemoveButton();
        productsPage.checkCartBadgeNumber(badge);
        productsPage.goToCart();
        log.info("Method '{}' was executed successfully", new Object(){}.getClass().getEnclosingMethod().getName());
    }

    public void lowToHighSortingSelection() {
        ProductsPage productsPage = new ProductsPage();
        productsPage.sortingDropdownOpening();
        productsPage.lowToHighSortingSelection();
        log.info("Method '{}' was executed successfully", new Object(){}.getClass().getEnclosingMethod().getName());
    }

    public boolean lowToHighSortingPriceCheck(ArrayList<String> arrayPriceCurrent, ArrayList<String> arrayPriceLowToHigh) {
        ProductsPage productsPage = new ProductsPage();
        arrayPriceCurrent = productsPage.priceSequenceCurrent();
        arrayPriceLowToHigh = productsPage.priceSequenceLowToHigh();
        log.info("Method '{}' was executed successfully", new Object(){}.getClass().getEnclosingMethod().getName());
        return arrayPriceCurrent.equals(arrayPriceLowToHigh);
    }

    public void highToLowSortingSelection() {
        ProductsPage productsPage = new ProductsPage();
        productsPage.sortingDropdownOpening();
        productsPage.highToLowSortingSelection();
        log.info("Method '{}' was executed successfully", new Object(){}.getClass().getEnclosingMethod().getName());
    }

    public boolean highToLowSortingCheck(ArrayList<String> arrayPriceCurrent, ArrayList<String> arrayPriceHighToLow) {
        ProductsPage productsPage = new ProductsPage();
        arrayPriceCurrent = productsPage.priceSequenceCurrent();
        arrayPriceHighToLow = productsPage.priceSequenceLowToHigh();
        log.info("Method '{}' was executed successfully", new Object(){}.getClass().getEnclosingMethod().getName());
        return arrayPriceCurrent.equals(arrayPriceHighToLow);
    }

    public void logout() {
        ProductsPage productsPage = new ProductsPage();
        productsPage.burgerMenuOpen();
        productsPage.logoutButtonClick();
        LoginPage loginPage = new LoginPage();
        loginPage.checkBoxWithCredentials();
        log.info("Method '{}' was executed successfully", new Object(){}.getClass().getEnclosingMethod().getName());
    }
}
