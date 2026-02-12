package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.AddToCartPage;

public class AddToCartTest extends BaseTest {

    @Test
    public void verifyAddToCart() {

        // Login first
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApplication("standard_user", "secret_sauce");

        AddToCartPage cartPage = new AddToCartPage(driver);

        // Click Add to Cart
        cartPage.clickAddToCart();

        // Verify cart badge = 1
        String badgeText = cartPage.getCartBadgeText();
        Assert.assertEquals(badgeText, "1", "Cart badge not updated");

        // Verify button changed to Remove
        String buttonText = cartPage.getRemoveButtonText();
        Assert.assertEquals(buttonText, "Remove", "Button text not changed");
    }
}
