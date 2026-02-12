package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;
import org.openqa.selenium.WebElement;

public class DashboardPage {

    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    By title = By.className("title");
    By products = By.className("inventory_item");

    public String getPageTitleText() {
        return driver.findElement(title).getText();
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }

    public int getTotalProducts() {
        List<WebElement> productList = driver.findElements(products);
        return productList.size();
    }
}
