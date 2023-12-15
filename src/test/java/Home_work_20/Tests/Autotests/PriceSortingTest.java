package Home_work_20.Tests.Autotests;

import Home_work_20.PageObject.Pages.LoginPage;
import Home_work_20.PageObject.Pages.ProductsPage;
import Home_work_20.Steps.LoginSteps;
import Home_work_20.Steps.ProductsSteps;
import Home_work_20.Tests.BaseTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Description;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
@Log4j2
public class PriceSortingTest extends BaseTest {
    private ArrayList<String> arrayPriceCurrent;
    private ArrayList<String> arrayPriceLowToHigh;
    private ArrayList<String> arrayPriceHighToLow;

    @Test
    @Description("Check price sorting functionality using Page Object")
    @Severity(SeverityLevel.NORMAL)
    public void priceSortingPageObjectTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.fillLogin(System.getProperty("username"));
        loginPage.fillPassword(System.getProperty("password"));
        loginPage.clickLogin();
        log.info("Login was successful");
        ProductsPage productsPage = new ProductsPage();
        productsPage.sortingDropdownOpening();
        productsPage.lowToHighSortingSelection();
        arrayPriceCurrent = productsPage.priceSequenceCurrent();
        arrayPriceLowToHigh = productsPage.priceSequenceLowToHigh();
        Assert.assertEquals(arrayPriceCurrent, arrayPriceLowToHigh);
        log.info("Low to High sorting was successful");
        productsPage.sortingDropdownOpening();
        productsPage.highToLowSortingSelection();
        arrayPriceCurrent = productsPage.priceSequenceCurrent();
        arrayPriceHighToLow = productsPage.priceSequenceHighToLow();
        Assert.assertEquals(arrayPriceCurrent, arrayPriceHighToLow);
        log.info("High to Low sorting was successful");
    }

    @Test
    @Description("Check price sorting functionality using Steps")
    @Severity(SeverityLevel.NORMAL)
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
