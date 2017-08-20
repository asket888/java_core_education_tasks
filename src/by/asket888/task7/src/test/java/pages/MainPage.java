package pages;

import locators.MainPageLocators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage implements MainPageLocators {

    @FindBy(xpath = searchInputLocator)
    WebElement searchInput;

    @FindBy(xpath = searchButtonLocator)
    WebElement searchButton;

    @FindBy(xpath = firstElementInSearchQueryTitleLocator)
    WebElement firstElementInSearchQueryTitle;
}
