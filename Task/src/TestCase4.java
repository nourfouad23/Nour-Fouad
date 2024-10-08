import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TestCase4 {
    public void TestCase4_removeItem(WebDriver driver) throws InterruptedException {

        // Remove the item from the cart and continue shopping

        TestCase5 tc = new TestCase5();
        tc.TestCase5_addItem(driver);

        boolean isCartItem = driver.findElements(By.className("cart_item")).isEmpty();


        if(!isCartItem){
            WebElement continueShopping = driver.findElement(By.id("continue-shopping"));
            Thread.sleep(1000);
            WebElement remove_btn = driver.findElement(By.id("remove-sauce-labs-backpack"));
            remove_btn.click();
            continueShopping.click();
        }
    }
}



