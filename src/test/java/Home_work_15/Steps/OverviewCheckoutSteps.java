package Home_work_15.Steps;

import Home_work_15.PageObject.Pages.OverviewCheckoutPage;

public class OverviewCheckoutSteps {
    public void overviewCheckoutBackpackItem() {
        OverviewCheckoutPage overviewCheckoutPage = new OverviewCheckoutPage();
        overviewCheckoutPage.checkBackpackTitle();
        overviewCheckoutPage.clickFinish();
    }
}
