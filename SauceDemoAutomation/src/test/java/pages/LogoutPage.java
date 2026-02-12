package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {

    WebDriver driver;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    By menuButton = By.id("react-burger-menu-btn");
    By logoutLink = By.id("logout_sidebar_link");

    public void clickMenu() {
        driver.findElement(menuButton).click();
    }

    public void clickLogout() {
        driver.findElement(logoutLink).click();
    }
}
