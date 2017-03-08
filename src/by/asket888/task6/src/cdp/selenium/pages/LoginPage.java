package cdp.selenium.pages;

import cdp.selenium.business_objects.User;
import cdp.selenium.util.JSBorderGroundUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        BasePage.driver = driver;
        PageFactory.initElements(BasePage.driver, this);
    }

    @FindBy(id = LOGIN_INPUT_LOCATOR)
    private WebElement loginInput;

    @FindBy(id = PASSWORD_INPUT_LOCATOR)
    private WebElement passwordInput;

    @FindBy(id = LOGIN_BUTTON_LOCATOR)
    private WebElement loginButton;

    public void loginToApplication(String login, String password) throws InterruptedException {

        JSBorderGroundUtil.highlightWithJavaScript(loginInput);
        loginInput.sendKeys(login);
        JSBorderGroundUtil.highlightWithJavaScript(passwordInput);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public void loginToApplication(User user) throws Exception {

        JSBorderGroundUtil.highlightWithJavaScript(loginInput);
        loginInput.sendKeys(user.getLogin());
        JSBorderGroundUtil.highlightWithJavaScript(passwordInput);
        passwordInput.sendKeys(user.getPassword());
        loginButton.click();
    }
}
