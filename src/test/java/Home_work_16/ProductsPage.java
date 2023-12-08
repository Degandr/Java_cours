package Home_work_16;

import Home_work_16.Elements.ProductsAddRemoveButtonElement;
import Home_work_16.Elements.ProductsNameLinkElement;
import org.testng.annotations.Test;


public class ProductsPage {

    @Test
    public void clickSpecificLinkTest() {
        new ProductsNameLinkElement("3").clickLink();
        new ProductsAddRemoveButtonElement("bike-light").addButtonClickWithCheck();
        new ProductsAddRemoveButtonElement("fleece-jacket").removeButtonClickWithCheck();
    }
}
