package webselenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;
import utils.Driverfactory;
import constant.Reusedata;

import java.time.Duration;


public class Main {

    public static void main(String[] args) {

     
        WebDriver driver = Driverfactory.getDriver();
        Homepage homepage = new Homepage(driver);
      /*  homepage.open();
        Reusedata.sleep(1000);

        // ========== ELEMENTS ==========
       Element element = new Element(driver);
        element.ElementClick(); Reusedata.sleep(1000);
        element.clickTextBox(); Reusedata.sleep(1000);
        element.textBoxForm(); Reusedata.sleep(1000);
       element.Checkbox(); Reusedata.sleep(1000);
        element.Checkboxhome(); Reusedata.sleep(1000);
        element.RadioButton(); Reusedata.sleep(1000);
        element.ClickYes(); Reusedata.sleep(1000);
        element.WebTables(); Reusedata.sleep(1000);
        element.SearchWebTables(); Reusedata.sleep(1000);
        element.addWebTables(); Reusedata.sleep(1000);
        element.ClickButton(); Reusedata.sleep(1000);
        element.ClickMeButton(); Reusedata.sleep(1000);
        element.ClickLink(); Reusedata.sleep(1000);
        element.NavigateToHome(); Reusedata.sleep(1000);
        element.UploadAndDownloadclick(); Reusedata.sleep(1000);
        element.Download(); Reusedata.sleep(1000);
        element.Upload(); Reusedata.sleep(1000);
        element.DyanamicProperties(); Reusedata.sleep(1000);

        /*
        homepage.open(); Reusedata.sleep(1000);

        // ========== FORMS ==========
        Forms form = new Forms(driver);
        form.formclick(); Reusedata.sleep(1000);
        form.PracticeFormClick(); Reusedata.sleep(1000);
        form.FillUserForm(); Reusedata.sleep(1000);
        form.CloseTable(); Reusedata.sleep(1000);

        homepage.open(); Reusedata.sleep(1000);

        // ========== ALERTS, FRAMES & WINDOWS ==========
        AlertsFramesWindowsPage AFWpage = new AlertsFramesWindowsPage(driver);
        AFWpage.navigateToSection(); Reusedata.sleep(1000);
        AFWpage.openNewTab(); Reusedata.sleep(1000);
        AFWpage.clickNewTab(); Reusedata.sleep(1000);
        AFWpage.clickNewWindow(); Reusedata.sleep(1000);
        AFWpage.clickNewWindowMessage(); Reusedata.sleep(1000);
        
        AFWpage.openAlertsMenu(); Reusedata.sleep(1000);
        AFWpage.handleSimpleAlert(); Reusedata.sleep(1000);
        AFWpage.handleDelayedAlert(); Reusedata.sleep(1000);
        AFWpage.handleConfirmationAlert(true); Reusedata.sleep(1000);
        AFWpage.handlePromptAlert("Vikash"); Reusedata.sleep(1000);
        AFWpage.ClickFrame(); Reusedata.sleep(1000);
        AFWpage.ClickModalDialogs1(); Reusedata.sleep(1000);
        AFWpage.handleModalDialogs(); Reusedata.sleep(1000);
        
        homepage.open(); Reusedata.sleep(1000);

        // ========== WIDGETS ==========
        WidgetsHandler wh = new WidgetsHandler(driver);
        wh.clickWidgetsElement(); Reusedata.sleep(1000);
        wh.ClickAccordianButton(); Reusedata.sleep(1000);
        wh.AutoCompleteButton(); Reusedata.sleep(1000);
        wh.HandleAutoComplete(); Reusedata.sleep(1000);
        wh.DatePickerButton(); Reusedata.sleep(1000);
        wh.handleDatePicker(); Reusedata.sleep(1000);
        wh.SliderButton(); Reusedata.sleep(1000);
        wh.handleSlider(); Reusedata.sleep(1000);
        wh.ProgressButton(); Reusedata.sleep(1000);
        wh.handleProgressBar(); Reusedata.sleep(1000);
        wh.TabsButton(); Reusedata.sleep(1000);
        wh.MenuButton(); Reusedata.sleep(1000);
        wh.handleMenu(); Reusedata.sleep(1000);
        wh.MenuSelectButton(); Reusedata.sleep(1000);
        wh.handleSelectMenu(); Reusedata.sleep(1000);
       
        homepage.open(); Reusedata.sleep(1000);

        // ========== INTERACTIONS ==========
        Intreactions page = new Intreactions(driver);
        page.InteractionClick(); Reusedata.sleep(1000);
        page.ClickSortAble(); Reusedata.sleep(1000);
        page.ClickSelectable(); Reusedata.sleep(1000);
        page.ClickResizable(); Reusedata.sleep(1000);
        page.ClickDroppable(); Reusedata.sleep(1000);
        page.ClickDragabble(); Reusedata.sleep(1000);

        
        homepage.open(); Reusedata.sleep(1000);

       // ========== BOOK STORE APPLICATION ==========
        BookStoreApplication book = new BookStoreApplication(driver);
        book.ClickBookStore(); Reusedata.sleep(1000);
        book.LoginButton(); Reusedata.sleep(1000);
        book.LoginUser("Vikas123", "Vikash@1234"); Reusedata.sleep(1000);
        book.CreateUser(); Reusedata.sleep(1000);
        book.Register(); Reusedata.sleep(1000);
        book.BackToLogin(); Reusedata.sleep(1000);
        book.LoginUser("Modi1234567", "Modi@12345"); Reusedata.sleep(1000);
     
        Reusedata.sleep(3000);
        driver.quit();*/
    }

        
    }

