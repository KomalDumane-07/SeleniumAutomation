package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage {

    WebDriver driver;

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
    }

    By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    By cartBadge = By.className("shopping_cart_badge");
    By removeButton = By.id("remove-sauce-labs-backpack");

    public void clickAddToCart() {
        driver.findElement(addToCartButton).click();
    }

    public String getCartBadgeText() {
        return driver.findElement(cartBadge).getText();
    }

    public String getRemoveButtonText() {
        return driver.findElement(removeButton).getText();
    }
}
