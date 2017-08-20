package pages;

import locators.GoodPageLocators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoodPage implements GoodPageLocators {

    @FindBy(xpath = addToCardButtonLocator)
    WebElement addToCardButton;

    @FindBy(xpath = pageTitleLocator)
    WebElement pageTitle;
}
