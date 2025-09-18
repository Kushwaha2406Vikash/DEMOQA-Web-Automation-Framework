package locator;
import org.openqa.selenium.By;
public class Locator {

    public static final By Elementclick = By.xpath("//div[@class='home-body']/div[@class='category-cards']/div[1]");
    public static final By TextBox = By.xpath("//li[@id='item-0']//span[text()='Text Box']");

    public static final By Name = By.xpath("//*[@id=\"userName\"]");
    public static final By Email = By.xpath("//*[@id=\"userEmail\"]");
    public static final By CurrentAddress = By.xpath("//*[@id=\"currentAddress\"]");
    public static final By PramentAddress = By.xpath("//*[@id=\"permanentAddress\"]");
    public static final By SubmitButton = By.xpath("//*[@id=\"submit\"]");


    public static final By CheckBox = By.xpath("//*[@id=\"item-1\"]");
    public static final By CheckBoxHome = By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]");

    public static final By Radiobutton = By.xpath("//*[@id=\"item-2\"]");
    public static final By ClickYes   = By.cssSelector("label[for='yesRadio']");

    public static final By WebTables = By.xpath("//*[@id=\"item-3\"]");
    public static final By WebTablesAdd = By.xpath("//*[@id=\"addNewRecordButton\"]");


  
    
    public static final By WebTablesSearch=By.xpath("//*[@id=\"searchBox\"]");
    public static final By firstName   = By.cssSelector("#firstName");
    public static final By lastName   = By.cssSelector("#lastName");
    public static final By email   = By.cssSelector("#userEmail");
    public static final By age   = By.cssSelector("#age");
    public static final By salary   = By.cssSelector("#salary");
    public static final By department   = By.cssSelector("#department");
    public static final By submitform  = By.cssSelector("#submit");


    public static final By Button = By.xpath("//*[@id=\"item-4\"]");
    public static final By clickme = By.xpath("//button[text()='Click Me']");

    public static final By Link = By.xpath("//*[@id=\"item-5\"]");
    public static final By HomeLink  = By.cssSelector("#simpleLink");

    public static final By UploadandDownload = By.xpath("//*[@id=\"item-7\"]");
    public static final By Download = By.xpath("//*[@id=\"downloadButton\"]");
    public static final By Upload = By.xpath("//*[@id=\"uploadFile\"]");

    public static final By DyanamicProperties = By.xpath("//*[@id=\"item-8\"]");

    
   
    public static final By Formclick =  By.xpath("//*[text()='Forms']");
    public static final By PracticeFormclick =  By.xpath("//li[@id='item-0']//span[text()='Practice Form']");
    
    
    public static final By userFirstname = By.xpath("//*[@id=\"firstName\"]");
    public static final By userLasttname = By.xpath("//*[@id=\"lastName\"]");
    public static final By userEmail = By.xpath("//*[@id=\"userEmail\"]");
    public static final By userGender = By.cssSelector("label[for='gender-radio-1']");
    public static final By userMobile = By.xpath("//*[@id=\"userNumber\"]");
    public static final By userDate = By.xpath("//*[@id=\"dateOfBirthInput\"]");
    public static final By userSubject = By.xpath("//*[@id=\"subjectsInput\"]");
    public static final By userHobbies = By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]");
    public static final By userPicture = By.xpath("//*[@id=\"uploadPicture\"]");
    public static final By userCurrentAddress = By.xpath("//*[@id=\"currentAddress\"]");
    public static final By stateInput = By.id("react-select-3-input");
    public static final By cityInput  = By.id("react-select-4-input");
    public static final By userSubmit = By.xpath("//*[@id=\"submit\"]");
    public static final By Closelargemodal = By.cssSelector("#closeLargeModal");
    
    public static final By Selectyear= By.cssSelector(".react-datepicker__year-select");
    public static final By Selectmonth= By.cssSelector(".react-datepicker__month-select");
    public static final By Selectday = By.cssSelector(".react-datepicker__day");
            
    
    



    // Alerts, Frame & Windows section
   // public static final By AlertsFrameWindowCard = By.xpath("//div[@class='home-body']/div[@class='category-cards']/div[3]");
    public static final By AlertsFrameWindowCard =  By.xpath("//*[text()='Alerts, Frame & Windows']");
    public static final By BrowserWindows = By.xpath("//li[@id=\"item-0\"]//span[text()='Browser Windows']");

    public static final By Frames = By.xpath("//li[@id=\"item-2\"]//span[text()='Frames']");
    public static final By NestedFrames = By.xpath("//li[@id=\"item-3\"]//span[text()='Nested Frames']");


    
    // Browser Windows
    public static final By newTab = By.cssSelector("#tabButton");
    public static final By newWindow = By.cssSelector("#windowButton");
    public static final By newWindowMessage = By.cssSelector("#messageWindowButton");

    
    // Alerts
    public static final By Alerts = By.xpath("//li[@id=\"item-1\"]//span[text()='Alerts']");
    public static final By AlertButton = By.id("alertButton");
    public static final By TimerAlertButton = By.cssSelector("#timerAlertButton");
    public static final By ConfirmButton = By.cssSelector("#confirmButton");
    public static final By PromptButton = By.cssSelector("#promtButton");
    public static final By ConfirmResult = By.id("confirmResult");
    public static final By PromptResult = By.id("promptResult");

    // Frames
    public static final By frame1 = By.id("frame1");
    public static final By frame2 = By.id("frame2");

    // Nested Frames
    public static final By parentFrameBody = By.tagName("body");

    // Modal Dialog
    public static final By ModalDialogs = By.xpath("//li[@id=\"item-4\"]//span[text()='Modal Dialogs']");
    public static final By smallModalBtn = By.cssSelector("#showSmallModal");
    public static final By closeSmallModalBtn = By.cssSelector("#closeSmallModal");
    public static final By largeModalBtn = By.cssSelector("#showLargeModal");
    public static final By closeLargeModalBtn = By.cssSelector("#closeLargeModal");
    public static final By smallModalTitle = By.cssSelector("#example-modal-sizes-title-sm");



    //public static final By WidgetsClick = By.xpath("//div[@class='home-body']/div[@class='category-cards']/div[4]");
    public static final By WidgetsClick =  By.xpath("//*[text()='Widgets']");
    public static final By AccordianButton=By.xpath("//li[@id=\"item-0\"]//span[text()='Accordian']");
    public static final By AccordionHeading1 = By.cssSelector("#section2Heading");

    public static final By AutoCompleteButton=By.xpath("//li[@id=\"item-1\"]//span[text()='Auto Complete']");
    public static final By MultiColorInput = By.cssSelector("#autoCompleteMultipleInput");
    public static final By SingleColorInput = By.cssSelector("#autoCompleteSingleInput");

    // Date Picker
    public static final By DatePicker=By.xpath("//li[@id=\"item-2\"]//span[text()='Date Picker']");
    public static final By DateInput = By.cssSelector("#datePickerMonthYearInput");
    public static final By DateTimeInput = By.cssSelector("#dateAndTimePickerInput");

    public static final By Slider=By.xpath("//li[@id=\"item-3\"]//span[text()='Slider']");
    public static final By SliderHandle = By.className("range-slider");

    public static final By Progress=By.xpath("//li[@id=\"item-4\"]//span[text()='Progress Bar']");
    public static final By ProgressstartStopButton = By.cssSelector("#startStopButton");
    public static final By RestartButton = By.cssSelector("#resetButton");

    public static final By TabButton=By.xpath("//li[@id=\"item-5\"]//span[text()='Tabs']");

    public static final By MenuButton=By.xpath("//li[@id=\"item-7\"]//span[text()='Menu']");
    public static final By MainMenuItem = By.xpath("//a[text()='Main Item 2']");
    public static final By MenuSelectButton=By.xpath("//li[@id=\"item-8\"]//span[text()='Select Menu']");
    

   // public static final By InteractionsButton = By.xpath("//div[@class='home-body']/div[@class='category-cards']/div[5]");
    public static final By InteractionsButton =  By.xpath("//*[text()='Interactions']");
    public static final By SortableButton=By.xpath("//li[@id=\"item-0\"]//span[text()='Sortable']");
    public static final By GridButton  = By.xpath("//*[@id=\"demo-tab-grid\"]");
    public static final By SelectableButton=By.xpath("//li[@id=\"item-1\"]//span[text()='Selectable']");
    public static final By ResizableButton=By.xpath("//li[@id=\"item-2\"]//span[text()='Resizable']");
    public static final By DroppableButton=By.xpath("//li[@id=\"item-3\"]//span[text()='Droppable']");
    public static final By DragabbleButton=By.xpath("//li[@id=\"item-4\"]//span[text()='Dragabble']");

  //  public static final By BookStoreApplicationButton = By.xpath("//div[@class='home-body']/div[@class='category-cards']/div[6]");
    public static final By BookStoreApplicationButton = By.xpath("//*[text()='Book Store Application']");
    public static final By Login=By.xpath("//li[@id=\"item-0\"]//span[text()='Login']");
    
    public static final By Username=By.cssSelector("#userName");
    public static final By Password= By.cssSelector("#password");
    public static final By LoginButton= By.cssSelector("#login");
    
    
    public static final By CreateNewUser= By.cssSelector("#newUser");
    public static final By newUserfirstname=By.cssSelector("#firstname");
    public static final By newUserlastname=By.cssSelector("#lastname");
    public static final By newUsername= By.cssSelector("#userName");
    public static final By newPassword=By.cssSelector("#password");
    public static final By newRegister = By.cssSelector("#register");
    public static final By GoToLogin = By.cssSelector("#gotologin");
    
}
  