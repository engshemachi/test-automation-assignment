package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    //WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
    }
    //Locators

    private By homePageSlider = By.id("slider-carousel");

    //Operations

    //Check Home page is displayed by checking visibility of home page slider
    public boolean isHomePageDispalyed (){

        return isElementDisplayed(homePageSlider);
    }

}
