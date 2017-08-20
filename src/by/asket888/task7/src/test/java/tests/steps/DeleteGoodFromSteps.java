package tests.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tests.BaseTest;

public class DeleteGoodFromSteps extends BaseTest {

    @Given("^I go to main page$")
    public void iGoToMainPage() {}

    @When("^I open my cart$")
    public void iOpenMyCartPage() {
        driver.findElement(By.xpath(cartButtonLocator)).click();
    }

    @And("^click Delete button$")
    public void iClickDeleteButton() {
        driver.findElement(By.xpath(deleteButtonLocator)).click();
    }

    @Then("^I got a message that cart is empty$")
    public void iGotAMessageThatCartIsEmpty(){
        Assert.assertTrue(driver.getPageSource().contains("Your shopping cart is empty"));
    }
}
