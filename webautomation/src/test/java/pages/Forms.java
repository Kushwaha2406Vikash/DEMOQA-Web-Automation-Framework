package pages;

import constant.Reusedata;
import locator.Locator;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Forms {

    WebDriver driver;
    WebDriverWait wait;

    public Forms(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    
    public void formclick(){
      
        WebElement element = Reusedata.WatitElementNotVisible(Locator.Formclick);
       Reusedata.ScrollPage(element);
        Assert.assertTrue(element.isDisplayed(), "Forms section not visible");
        element.click();
    }
    
    public void PracticeFormClick(){
        
        WebElement element = Reusedata.WatitElementNotVisible(Locator.PracticeFormclick);
        Reusedata.scrollAndRemoveBanner(element);
        Assert.assertTrue(element.getText().contains("Practice Form"),"Practice Form is not click");
        element.click();
        
    }
    
    public void FillUserForm(){
        
        driver.findElement(Locator.userFirstname).sendKeys("Rakesh");
        driver.findElement(Locator.userLasttname).sendKeys("Kumar");
        driver.findElement(Locator.userEmail).sendKeys("Rakesh@gmail.com");
        driver.findElement(Locator.userGender).click();
        driver.findElement(Locator.userMobile).sendKeys("9569083751");
        driver.findElement(Locator.userDate).click();
        

        WebElement yearDropdown = driver.findElement(Locator.Selectyear);
        Select selectYear = new Select(yearDropdown);
        selectYear.selectByVisibleText("2025");

        WebElement monthDropdown = driver.findElement(Locator.Selectmonth);
        Select selectMonth = new Select(monthDropdown);
        selectMonth.selectByVisibleText("June");


        List<WebElement> days = driver.findElements(Locator.Selectday);
        for (WebElement day : days) {
            if (day.getText().equals("25") && day.isDisplayed()) {
                day.click();
                break;
            }
        }
        
        
       WebElement input= driver.findElement(Locator.userSubject);
        input.sendKeys("Math");
        input.sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locator.userHobbies)).click();
        driver.findElement(Locator.userPicture).sendKeys("C:\\Users\\Lenovo\\Desktop\\vikash Kushwaha.pdf");
        driver.findElement(Locator.userCurrentAddress).sendKeys("noida 59");
        selectStateAndCity("Uttar Pradesh", "Agra");
        driver.findElement(Locator.userSubmit).click();


    }

    

    public void selectStateAndCity(String state, String city) {
        WebElement stateBox = wait.until(ExpectedConditions.elementToBeClickable(Locator.stateInput));
        stateBox.sendKeys(state);
        stateBox.sendKeys(Keys.ENTER);

        WebElement cityBox = wait.until(ExpectedConditions.elementToBeClickable(Locator.cityInput));
        cityBox.sendKeys(city);
        cityBox.sendKeys(Keys.ENTER);
    }
    
    public void CloseTable(){
           WebElement element = Reusedata.WatitElementNotVisible(Locator.Closelargemodal);
            Reusedata.ScrollPage(element);
            Assert.assertTrue(element.getText().contains("Close"),"Text is not present");
            element.click();
        
    }
}
