import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        TestCase1 tc1 = new TestCase1();
        tc1.TestCase1(driver);

        TestCase4 tc4 = new TestCase4();
        tc4.TestCase4_removeItem(driver);


    }
}