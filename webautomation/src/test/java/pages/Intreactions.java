package pages;

import locator.Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import constant.Reusedata;
import org.testng.Assert;

import java.time.Duration;

public class Intreactions {

    WebDriver driver;
    WebDriverWait wait;

    public Intreactions(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void InteractionClick(){
        WebElement element = Reusedata.WatitElementNotVisible(Locator.InteractionsButton);
        Reusedata.ScrollPage(element);
        Assert.assertTrue(element.isDisplayed(),"Interactions button is not visible");
        element.click();
    }
    public void ClickSortAble(){
       
        WebElement element = Reusedata.WatitElementNotVisible(Locator.SortableButton);
        Reusedata.ScrollPage(element);
        Assert.assertTrue(element.isDisplayed(),"SortAble button is not visible");
        element.click();
        
        WebElement element1 = Reusedata.WatitElementNotVisible(Locator.GridButton);
        Reusedata.ScrollPage(element1);
        Assert.assertTrue(element1.isDisplayed(),"Interactions button is not visible");
        element1.click();
        
    }
    
    public void ClickSelectable(){
      
        WebElement element = Reusedata.WatitElementNotVisible(Locator.SelectableButton);
        Reusedata.ScrollPage(element);
        Assert.assertTrue(element.isDisplayed(),"Selctable button is not visible");
        element.click();
    }

    public void ClickResizable(){
        WebElement element = Reusedata.WatitElementNotVisible(Locator.ResizableButton);
        Reusedata.ScrollPage(element);
        Assert.assertTrue(element.isDisplayed(),"Resizable button is not visible");
        element.click();
    }

    public void ClickDroppable(){
    
        WebElement element = Reusedata.WatitElementNotVisible(Locator.DroppableButton);
        Reusedata.ScrollPage(element);
        Assert.assertTrue(element.isDisplayed(),"Droppable button is not visible");
        element.click();
    }
    public void ClickDragabble(){
        WebElement element = Reusedata.WatitElementNotVisible(Locator.DragabbleButton);
        Reusedata.ScrollPage(element);
        Assert.assertTrue(element.isDisplayed(),"Dragabble button is not visible");
        element.click();
    }
    

    
    
}
