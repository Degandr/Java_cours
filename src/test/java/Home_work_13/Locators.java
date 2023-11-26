package Home_work_13;

import org.openqa.selenium.By;

public class Locators {
    By twitterLink = By.xpath("//a[@href = \"https://twitter.com/saucelabs\"]");
    By faceBookPartLink = By.xpath("//a[contains(@href, 'facebook')]");
    By dropdownTag = By.xpath("//select");
    By nameTagButton = By.xpath("//button[@name=\"checkout\"]");
    By allAddToCartButtons = By.xpath("//button[contains(@data-test, 'add-to-cart')]");
    By secondAddToCartButton = By.xpath("(//button[contains(@data-test, 'add-to-cart')])[2]");
    By allDivElementsWithClasses = By.xpath("//div[@class=\"inventory_item_label\" or @class=\"inventory_item_img\"]");
    By buttonThroughClassAndAttribute = By.xpath("//button[contains(@class, 'btn_primary') and contains(@name, 'add-to-cart-sauce-labs-onesie')]");
    By followingSibling = By.xpath("//div[@class=\"inventory_item_price\"]/following-sibling::button");
    By precedingSibling = By.xpath("//button[text()='Add to cart']/preceding-sibling::div");
}