package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AllProductsPage;
import pages.HomePage;
import pages.NavigationBarPage;

public class SearchResultsTests extends BaseTests {

    @Test
    public void testAllSearchedItemsDisplayed () {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isHomePageDispalyed());
        NavigationBarPage navigationBarPage = new NavigationBarPage(driver);
        AllProductsPage allProductsPage = navigationBarPage.clickOnProductsBtn();
        allProductsPage.typeInSearchField("Sleeves");
        Assert.assertTrue(allProductsPage.checkOnSearchResults("Sleeves"));
    }
}
