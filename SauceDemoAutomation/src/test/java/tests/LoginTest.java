package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.loginToApplication("standard_user", "secret_sauce");

        // Verify Products page is displayed
        boolean isProductsVisible = driver.findElement(By.className("title")).isDisplayed();

        Assert.assertTrue(isProductsVisible, "Login Failed - Products page not visible");
    }
}
