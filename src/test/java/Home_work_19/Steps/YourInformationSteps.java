package Home_work_19.Steps;

import Home_work_19.PageObject.Pages.YourInformationCheckoutPage;

public class YourInformationSteps {
    public void fillYourInformation(String firstName, String lastName, String postalCode) {
        YourInformationCheckoutPage yourInformationCheckoutPage = new YourInformationCheckoutPage();
        yourInformationCheckoutPage.fillFirstName(firstName);
        yourInformationCheckoutPage.fillLastName(lastName);
        yourInformationCheckoutPage.fillPostalCode(postalCode);
        yourInformationCheckoutPage.clickContinue();
    }
}
