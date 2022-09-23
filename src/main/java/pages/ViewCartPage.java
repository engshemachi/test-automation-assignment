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
    private By firstItemPrice = By.xpath("(//tr/td/p)[2]");
    private By secondItemPrice = By.xpath("(//tr/td/p)[5]");
    private By firstItemQuantity = By.xpath("(//button[@class=\"disabled\"])[1]");
    private By secondItemQuantity = By.xpath("(//button[@class=\"disabled\"])[2]");
    private By firstItemTotalPrice = By.xpath("(//tr/td/p)[3]");
    private By secondItemTotalPrice = By.xpath("(//tr/td/p)[6]");


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
        return getTextOfWebElement(firstItemQuantity);
    }

    public String getSecondItemQuantity() {
        return getTextOfWebElement(secondItemQuantity);
    }

    public String getFirstItemTotalPrice() {
        return getTextOfWebElement(firstItemTotalPrice);
    }

    public String getSecondItemTotalPrice() {
        return getTextOfWebElement(secondItemTotalPrice);
    }
}
