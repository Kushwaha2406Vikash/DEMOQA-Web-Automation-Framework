package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import locator.Locator;
import constant.Reusedata;
import org.testng.Assert;

import java.time.Duration;

public class WidgetsHandler {

    WebDriver driver;
    WebDriverWait wait;

    public WidgetsHandler(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    
    public void clickWidgetsElement(){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(Locator.WidgetsClick));
        Reusedata.ScrollPage(element);
        Assert.assertTrue(element.isDisplayed(),"Widgets was not open");
        element.click();
    }
    
    public void ClickAccordianButton(){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(Locator.AccordianButton));

        Reusedata.ScrollPage(element);
        element.click();
        Assert.assertTrue(element.getText().contains("Accordian"),"Accordian was not open");
        Reusedata.sleep(2000);
        ClickAccordianHeading2();
        
        
        
    }

    public void ClickAccordianHeading2(){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(Locator.AccordionHeading1));
        Reusedata.ScrollPage(element);
        element.click();

    }
    
    public void AutoCompleteButton(){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(Locator.AutoCompleteButton));
        Reusedata.ScrollPage(element);
        element.click();
        Assert.assertTrue(element.getText().contains("Auto Complete"),"Accordian was not open");
        

    }
    
    public  void HandleAutoComplete(){

        WebElement multiInput = wait.until(ExpectedConditions.visibilityOfElementLocated(Locator.MultiColorInput));
        multiInput.sendKeys("Red");
        multiInput.sendKeys(Keys.ENTER);
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'multi-value__label') and text()='Red']")).isDisplayed(), "Red color not selected in multi-input");

        WebElement singleInput = wait.until(ExpectedConditions.visibilityOfElementLocated(Locator.SingleColorInput));
        singleInput.sendKeys("Blue");
        singleInput.sendKeys(Keys.ENTER);
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'singleValue') and text()='Blue']")).isDisplayed(), "Blue color not selected in single-input");
    }


    public void DatePickerButton(){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(Locator.DatePicker));
        Reusedata.ScrollPage(element);
        element.click();
      
        Assert.assertTrue(element.getText().contains("Date Picker"),"Failed to navigate to Date Picker section");

    }
    public void handleDatePicker() {
        
       
        WebElement dateInput = wait.until(ExpectedConditions.elementToBeClickable(Locator.DateInput));
        Reusedata.ScrollPage(dateInput);

        
        dateInput.sendKeys(Keys.CONTROL + "a");
        dateInput.sendKeys(Keys.DELETE);

        dateInput.sendKeys("10/07/2025");  
        dateInput.sendKeys(Keys.ENTER);

        Assert.assertEquals(dateInput.getAttribute("value"), "10/07/2025", "Date input value mismatch");

        pickDateAndTime();
        
    }
    public void pickDateAndTime() {
        try {
            WebElement dateTimeInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("dateAndTimePickerInput")));
            dateTimeInput.click();

            // Pick month
            WebElement month = wait.until(ExpectedConditions.elementToBeClickable(By.className("react-datepicker__month-read-view")));
            month.click();
            WebElement desiredMonth = wait.until(ExpectedConditions.elementToBeClickable(Locator.DateTimeInput));
            desiredMonth.click();

            // Pick year
            WebElement year = wait.until(ExpectedConditions.elementToBeClickable(By.className("react-datepicker__year-read-view")));
            year.click();
            WebElement desiredYear = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='2025']")));
            desiredYear.click();

            // Pick day
            WebElement day = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//div[contains(@class, 'react-datepicker__day') and text()='29' and not(contains(@class, 'outside-month'))]")));
            day.click();

            // Pick time
            WebElement time = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='05:30 PM']")));
            time.click();

            System.out.println("⏰ Date & Time selected.");

        } catch (Exception e) {
            System.out.println("Error picking date & time: " + e.getMessage());
        }
    }

    public void SliderButton(){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(Locator.Slider));
        Reusedata.ScrollPage(element);
        element.click();


        Assert.assertTrue(element.getText().contains("Slider"),"Failed to navigate to Slider section");


    }


    public void handleSlider() {
        
        WebElement slider = wait.until(ExpectedConditions.elementToBeClickable(Locator.SliderHandle));
        Reusedata.ScrollPage(slider);
        Actions actions = new Actions(driver);
        actions.clickAndHold(slider).moveByOffset(8, 0).release().perform();
    }
    
    public void ProgressButton(){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(Locator.Progress));
        Reusedata.ScrollPage(element);
        element.click();
        Assert.assertTrue(element.getText().contains("Progress Bar"),"Failed to navigate to Progress Bar section");
        
    }
  
    public void handleProgressBar() {
        
        WebElement progressBarTab = wait.until(ExpectedConditions.elementToBeClickable(Locator.Progress));
        Reusedata.scrollAndRemoveBanner(progressBarTab);
        progressBarTab.click();

        
        WebElement startButton = wait.until(ExpectedConditions.elementToBeClickable(Locator.ProgressstartStopButton));
        Reusedata.scrollAndRemoveBanner(startButton);
        startButton.click();

        
        WebElement progressBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[role='progressbar']")));
        wait.until(driver -> {
            String progress = progressBar.getAttribute("aria-valuenow");
          
            return progress.equals("100");
        });

        Reusedata.sleep(500);
        
        WebElement resetButton = wait.until(ExpectedConditions.elementToBeClickable(Locator.RestartButton));
        resetButton.click();
    }

    public void TabsButton(){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(Locator.TabButton));
        Reusedata.ScrollPage(element);
        element.click();
        Assert.assertTrue(element.getText().contains("Tabs"),"Failed to navigate to Slider section");
       
    }

    public void MenuButton(){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(Locator.MenuButton));

        
        Reusedata.ScrollPage(element);
        element.click();

        Assert.assertTrue(element.getText().contains("Menu"),"Failed to navigate to Menu section");
       
    }

    public void handleMenu() {
       
        WebElement menu = wait.until(ExpectedConditions.visibilityOfElementLocated(Locator.MainMenuItem));
        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
        Assert.assertTrue(menu.isDisplayed(), "Main menu is not visible or accessible");
    }

    public void MenuSelectButton(){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(Locator.MenuSelectButton));
        
        Reusedata.ScrollPage(element);
        element.click();

        Assert.assertTrue(element.getText().contains("Select Menu"),"Failed to navigate to Slider section");
       
    }


  public void handleSelectMenu() {
      Actions actions = new Actions(driver);


      
      WebElement selectValue = wait.until(ExpectedConditions.elementToBeClickable(By.id("withOptGroup")));
      selectValue.click();
      WebElement groupOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Group 2, option 1')]")));
      groupOption.click();
      
      WebElement selectOne = wait.until(ExpectedConditions.elementToBeClickable(By.id("selectOne")));
      selectOne.click();
      WebElement option = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Dr.')]")));
      option.click();

      
      WebElement oldSelect = wait.until(ExpectedConditions.elementToBeClickable(By.id("oldSelectMenu")));
      Select oldStyle = new Select(oldSelect);
      oldStyle.selectByVisibleText("Purple");
      
      WebElement multiSelectInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'placeholder') and text()='Select...']")));
      multiSelectInput.click();

      WebElement greenOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Green']")));
      greenOption.click();

      WebElement blueOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Blue']")));
      blueOption.click();

      actions.sendKeys(Keys.ESCAPE).perform(); // Close dropdown

      
      WebElement multiHtmlSelect = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cars")));
      Select multiSelect = new Select(multiHtmlSelect);
      multiSelect.selectByVisibleText("Volvo");
      multiSelect.selectByVisibleText("Audi");
  }


}
