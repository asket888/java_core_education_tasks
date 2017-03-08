package cdp.selenium.tests;

import cdp.selenium.locators.CalculatorLocator;
import cdp.selenium.pages.CalculatorPage;
import cdp.selenium.pages.MainMenuPage;
import cdp.selenium.patterns.Singleton;
import cdp.selenium.util.WaitForManualChecking;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CalculatorLinkTest_YES_PO extends BaseTest implements CalculatorLocator {

    public CalculatorLinkTest_YES_PO() throws Exception {
        super();
    }

//    @Parameters({"loginParam", "passwordParam"})
//    @Test
//    public void login(String loginParam, String passwordParam) {
//        // Login in application using user-defined method
//        try {
//            new LoginPage(driver).loginToApplication(loginParam, passwordParam);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Successful authorization");
//    }

    @Test(priority = 1, description = "Check filter uppercase input")
    public void testFilterActions() {

        // Create new Action which types upperCase symbols using Keyboard 'Shift' button
        new Actions(Singleton.getDriverSingleton()).click
                (new MainMenuPage(Singleton.getDriverSingleton()).getSurnameInput()).
                keyDown(Keys.SHIFT).sendKeys("qwerty").keyUp(Keys.SHIFT).build().perform();
        new WaitForManualChecking().sleep(3000);
    }

    @Test(priority = 2, description = "Check calculator page link")
    public void testCalculatorActions() {

        // Go to Calculator page
        new MainMenuPage(Singleton.getDriverSingleton()).goToCalculatorPage();

        Assert.assertTrue(new CalculatorPage(Singleton.getDriverSingleton()).checkPageName(), "Looks like the link works incorrectly!");
        new WaitForManualChecking().sleep(3000);
    }

    @Test(priority = 3, description = "Test calculator Action by Context")
    public void testCalculatorActionByContext() {

        // Go to Calculator page
        new MainMenuPage(Singleton.getDriverSingleton()).goToCalculatorPage();

        // Check button by its context
        new CalculatorPage(Singleton.getDriverSingleton()).checkButtonByContext();
        new WaitForManualChecking().sleep(3000);
    }

    @Test(priority = 4, description = "Test calculator JS implementation")
    public void testCalculatorJSImplementation() {

        // Go to Calculator page
        new MainMenuPage(Singleton.getDriverSingleton()).goToCalculatorPage();

        // Show alert By JS implementation
        new CalculatorPage(Singleton.getDriverSingleton()).showAlert();
        new WaitForManualChecking().sleep(3000);
    }
}
