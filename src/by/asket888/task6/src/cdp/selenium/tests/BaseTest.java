package cdp.selenium.tests;

import cdp.selenium.business_objects.Start_Url;
import cdp.selenium.business_objects.User;
import cdp.selenium.pages.LoginPage;
import cdp.selenium.pages.MainMenuPage;
import cdp.selenium.patterns.Singleton;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseTest{

    protected String START_URL = new Start_Url().getUrl();

    public BaseTest() throws Exception {
    }

    @BeforeClass ()
    protected void setUrl() {
        Singleton.getDriverSingleton().get(START_URL);
        System.out.println("Authorization page opened successfully");
    }

    @BeforeClass (dependsOnMethods = "setUrl")
    public void login() {
        // Login in application using user-defined method
        try {
            new LoginPage(Singleton.getDriverSingleton()).loginToApplication(new User());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Successful authorization");
    }

//    @BeforeClass (description = "Start firefox")
//    protected static void setUpFirefox() {
//
//        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//        capabilities.setPlatform(Platform.WINDOWS);
//        try {
//            driver = new RemoteWebDriver(new URL("https://your_url"), capabilities);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @BeforeClass (description = "Start chrome")
//    protected static void setUpOpera() {
//
//        DesiredCapabilities capabilities = DesiredCapabilities.opera();
//        capabilities.setPlatform(Platform.WINDOWS);
//        try {
//            driver = new RemoteWebDriver(new URL("https://your_url"), capabilities);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @BeforeClass (description = "Start chrome under Windows")
//    protected static void setUpChromeWindows() {
//
//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        capabilities.setPlatform(Platform.WINDOWS);
//        try {
//            driver = new RemoteWebDriver(new URL("https://your_url"), capabilities);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @BeforeClass (description = "Start chrome under Linux")
//    protected static void setUpChromeLinux() {
//
//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        capabilities.setPlatform(Platform.LINUX);
//        try {
//            driver = new RemoteWebDriver(new URL("https://your_url"), capabilities);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//    }

    @AfterMethod
    public  void goToCatalogPage() {

        // Go to Catalog page
        new MainMenuPage(Singleton.getDriverSingleton()).goToCatalogPage();
        System.out.println("Method finished successfully");
    }

    @AfterClass
    protected void shutDown() {
        Singleton.getDriverSingleton().quit();
    }
}
