package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AllProductsPage;
import pages.HomePage;
import pages.NavigationBarPage;
import pages.ViewCartPage;

public class AddToCartTests extends BaseTests {
    NavigationBarPage navigationBarPage;
    AllProductsPage allProductsPage;
    ViewCartPage viewCartPage;

    HomePage homePage;

    //Add Elements to cart and check their visibility in cart

    @Test (priority = 1)
    public void testAddElementsToCart () {
        homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isHomePageDispalyed());
        navigationBarPage = new NavigationBarPage (driver);
        allProductsPage = navigationBarPage.clickOnProductsBtn();
        allProductsPage.hoverAndClickOnAddToCart();
        viewCartPage = navigationBarPage.clickOnCartBtn();
        Assert.assertTrue(viewCartPage.checkFirstItemAddedToCart(),"Test should return True if item is added to cart");
        Assert.assertTrue(viewCartPage.checkSecondItemAddedToCart(),"Test should return True if item is added to cart");
    }
    @Test (priority = 2)
    public void testDataOfItemsInCart (){

        //Validate price, quantity and total price of items
        Assert.assertEquals(viewCartPage.getFirstItemPrice(),"Rs. 500","The 1st item price is wrong");
        Assert.assertEquals(viewCartPage.getSecondItemPrice(),"Rs. 400","The 2nd item price is wrong");
        Assert.assertEquals(viewCartPage.getFirstItemQuantity(),"1","Quantity should be 1");
        Assert.assertEquals(viewCartPage.getSecondItemQuantity(),"1","Quantity should be 1");
        Assert.assertEquals(viewCartPage.getFirstItemTotalPrice(), "Rs. 500");
        Assert.assertEquals(viewCartPage.getSecondItemTotalPrice(), "Rs. 400");
    }
}

