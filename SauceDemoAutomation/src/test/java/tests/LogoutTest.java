package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.LogoutPage;

public class LogoutTest extends BaseTest {

    @Test
    public void verifyLogout() {

        // Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApplication("standard_user", "secret_sauce");

        // Logout
        LogoutPage logoutPage = new LogoutPage(driver);
        logoutPage.clickMenu();
        logoutPage.clickLogout();

        // Verify login button visible again
        boolean isLoginButtonVisible = driver.findElement(By.id("login-button")).isDisplayed();

        Assert.assertTrue(isLoginButtonVisible, "Logout failed - Login button not visible");
    }
}
