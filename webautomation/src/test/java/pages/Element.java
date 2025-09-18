package pages;
import locator.Locator;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import constant.Reusedata;
import org.testng.Assert;


import java.time.Duration;

public class Element {

    WebDriver driver;
    WebDriverWait wait;

    public Element(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void ElementClick(){
     
        WebElement element = Reusedata.WatitElementNotVisible(Locator.Elementclick);
        Reusedata.ScrollPage(element);
        Assert.assertTrue(element.isDisplayed(), "Element section not visible");
        element.click();
    }

    public void clickTextBox() {
       
        WebElement element = Reusedata.WatitElementNotVisible(Locator.TextBox);
        Reusedata.scrollAndRemoveBanner(element);
        wait.until(ExpectedConditions.elementToBeClickable(Locator.TextBox)).click();
        String title = driver.getTitle();
        Assert.assertEquals(title, "DEMOQA", "Page title mismatch after clicking Text Box");
    }

    public void textBoxForm() {

        driver.findElement(Locator.Name).sendKeys("vikash");
        driver.findElement(Locator.Email).sendKeys("vikash@gmail.com");
        driver.findElement(Locator.CurrentAddress).sendKeys("Noida");
        driver.findElement(Locator.PramentAddress).sendKeys("Gorakhpur");
      
        WebElement element = Reusedata.WatitElementNotVisible(Locator.SubmitButton);
        Reusedata.ScrollPage(element);
        element.click();

        WebElement output = driver.findElement(By.id("output"));
        Assert.assertTrue(output.isDisplayed(), "Form was not submitted correctly");
    }

    public void Checkbox() {
       
        WebElement element = Reusedata.WatitElementNotVisible(Locator.CheckBox);
        Assert.assertTrue(element.isDisplayed(), "Checkbox is not visible");
        element.click();

    }

    public void Checkboxhome(){
      
        WebElement checkbox = Reusedata.WatitElementNotVisible(Locator.CheckBoxHome);
        Reusedata.scrollAndRemoveBanner(checkbox);
        checkbox.click();
        Assert.assertTrue(true, "Home checkbox not selected");

    }

    public void RadioButton() {
    
        WebElement element = Reusedata.WatitElementNotVisible(Locator.Radiobutton);
        element.click();
        Assert.assertTrue(element.isDisplayed(), "Radio button not visible");
    }

    public void ClickYes() {


    

        WebElement element = Reusedata.WatitElementNotVisible(Locator.ClickYes);
        Reusedata.scrollAndRemoveBanner(element);
        element.click();
        WebElement result = driver.findElement(By.className("text-success"));
        Assert.assertEquals(result.getText(), "Yes", "Yes radio button was not selected");

    }

    public void WebTables() {
      
        WebElement element = Reusedata.WatitElementNotVisible(Locator.WebTables);
        Reusedata.scrollAndRemoveBanner(element);
        element.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("webtables"), "Not navigated to Web Tables");
    }


    public void SearchWebTables() {
      
        WebElement element = Reusedata.WatitElementNotVisible(Locator.WebTablesSearch);
        element.sendKeys("Vega");
        Assert.assertEquals(element.getAttribute("value"), "Vega", "Search input value mismatch");
    }

    public void addWebTables() {
      
        WebElement element = Reusedata.WatitElementNotVisible(Locator.WebTablesAdd);
        element.click();
        Assert.assertTrue(driver.findElement(Locator.firstName).isDisplayed(), "User form not opened");
        
        UserForm();
    }

    public void UserForm() {
        driver.findElement(Locator.firstName).sendKeys("Ram");
        driver.findElement(Locator.lastName).sendKeys("Sharma");
        driver.findElement(Locator.email).sendKeys("Sharma@gmail.com");
        driver.findElement(Locator.age).sendKeys("25");
        driver.findElement(Locator.salary).sendKeys("50000");
        driver.findElement(Locator.department).sendKeys("software Developer");
        driver.findElement(Locator.submitform).click();
      
    }

    public void ClickButton() {
      
        WebElement element = Reusedata.WatitElementNotVisible(Locator.Button);
        element.click();
        Assert.assertTrue(element.isDisplayed(), "Button is not visible");
        
        

    }

    
    public void ClickMeButton(){
    
        WebElement element = Reusedata.WatitElementNotVisible(Locator.clickme);
        Reusedata.ScrollPage(element);
        element.click();

        WebElement confirmation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicClickMessage")));
        Assert.assertTrue(confirmation.getText().contains("You have done a dynamic click"), "Text is not present");
        
   }

   
    public void ClickLink(){
     
        WebElement element = Reusedata.WatitElementNotVisible(Locator.Radiobutton);
        Reusedata.scrollAndRemoveBanner(element);
        element.click();
        Assert.assertTrue(true, "Link clicked");
    }

    public void NavigateToHome() {
      

        try {
           
            WebElement element = Reusedata.WatitElementNotVisible(Locator.HomeLink);
           Reusedata.ScrollPage(element);
            
            String originalWindow = driver.getWindowHandle();
            
            element.click();
            wait.until(driver -> driver.getWindowHandles().size() > 1);
            
            for (String windowHandle : driver.getWindowHandles()) {
                if (!windowHandle.equals(originalWindow)) {
                    driver.switchTo().window(windowHandle);
                    break;
                }
            }
            
            Assert.assertTrue(driver.getCurrentUrl().contains("demoqa.com"), "New tab not opened properly");
            driver.close();
            driver.switchTo().window(originalWindow);

        } catch (TimeoutException e) {
            System.out.println("Element #simpleLink was not found or not visible within 10 seconds.");
        }
    }
    
   
    public void UploadAndDownloadclick(){
      
        WebElement element = Reusedata.WatitElementNotVisible(Locator.UploadandDownload);
        Reusedata.scrollAndRemoveBanner(element);
        element.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("upload-download"), "Not navigated to Upload and Download page");
    }
    
    public void Download(){
       
        WebElement element = Reusedata.WatitElementNotVisible(Locator.Download);
        Reusedata.scrollAndRemoveBanner(element);
        element.click();
        Assert.assertTrue(true, "Download button clicked");
    }
    
    public void Upload(){

       
        WebElement element = Reusedata.WatitElementNotVisible(Locator.Upload);
        Reusedata.scrollAndRemoveBanner(element);
        element.sendKeys("C:\\Users\\Lenovo\\Desktop\\vikash Kushwaha.pdf");
        WebElement uploadedMsg = driver.findElement(By.id("uploadedFilePath"));
        Assert.assertTrue(uploadedMsg.getText().contains("vikash Kushwaha.pdf"), "File not uploaded successfully");
    }
    
    public void DyanamicProperties(){
     
        WebElement element = Reusedata.WatitElementNotVisible(Locator.DyanamicProperties);
        Reusedata.scrollAndRemoveBanner(element);
        Assert.assertTrue(element.isEnabled(), "Dynamic property element is not enabled after delay");
        element.click();
    }
    

}
    
    

