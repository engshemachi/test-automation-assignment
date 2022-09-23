package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AllProductsPage;
import pages.HomePage;
import pages.NavigationBarPage;


public class ProductsTests extends BaseTests {

    @Test
    public void testAllProductsPageVisible () {

        NavigationBarPage navigationBarPage = new NavigationBarPage(driver);
        AllProductsPage allProductsPage = navigationBarPage.clickOnProductsBtn();
        Assert.assertTrue(allProductsPage.checkAllProductsPageDisplayed());
    }

}
