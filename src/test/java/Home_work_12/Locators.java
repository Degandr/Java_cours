package Home_work_12;

import org.openqa.selenium.By;

public class Locators {
    By xLink = By.linkText("Twitter");
    By faceBookLink = By.partialLinkText("Face");
    By sortingDropdown = By.tagName("select");
    By productsText = By.className("title");
    By checkoutButton = By.name("checkout");
    By addBackpackButton = By.id("add-to-cart-sauce-labs-backpack");
    By allElements = By.cssSelector("*");
    By addToCartButton = By.cssSelector("[id^='add-to-cart']");
    By allButtonsInHeaderButton = By.cssSelector("[id='header_container'] > div [class$='button']");
    By productsNameText = By.cssSelector(".inventory_item");
    By addToCartButtons = By.cssSelector("[data-test^='add-to-cart']");
}
