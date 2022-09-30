package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewCartPage extends BasePage {
    public ViewCartPage(WebDriver driver) {
        super(driver);
    }

    //Locators
    private By firstItemInCart = By.id("product-1");
    private By secondItemInCart = By.id("product-2");
    private By firstItemPrice = By.xpath("(//td[@class=\"cart_price\"]/p)[1]");
    private By secondItemPrice = By.xpath("(//td[@class=\"cart_price\"]/p)[2]");
    private By itemsTotalPrice = By.className("cart_total_price");
    private By itemsQuantity = By.cssSelector("button.disabled");

    //Operations

    public boolean checkFirstItemAddedToCart() {

        return isElementDisplayed(firstItemInCart);
    }

    public boolean checkSecondItemAddedToCart() {
        return isElementDisplayed(secondItemInCart);

    }

    public String getFirstItemPrice() {
        return getTextOfWebElement(firstItemPrice);
    }

    public String getSecondItemPrice() {
        return getTextOfWebElement(secondItemPrice);
    }

    public String getFirstItemQuantity() {
        return getTextOfElementInArray(itemsQuantity,0);
    }

    public String getSecondItemQuantity() {
        return getTextOfElementInArray(itemsQuantity,1);
    }

    public String getFirstItemTotalPrice() {
        return getTextOfElementInArray(itemsTotalPrice,0);
    }

    public String getSecondItemTotalPrice() {
        return getTextOfElementInArray(itemsTotalPrice,1);
    }
}
