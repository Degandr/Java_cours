package Home_work_15.Steps;

import Home_work_15.PageObject.CompleteCheckoutPage;

public class CompleteCheckoutSteps {

    public void completeCheckout() {
        CompleteCheckoutPage completeCheckoutPage = new CompleteCheckoutPage();
        completeCheckoutPage.checkGratefullText();
        completeCheckoutPage.checkCartBadgeIsNotVisible();
        completeCheckoutPage.clickBackHome();
    }
}
