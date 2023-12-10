package Home_work_19.Steps;

import Home_work_19.PageObject.Pages.OverviewCheckoutPage;

public class OverviewCheckoutPriceSteps {
    private String backpackPrice;
    private String finalPrice;

    public boolean overviewCheckoutBackpackItemPrice() {
        OverviewCheckoutPage overviewCheckoutPage = new OverviewCheckoutPage();
        backpackPrice = overviewCheckoutPage.getBackpackPrice();
        finalPrice = overviewCheckoutPage.getFinalPrice();
        return finalPrice.substring(12).equals(backpackPrice);
    }
}
