package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    By cartIcon = By.className("shopping_cart_link");
    By productName = By.className("inventory_item_name");
    By productPrice = By.className("inventory_item_price");
    By quantity = By.className("cart_quantity");

    public void clickCart() {
        driver.findElement(cartIcon).click();
    }

    public String getProductName() {
        return driver.findElement(productName).getText();
    }

    public String getProductPrice() {
        return driver.findElement(productPrice).getText();
    }

    public String getQuantity() {
        return driver.findElement(quantity).getText();
    }
}
