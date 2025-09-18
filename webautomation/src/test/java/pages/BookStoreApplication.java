package pages;

import locator.Locator;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import constant.Reusedata;
import org.testng.Assert;

import java.time.Duration;


public class BookStoreApplication {
    WebDriver driver;
    WebDriverWait wait;

    public BookStoreApplication(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void ClickBookStore(){

        WebElement element = Reusedata.WatitElementNotVisible(Locator.BookStoreApplicationButton);
        Reusedata.ScrollPage(element);
        Assert.assertTrue(element.isDisplayed(), " Book Store Application button is not visible");

        element.click();
    }
    
    public void LoginButton(){
      
        WebElement element = Reusedata.WatitElementNotVisible(Locator.Login);
        Reusedata.ScrollPage(element);
        Assert.assertTrue(element.isDisplayed(), " Login button is not visible");
        element.click();
    }
    
    public void LoginUser(String username,String password){
        driver.findElement(Locator.Username).sendKeys(username);
        driver.findElement(Locator.Password).sendKeys(password);
        WebElement element = Reusedata.WatitElementNotVisible(Locator.LoginButton);
        Reusedata.ScrollPage(element);
        element.click();
    }
    
    public void CreateUser(){
        WebElement element = Reusedata.WatitElementNotVisible(Locator.CreateNewUser);
        Reusedata.ScrollPage(element);
        Assert.assertTrue(element.isDisplayed(), "Create button is not visible");
        element.click();
    }
    public void Register(){
        driver.findElement(Locator.newUserfirstname).sendKeys("Modi");
        driver.findElement(Locator.newUserlastname).sendKeys("Kumar");
        driver.findElement(Locator.newUsername).sendKeys("Modi1234567");
        driver.findElement(Locator.newPassword).sendKeys("Modi@12345");
      
        WebElement element = Reusedata.WatitElementNotVisible(Locator.newRegister);
        Reusedata.ScrollPage(element);
        element.click();

        try {
          
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println("Alert Text: " + alert.getText());
            alert.accept();  
        } catch (TimeoutException e) {
            System.out.println("No alert appeared within timeout.");
        }
        
        
    }
    
    public void BackToLogin(){
        WebElement element = Reusedata.WatitElementNotVisible(Locator.GoToLogin);
        Reusedata.ScrollPage(element);
        Assert.assertTrue(element.isDisplayed(), "Back to Login button is not visible");
        element.click();
    }
    
    
    
}
