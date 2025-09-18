package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Homepage {
    WebDriver driver;
    WebDriverWait wait;

    public Homepage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
     public void open(){
         driver.get("https://demoqa.com/");
         driver.manage().window().maximize();
         
     }


}
