package Home_work_20.Steps;

import Home_work_20.PageObject.Pages.CompleteCheckoutPage;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class CompleteCheckoutSteps {

    public void completeCheckout() {
        CompleteCheckoutPage completeCheckoutPage = new CompleteCheckoutPage();
        completeCheckoutPage.checkGratefullText();
        completeCheckoutPage.checkCartBadgeIsNotVisible();
        completeCheckoutPage.clickBackHome();
        log.info("Method '{}' was executed successfully", new Object(){}.getClass().getEnclosingMethod().getName());
    }
}
