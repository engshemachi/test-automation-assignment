package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AllProductsPage extends BasePage {

    public AllProductsPage(WebDriver driver) {
        super(driver);
    }

    //Locators
    private By allProductsIcon = By.cssSelector("h2[class=\"title text-center\"]");
    private By searchField = By.id("search_product");
    private By submitSearchBtn = By.id("submit_search");
    private By searchedProductsIcon = By.cssSelector("h2[class=\"title text-center\"]");
    private By searchedProductsTitles = By.cssSelector(".productinfo p");
    private By addFirstElementToCartBtn = By.xpath("(//a[contains(@class,\"add-to-cart\")])[1]");
    private By addSecondElementToCartBtn = By.xpath("(//a[contains(@class,\"add-to-cart\")])[3]");
    private By continueShoppingBtn = By.xpath("//button[contains(@class,\"btn-success\")]");
    private By viewCartBtn = By.xpath("(//a[@href=\"/view_cart\"])[2]");

    //Operations
    public boolean checkAllProductsPageDisplayed() {
        return isElementDisplayed(allProductsIcon);
    }

    public void typeInSearchField(String text) {
        typeTextInField(searchField, text);
        clickOnElement(submitSearchBtn);
    }

    public boolean checkSearchedProductsDisplayed() {
        return isElementDisplayed(searchedProductsIcon);
    }

    public boolean checkOnSearchResults(String searchedKeyWord) {

        List<WebElement> productsTitles = locateElements(searchedProductsTitles);
        int numberOfSearchedItems = productsTitles.size();

        for (int i = 0; i < numberOfSearchedItems; i++) {
            String searchedProductName = productsTitles.get(i).getText();
            if (searchedProductName.contains(searchedKeyWord)) {
                return true;
                //break;
            }
        }
        return false;
    }

    public void hoverAndClickOnAddToCart() {
        hoverAndClickOnElements(addFirstElementToCartBtn);
        modalActionsToClick(continueShoppingBtn);
        hoverAndClickOnElements(addSecondElementToCartBtn);
        modalActionsToClick(viewCartBtn);
    }

}
