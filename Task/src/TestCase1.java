import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase1 {
    public void TestCase1(WebDriver driver) {

        // Successful login

        WebElement userName_element = driver.findElement(By.id("user-name"));
        WebElement password_element = driver.findElement(By.id("password"));
        WebElement loginBtn_element = driver.findElement(By.id("login-button"));


        userName_element.sendKeys("standard_user");
        password_element.sendKeys("secret_sauce");
        loginBtn_element.click();
    }
}