package Home_work_19.Tests.Autotests;

import Home_work_19.PageObject.Pages.LoginPage;
import Home_work_19.PageObject.Pages.ProductsPage;
import Home_work_19.Steps.LoginSteps;
import Home_work_19.Steps.ProductsSteps;
import Home_work_19.Tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class PriceSortingTest extends BaseTest {
    private ArrayList<String> arrayPriceCurrent;
    private ArrayList<String> arrayPriceLowToHigh;
    private ArrayList<String> arrayPriceHighToLow;

    @Test
    public void priceSortingPageObjectTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.fillLogin(System.getProperty("username"));
        loginPage.fillPassword(System.getProperty("password"));
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
    public void priceSortingStepsTest() {
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.login(System.getProperty("username"), System.getProperty("password"));
        ProductsSteps productsSteps = new ProductsSteps();
        productsSteps.lowToHighSortingSelection();
        productsSteps.lowToHighSortingPriceCheck(arrayPriceCurrent, arrayPriceLowToHigh);
        productsSteps.highToLowSortingSelection();
        productsSteps.highToLowSortingCheck(arrayPriceCurrent, arrayPriceHighToLow);
    }
}
