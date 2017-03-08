package cdp.selenium.tests;

import cdp.selenium.pages.CalculatorPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CalculatorLinkTest_NO_PO {

    private static final String START_URL = "https://your_url";
    private static final String LOGIN_INPUT = "//*[@id='usernameInput']";
    private static final String PASSWORD_INPUT = "//*[@id='passwordInput']";
    private static final String LOGIN = "Administrator";
    private static final String PASSWORD = "Password";
    private static final String LOGIN_BUTTON = "//*[@id='login']";
    private static final String GO_TO_CALCULATOR_PAGE = "//*[@id='calculator']";
    private static final String CALCULATOR_PAGE_TITLE = "//*[text() = 'Калькулятор функции трансплантата почки']";

    protected static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            setUp();
        }
        return driver;}

    @BeforeClass
    protected void setUrl() {
        getDriver().get(START_URL);
        System.out.println("Authorization page opened successfully");
    }

    @BeforeClass
    protected static void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(START_URL);
        System.out.println("Authorization page opened successfully");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void login(String login, String password) {

        // Find the text input element by its id and type login
        driver.findElement(By.xpath(LOGIN_INPUT)).sendKeys(login);
        // Find the text input element by its id and type password
        driver.findElement(By.xpath(PASSWORD_INPUT)).sendKeys(password);
        // Click enter button
        driver.findElement(By.xpath(LOGIN_BUTTON)).click();
    }

    // Go to Calculator page
    public void goToCalculatorPage() {
        driver.findElement(By.xpath(GO_TO_CALCULATOR_PAGE)).click();
    }

    private boolean isElementPresent (By by) {
        return driver.findElement(by).isEnabled();
    }

    @Test(description = "Check calculator page link")
    public void testJSImplementation() {

        login(LOGIN, PASSWORD);
        System.out.println("Successful authorization");
        goToCalculatorPage();
        System.out.println("Calculator page opened successfully");
        Assert.assertTrue(isElementPresent(By.xpath(CALCULATOR_PAGE_TITLE)), "Looks like the link works incorrectly!");

        // Math random By JS implementation
        PageFactory.initElements(driver, CalculatorPage.class).showAlert();
        System.out.println("JavaScript successfully implemented");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    protected void shutDown() {
        driver.quit();
    }
}
