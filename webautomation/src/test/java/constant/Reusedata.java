package constant;

import locator.Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driverfactory;

import java.time.Duration;


public class Reusedata {
    
    private static WebDriver driver = Driverfactory.getDriver();

    private static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    
   

    
    public static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); 
            throw new RuntimeException(e);
        }
    }

    
    public static void scrollAndRemoveBanner(WebElement element) {
        if (element == null) {
            throw new IllegalArgumentException("WebElement cannot be null");
        }
        
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);

        
        ((JavascriptExecutor) driver).executeScript("document.querySelector('footer')?.remove();");

        
        ((JavascriptExecutor) driver).executeScript("document.querySelector('#fixedban')?.remove();");
    }
    
    public static void ScrollPage(WebElement element){

        
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
    
    public static WebElement WatitElementNotVisible(By locator){
       return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    
}
