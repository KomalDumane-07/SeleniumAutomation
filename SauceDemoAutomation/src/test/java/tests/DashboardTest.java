package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.DashboardPage;

public class DashboardTest extends BaseTest {

    @Test
    public void verifyDashboard() {

        // Login first
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApplication("standard_user", "secret_sauce");

        DashboardPage dashboard = new DashboardPage(driver);

        // Verify title text
        String actualTitle = dashboard.getPageTitleText();
        Assert.assertEquals(actualTitle, "Products", "Dashboard title mismatch");

        // Verify URL
        String currentURL = dashboard.getCurrentURL();
        Assert.assertTrue(currentURL.contains("inventory"), "URL does not contain inventory");

        // Verify total products count
        int productCount = dashboard.getTotalProducts();
        Assert.assertEquals(productCount, 6, "Product count mismatch");
    }
}
