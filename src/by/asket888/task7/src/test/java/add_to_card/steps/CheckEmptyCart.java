package add_to_card.steps;

import add_to_card.locators.AddToCardLocator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.BaseDriver;

public class CheckEmptyCart extends BaseDriver implements AddToCardLocator {

    @Given("^I go to shop's main page$")
    public void iGoToMainPage() {
        driver.get("http://ebay.com");
    }

    @When("^I open my cart's page$")
    public void iOpenMyCartPage() {
        driver.findElement(By.xpath(cartButtonLocator)).click();
    }

    @Then("^I got a message that one is empty$")
    public void iGotAMessageThatCartIsEmpty(){
        Assert.assertTrue(driver.getPageSource().contains("Ваша корзина пуста"));
    }
}
