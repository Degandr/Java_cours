package Home_work_20.Steps;

import Home_work_20.PageObject.Pages.OverviewCheckoutPage;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class OverviewCheckoutPriceSteps {
    private String backpackPrice;
    private String finalPrice;

    public boolean overviewCheckoutBackpackItemPrice() {
        OverviewCheckoutPage overviewCheckoutPage = new OverviewCheckoutPage();
        backpackPrice = overviewCheckoutPage.getBackpackPrice();
        finalPrice = overviewCheckoutPage.getFinalPrice();
        log.info("Method '{}' was executed successfully", new Object(){}.getClass().getEnclosingMethod().getName());
        return finalPrice.substring(12).equals(backpackPrice);
    }
}
