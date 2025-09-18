package utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Driverfactory {
    private static WebDriver driver;

    public static WebDriver  getDriver() {
        if (driver == null) {
          

            WebDriverManager.chromedriver().setup();  // Auto downloads and sets driver
            driver = new ChromeDriver();
            driver.manage().window().maximize();
         
        }
        return driver;
    }

    /*
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }*/
}
