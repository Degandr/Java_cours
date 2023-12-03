package Home_work_15.Tests.Autotests;

import Home_work_15.PageObject.Pages.LoginPage;
import Home_work_15.PageObject.Pages.ProductsPage;
import Home_work_15.Steps.LoginSteps;
import Home_work_15.Steps.ProductsSteps;
import Home_work_15.Tests.BaseTest;
import Home_work_15.Tests.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class PriceSortingTest extends BaseTest {
    private ArrayList<String> arrayPriceCurrent;
    private ArrayList<String> arrayPriceLowToHigh;
    private ArrayList<String> arrayPriceHighToLow;

    @Test
    public void priceSortingPageObject() {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.fillLogin(Credentials.USER_LOGIN);
        loginPage.fillPassword(Credentials.USER_PASSWORD);
        loginPage.clickLogin();
        ProductsPage productsPage = new ProductsPage();
        productsPage.sortingDropdownOpening();
        productsPage.lowToHighSortingSelection();
        arrayPriceCurrent = productsPage.priceSequenceCurrent();
        arrayPriceLowToHigh = productsPage.priceSequenceLowToHigh();
        Assert.assertEquals(arrayPriceCurrent, arrayPriceLowToHigh);
        productsPage.sortingDropdownOpening();
        productsPage.highToLowSortingSelection();
        arrayPriceCurrent = productsPage.priceSequenceCurrent();
        arrayPriceHighToLow = productsPage.priceSequenceHighToLow();
        Assert.assertEquals(arrayPriceCurrent, arrayPriceHighToLow);
    }

    @Test
    public void priceSortingSteps() {
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.login(Credentials.USER_LOGIN, Credentials.USER_PASSWORD);
        ProductsSteps productsSteps = new ProductsSteps();
        productsSteps.lowToHighSortingSelection();
        productsSteps.lowToHighSortingPriceCheck(arrayPriceCurrent, arrayPriceLowToHigh);
        productsSteps.highToLowSortingSelection();
        productsSteps.highToLowSortingCheck(arrayPriceCurrent, arrayPriceHighToLow);
    }
}
