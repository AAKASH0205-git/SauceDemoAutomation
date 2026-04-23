package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

    public static WebDriver driver;

    public static void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");
    }

    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}