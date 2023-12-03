package Home_work_15.Steps;

import Home_work_15.PageObject.OverviewCheckoutPage;

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
