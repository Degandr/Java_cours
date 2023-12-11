package Home_work_19.Steps;

import Home_work_19.PageObject.Pages.CompleteCheckoutPage;

public class CompleteCheckoutSteps {

    public void completeCheckout() {
        CompleteCheckoutPage completeCheckoutPage = new CompleteCheckoutPage();
        completeCheckoutPage.checkGratefullText();
        completeCheckoutPage.checkCartBadgeIsNotVisible();
        completeCheckoutPage.clickBackHome();
    }
}
