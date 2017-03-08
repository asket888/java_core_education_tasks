package cdp.selenium.pages;

import cdp.selenium.locators.CalculatorLocator;
import cdp.selenium.locators.LoginLocator;
import cdp.selenium.locators.MainMenuLocator;
import org.openqa.selenium.WebDriver;

public class BasePage implements CalculatorLocator, LoginLocator, MainMenuLocator {

    protected static WebDriver driver;
}
