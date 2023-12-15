package Home_work_20.Steps;

import Home_work_20.PageObject.Pages.OverviewCheckoutPage;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class OverviewCheckoutSteps {
    public void overviewCheckoutBackpackItem() {
        OverviewCheckoutPage overviewCheckoutPage = new OverviewCheckoutPage();
        overviewCheckoutPage.checkBackpackTitle();
        overviewCheckoutPage.clickFinish();
        log.info("Method '{}' was executed successfully", new Object(){}.getClass().getEnclosingMethod().getName());
    }
}
