package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.AddToCartPage;

public class RemoveFromCartTest extends BaseTest {

    @Test
    public void verifyRemoveFromCart() {

        // Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApplication("standard_user", "secret_sauce");

        AddToCartPage cartPage = new AddToCartPage(driver);

        // Add product
        cartPage.clickAddToCart();

        // Remove product
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();

        // Verify cart badge not present
        boolean isBadgePresent = driver.findElements(By.className("shopping_cart_badge")).size() > 0;

        Assert.assertFalse(isBadgePresent, "Cart badge still present after removing product");
    }
}
