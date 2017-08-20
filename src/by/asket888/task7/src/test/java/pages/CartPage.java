package pages;

import locators.CartPageLocators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage implements CartPageLocators {

    @FindBy(xpath = cartButtonLocator)
    WebElement cartButton;

    @FindBy(xpath = deleteButtonLocator)
    WebElement deleteButton;

    @FindBy(xpath = CartPageLocators.goodsInCartTitleLocator)
    WebElement goodsInCartTitle;
}
