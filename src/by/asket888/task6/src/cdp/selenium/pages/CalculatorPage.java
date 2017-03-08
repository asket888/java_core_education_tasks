package cdp.selenium.pages;

import cdp.selenium.util.JSShowAlertUtil;
import cdp.selenium.util.WaitForManualChecking;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorPage extends BasePage {

    public CalculatorPage(WebDriver driver) {
        BasePage.driver = driver;
        PageFactory.initElements(BasePage.driver, this);
    }

    @FindBy(xpath = CALCULATOR_PAGE_TITLE_LOCATOR)
    private WebElement calculatorPageTitle;

    public boolean checkPageName() {

        return calculatorPageTitle.isEnabled();
    }

    public WebElement getPageName() {

        return calculatorPageTitle;
    }

    public void showAlert() {

        JSShowAlertUtil.showAlertJS();
        new WaitForManualChecking().sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }


    public void checkButtonByContext() {

        By pageTitle = By.xpath(CALCULATOR_PAGE_TITLE_LOCATOR);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(pageTitle));

        new Actions(driver).contextClick(driver.findElement(pageTitle)).build().perform();
    }
}
