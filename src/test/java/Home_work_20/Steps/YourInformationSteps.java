package Home_work_20.Steps;

import Home_work_20.PageObject.Pages.YourInformationCheckoutPage;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class YourInformationSteps {
    public void fillYourInformation(String firstName, String lastName, String postalCode) {
        YourInformationCheckoutPage yourInformationCheckoutPage = new YourInformationCheckoutPage();
        yourInformationCheckoutPage.fillFirstName(firstName);
        yourInformationCheckoutPage.fillLastName(lastName);
        yourInformationCheckoutPage.fillPostalCode(postalCode);
        yourInformationCheckoutPage.clickContinue();
        log.info("Method '{}' was executed successfully", new Object(){}.getClass().getEnclosingMethod().getName());
    }
}
