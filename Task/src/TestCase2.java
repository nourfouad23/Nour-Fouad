import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase2 {
    public void TestCase2(WebDriver driver) {

        // Wrong password

        WebElement userName_element = driver.findElement(By.id("user-name"));
        WebElement password_element = driver.findElement(By.id("password"));
        WebElement loginBtn_element = driver.findElement(By.id("login-button"));


        userName_element.sendKeys("standard_user");
        password_element.sendKeys("secret_sauc");
        loginBtn_element.click();
    }
}