package Home_work_20.Steps;

import Home_work_20.PageObject.Pages.CartPage;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class CartSteps {
    public void checkBikeLightIsOnCart(String bikeLightTitle, String badge) {
        CartPage cartPage = new CartPage();
        cartPage.checkBikeLightTitle(bikeLightTitle);
        cartPage.checkCartBadgeNumber(badge);
        cartPage.checkBikeLightRemoveButton();
        log.info("Method '{}' was executed successfully", new Object(){}.getClass().getEnclosingMethod().getName());
    }

    public void removeBikeLightFromCart() {
        CartPage cartPage = new CartPage();
        cartPage.clickRemoveButtonForBikeLight();
        cartPage.checkCartBadgeIsNotVisible();
        cartPage.checkBikeLightTitleIsNotVisible();
        log.info("Method '{}' was executed successfully", new Object(){}.getClass().getEnclosingMethod().getName());
    }

    public void checkBackpackIsOnCart(String backpackTitle, String badge) {
        CartPage cartPage = new CartPage();
        cartPage.checkBackpackTitle(backpackTitle);
        cartPage.checkCartBadgeNumber(badge);
        cartPage.checkBackpackRemoveButton();
        cartPage.clickCheckout();
        log.info("Method '{}' was executed successfully", new Object(){}.getClass().getEnclosingMethod().getName());
    }
}
