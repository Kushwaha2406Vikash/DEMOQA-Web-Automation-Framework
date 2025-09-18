# DEMOQA Web Automation Framework

🚀 Automated UI testing framework for the **[DEMOQA](https://demoqa.com/)** website. This project is built with **Java, Maven, Selenium, and TestNG**, using the **Page Object Model (POM)** design pattern. It reduces manual testing effort by **60%**, optimizes test scripts for reusability, and ensures faster, more reliable test execution.

-----

## 📌 Tech Stack

  * **Java** – The core language for automation.
  * **Maven** – Manages builds and dependencies.
  * **Selenium WebDriver** – Handles UI automation.
  * **TestNG** – Used for test execution, grouping, and reporting.
  * **Page Object Model (POM)** – Provides a modular and reusable design pattern.

-----

## 📂 Project Structure

```yaml
webautomation/
│── src/main/java/webselenium/ # Core framework classes
│── src/test/java/ # Test scripts
│ ├── constant/ # Constants used across tests
│ ├── locator/ # Element locators
│ ├── pages/ # Page Object Model classes
│ ├── testcase/ # TestNG test cases
│ ├── utils/ # Utility classes (driver factory, helpers)
│── test-output/ # TestNG reports
│── pom.xml # Maven dependencies
│── .gitignore # Ignored files
```

-----

## ⚡ Key Features

  * ✅ **Reusable Page Object Model (POM)** design.
  * ✅ **TestNG Groups** (`@Test(groups = {"smoke"})`) for flexible execution.
  * ✅ **Cross-browser compatibility** (extendable).
  * ✅ **Centralized Driver Management**.
  * ✅ **HTML Reports** via TestNG.
  * ✅ **60% reduction** in manual testing effort.

-----

## 🛠️ Setup & Installation

1.  **Clone the repo**

    ```bash
    git clone https://github.com/<your-username>/DEMOQA-Web-Automation-Framework.git
    cd DEMOQA-Web-Automation-Framework/webautomation
    ```

2.  **Install dependencies**

    ```bash
    mvn clean install
    ```

3.  **Run tests**

    ```bash
    mvn test
    ```

### 🧪 Sample Test (TestNG)

```java
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
```

-----

## 📊 Reports

After execution, TestNG reports can be found in:

```bash
/test-output/index.html
```

Open this file in a browser to view the test execution details.

-----

## 👨‍💻 Author

**Vikash Kushwaha** Software Engineer | Automation Engineer

-----

## 🌟 Contributing

Feel free to fork this repo and raise a pull request (PR) for improvements, optimizations, or new feature additions.

-----

## 📜 License

This project is licensed under the **[MIT License](https://opensource.org/licenses/MIT)**.

Would you like me to also **add GitHub badges** at the top (Java, Selenium, Maven, TestNG, GitHub Actions CI) so your repo looks more professional to recruiters?
