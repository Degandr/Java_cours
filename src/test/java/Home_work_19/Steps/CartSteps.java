package Home_work_19.Steps;

import Home_work_19.PageObject.Pages.CartPage;

public class CartSteps {
    public void checkBikeLightIsOnCart(String bikeLightTitle, String badge) {
        CartPage cartPage = new CartPage();
        cartPage.checkBikeLightTitle(bikeLightTitle);
        cartPage.checkCartBadgeNumber(badge);
        cartPage.checkBikeLightRemoveButton();
    }

    public void removeBikeLightFromCart() {
        CartPage cartPage = new CartPage();
        cartPage.clickRemoveButtonForBikeLight();
        cartPage.checkCartBadgeIsNotVisible();
        cartPage.checkBikeLightTitleIsNotVisible();
    }

    public void checkBackpackIsOnCart(String backpackTitle, String badge) {
        CartPage cartPage = new CartPage();
        cartPage.checkBackpackTitle(backpackTitle);
        cartPage.checkCartBadgeNumber(badge);
        cartPage.checkBackpackRemoveButton();
        cartPage.clickCheckout();
    }
}
