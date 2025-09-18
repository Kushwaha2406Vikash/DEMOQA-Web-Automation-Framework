package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.*;
import pages.*;
import utils.*;

public class WebTestReport {

    private WebDriver driver;
    private Homepage homepage;

    @BeforeSuite(alwaysRun = true)
    public void setUpSuite() {
        driver = Driverfactory.getDriver();
        Reporter.log("Driver initialized successfully", true);
    }

    @BeforeMethod(alwaysRun = true)
    public void setUpTest() {
        homepage = new Homepage(driver);
        homepage.open(); // Navigate fresh before each test
        Reporter.log("Navigated to Home Page", true);
    }

    @Test(groups = {"smoke"})
    public void ElementCard() {
        Reporter.log("Element Card Open", true);
        Element element = new Element(driver);

        element.ElementClick();
        element.clickTextBox();
        element.textBoxForm();
        element.Checkbox();
        element.Checkboxhome();
        element.RadioButton();
        element.ClickYes();
        element.WebTables();
        element.SearchWebTables();
        element.addWebTables();
        element.ClickButton();
        element.ClickMeButton();
        element.ClickLink();
        element.NavigateToHome();
        element.UploadAndDownloadclick();
        element.Download();
        element.Upload();
        element.DyanamicProperties();
    }

    @Test(groups = {"smoke"})
    public void FormCard() {
        Reporter.log("FormCard is Open, Fill the User Information", true);
        Forms form = new Forms(driver);

        form.formclick();
        form.PracticeFormClick();
        form.FillUserForm();
        form.CloseTable();
    }

    @Test(groups = {"smoke"})
    public void AlertFrameWindowCard() {
        Reporter.log("AlertFrameWindowCard is Open, perform inside the task", true);
        AlertsFramesWindowsPage alertsFramesWindowsPagepage = new AlertsFramesWindowsPage(driver);

        alertsFramesWindowsPagepage.navigateToSection();
        alertsFramesWindowsPagepage.openNewTab();
        alertsFramesWindowsPagepage.clickNewTab();
        alertsFramesWindowsPagepage.clickNewWindow();
        alertsFramesWindowsPagepage.clickNewWindowMessage();

        alertsFramesWindowsPagepage.openAlertsMenu();
        alertsFramesWindowsPagepage.handleSimpleAlert();
        alertsFramesWindowsPagepage.handleDelayedAlert();
        alertsFramesWindowsPagepage.handleConfirmationAlert(true);
        alertsFramesWindowsPagepage.handlePromptAlert("Vikash");
        alertsFramesWindowsPagepage.ClickFrame();
        alertsFramesWindowsPagepage.ClickModalDialogs1();
        alertsFramesWindowsPagepage.handleModalDialogs();
    }

    @Test(groups = {"smoke"})
    public void WidgetsCard() {
        Reporter.log("WidgetsCard is Open", true);
        WidgetsHandler widgetsCard = new WidgetsHandler(driver);

        widgetsCard.clickWidgetsElement();
        widgetsCard.ClickAccordianButton();
        widgetsCard.AutoCompleteButton();
        widgetsCard.HandleAutoComplete();
        widgetsCard.DatePickerButton();
        widgetsCard.handleDatePicker();
        widgetsCard.SliderButton();
        widgetsCard.handleSlider();
        widgetsCard.ProgressButton();
        widgetsCard.handleProgressBar();
        widgetsCard.TabsButton();
        widgetsCard.MenuButton();
        widgetsCard.handleMenu();
        widgetsCard.MenuSelectButton();
        widgetsCard.handleSelectMenu();
    }

    @Test(groups = {"smoke"})
    public void InteractionCard() {
        Reporter.log("InteractionCard is Open", true);
        Intreactions page = new Intreactions(driver);

        page.InteractionClick();
        page.ClickSortAble();
        page.ClickSelectable();
        page.ClickResizable();
        page.ClickDroppable();
        page.ClickDragabble();
    }

    @Test(groups = {"smoke"})
    public void BookStoreApplication() {
        Reporter.log("BookStoreApplication is Open", true);
        BookStoreApplication book = new BookStoreApplication(driver);

        book.ClickBookStore();
        book.LoginButton();
        book.LoginUser("Vikas123", "Vikash@1234");
        book.CreateUser();
        book.Register();
        book.BackToLogin();
        book.LoginUser("Modi1234567", "Modi@12345");
    }

    @AfterSuite(alwaysRun = true)
    public void tearDownSuite() {
        if (driver != null) {
            driver.quit();
            Reporter.log("Browser closed successfully", true);
        }
    }
}
