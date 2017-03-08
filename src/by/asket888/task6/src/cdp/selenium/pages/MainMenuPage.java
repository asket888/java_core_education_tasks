package cdp.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainMenuPage extends BasePage {

    public MainMenuPage(WebDriver driver) {
        BasePage.driver = driver;
        PageFactory.initElements(BasePage.driver, this);
    }

    @FindBy(name = SURNAME_INPUT_LOCATOR)
    private WebElement surnameInput;

    @FindBy(id = CALCULATOR_PAGE_BUTTON_LOCATOR)
    private WebElement calculatorPageButton;

    @FindBy(id = CATALOG_PAGE_BUTTON_LOCATOR)
    private WebElement catalogPageButton;

    public WebElement getSurnameInput() {
        return surnameInput;
    }

    public void goToCalculatorPage() {

        calculatorPageButton.click();
        System.out.println("Calculator page opened successfully");
    }

    public void goToCatalogPage() {

        catalogPageButton.click();
    }
}
