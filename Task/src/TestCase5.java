import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase5 {
    public void TestCase5_addItem(WebDriver driver){

        // Successful adding for an item in the cart and making sure it's add

        WebElement add_btn = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        add_btn.click();
        WebElement shoppingCart = driver.findElement(By.id("shopping_cart_container"));

        shoppingCart.click();
    }
}
