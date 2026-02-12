package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.AddToCartPage;
import pages.CartPage;

public class CartVerificationTest extends BaseTest {

    @Test
    public void verifyCartDetails() {

        // Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApplication("standard_user", "secret_sauce");

        // Add product
        AddToCartPage addPage = new AddToCartPage(driver);
        addPage.clickAddToCart();

        // Open cart
        CartPage cartPage = new CartPage(driver);
        cartPage.clickCart();

        // Verify product name
        Assert.assertEquals(cartPage.getProductName(), 
                "Sauce Labs Backpack", "Product name mismatch");

        // Verify quantity
        Assert.assertEquals(cartPage.getQuantity(), 
                "1", "Quantity mismatch");
    }
}
