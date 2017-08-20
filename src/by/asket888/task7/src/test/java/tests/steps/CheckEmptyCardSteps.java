package tests.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tests.BaseTest;

public class CheckEmptyCardSteps extends BaseTest {

    @Given("^I go to shop's main page$")
    public void iGoToMainPage() {}

    @When("^I open my cart's page$")
    public void iOpenMyCartPage() {
        driver.findElement(By.xpath(cartButtonLocator)).click();
    }

    @Then("^I got a message that one is empty$")
    public void iGotAMessageThatCartIsEmpty(){
        Assert.assertTrue(driver.getPageSource().contains("Your shopping cart is empty"));
    }
}
