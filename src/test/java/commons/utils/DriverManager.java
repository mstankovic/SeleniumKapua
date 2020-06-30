package commons.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    public static WebDriver driver = null;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/");
    }

    @AfterTest
    public void close() {
        driver.close();
    }
}
