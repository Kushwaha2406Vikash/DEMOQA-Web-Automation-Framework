package pages;
import constant.Reusedata;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import locator.Locator;
import org.testng.Assert;
import java.time.Duration;


public class AlertsFramesWindowsPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public AlertsFramesWindowsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public void navigateToSection() {
      WebElement element = Reusedata.WatitElementNotVisible(Locator.AlertsFrameWindowCard);
        Reusedata.ScrollPage(element);
        Assert.assertTrue(element.isDisplayed(), "AlertFrameWindow section not visible");
        element.click();


    }
    
    public void openNewTab() {
        WebElement element = Reusedata.WatitElementNotVisible(Locator.BrowserWindows);
        Reusedata.scrollAndRemoveBanner(element);
        element.click();
        Assert.assertTrue(element.getText().contains("Browser Windows"),"Browser Windows is not click");
      
    }

    public void clickNewTab() {
        String originalWindow = driver.getWindowHandle();

        wait.until(ExpectedConditions.elementToBeClickable(Locator.newTab)).click();

        wait.until(driver -> driver.getWindowHandles().size() > 1);

        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

       
        Assert.assertTrue(driver.getCurrentUrl().contains("sample"),"New Tab is not click");
        driver.close();
        driver.switchTo().window(originalWindow);
    }

    public void clickNewWindow() {
        String originalWindow = driver.getWindowHandle();
        wait.until(ExpectedConditions.elementToBeClickable(Locator.newWindow)).click();
        wait.until(driver -> driver.getWindowHandles().size() > 1);
        boolean newWindowOpened = false;
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                newWindowOpened=true;
                break;
            }
        }
        Assert.assertTrue(newWindowOpened, "New window was not opened");
        driver.close();
        driver.switchTo().window(originalWindow);
        Assert.assertEquals(driver.getWindowHandle(), originalWindow, "Did not switch back to original window");
    }


    public void clickNewWindowMessage() {
        String originalWindow = driver.getWindowHandle();
        wait.until(ExpectedConditions.elementToBeClickable(Locator.newWindowMessage)).click();
        wait.until(driver -> driver.getWindowHandles().size() > 1);
        String messageWindowHandle = null;

        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                messageWindowHandle = windowHandle;
                driver.switchTo().window(messageWindowHandle);
                break;
            }
        }

        Assert.assertNotNull(messageWindowHandle, "Message window was not opened");
        driver.close();
        driver.switchTo().window(originalWindow);
        Assert.assertEquals(driver.getWindowHandle(), originalWindow, " Did not switch back to original window");

    }


    public void openAlertsMenu() {
        WebElement menu = Reusedata.WatitElementNotVisible(Locator.Alerts);
        Reusedata.scrollAndRemoveBanner(menu);
        menu.click();
        Assert.assertEquals(menu.getText().trim(), "Alerts", "Failed to open Alerts menu");
    }

    public void handleSimpleAlert() {
        WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(Locator.AlertButton));
        btn.click();

        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Simple Alert Text: " + alert.getText());
        Assert.assertTrue(alertText.toLowerCase().contains("you clicked a button"), "Simple alert text doesn't match expected");
        Reusedata.sleep(2000);
        alert.accept();
    }

    public void handleDelayedAlert() {
        WebElement btn = Reusedata.WatitElementNotVisible(Locator.TimerAlertButton);
        btn.click();

        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        Assert.assertFalse(alertText.isEmpty(), "Delayed alert text is empty");
        Reusedata.sleep(2000);
        alert.accept();
    }

    public void handleConfirmationAlert(boolean accept) {
        WebElement btn = Reusedata.WatitElementNotVisible(Locator.ConfirmButton);
        btn.click();

        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();

        if (accept) {
            alert.accept();
        } else {
            alert.dismiss();
        }

        String result = driver.findElement(Locator.ConfirmResult).getText();
        System.out.println("Confirmation Result: " + result);

        //  Assertion
        if (accept) {
            Assert.assertTrue(result.contains("Ok"), "Expected confirmation result 'Ok'");
        } else {
            Assert.assertTrue(result.contains("Cancel"), "Expected confirmation result 'Cancel'");
        }
    }

    public void handlePromptAlert(String input) {
        WebElement btn = Reusedata.WatitElementNotVisible(Locator.PromptButton);
        btn.click();

        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();

        alert.sendKeys(input);
        alert.accept();

        String result = driver.findElement(Locator.PromptResult).getText();
        Assert.assertTrue(result.contains(input), "Prompt result does not contain input text");
    }


    public void ClickFrame() {
        WebElement element = Reusedata.WatitElementNotVisible(Locator.Frames);
        Reusedata.ScrollPage(element);
        element.click();
    }


    public void ClickModalDialogs1() {
        WebElement element = Reusedata.WatitElementNotVisible(Locator.ModalDialogs);
        Reusedata.ScrollPage(element);
        element.click();
    }

    public void handleModalDialogs() {
        WebElement smallModalBtn= Reusedata.WatitElementNotVisible(Locator.smallModalBtn);
        Assert.assertTrue(smallModalBtn.isDisplayed(), " Small Modal button not visible");
        smallModalBtn.click();
        
        WebElement smallModalTitle= Reusedata.WatitElementNotVisible(Locator.smallModalTitle);
        String smallTitle = smallModalTitle.getText();
        Assert.assertEquals(smallTitle, "Small Modal", " Small Modal title mismatch");
        
        WebElement closeSmall = wait.until(ExpectedConditions.elementToBeClickable(Locator.closeSmallModalBtn));
        Assert.assertTrue(closeSmall.isDisplayed(), "Close button for Small Modal not visible");
        closeSmall.click();
        
        WebElement largeModalBtn = wait.until(ExpectedConditions.elementToBeClickable(Locator.largeModalBtn));
       
        Assert.assertTrue(largeModalBtn.isDisplayed(), " Close button for Large Modal not visible");
        largeModalBtn.click();

        WebElement largeModalTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("example-modal-sizes-title-lg")));
        String largeTitle = largeModalTitle.getText().trim();
        Assert.assertEquals(largeTitle, "Large Modal", " Large Modal title mismatch");
        
        WebElement closeLarge = wait.until(ExpectedConditions.elementToBeClickable(Locator.closeLargeModalBtn));
        
        Assert.assertTrue(closeLarge.isDisplayed(), "Close button for Large Modal not visible");
        closeLarge.click();
    }

}
