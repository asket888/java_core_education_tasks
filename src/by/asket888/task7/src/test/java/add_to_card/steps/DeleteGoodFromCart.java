package add_to_card.steps;

import add_to_card.locators.AddToCardLocator;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.BaseDriver;

public class DeleteGoodFromCart extends BaseDriver implements AddToCardLocator{

    @Given("^I go to main page$")
    public void iGoToMainPage() {
        driver.get("http://ebay.com");
    }

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
        Assert.assertTrue(driver.getPageSource().contains("Ваша корзина пуста"));
    }
}
