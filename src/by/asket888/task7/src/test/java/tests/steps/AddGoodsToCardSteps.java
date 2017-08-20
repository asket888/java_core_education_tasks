package tests.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tests.BaseTest;

public class AddGoodsToCardSteps extends BaseTest {

    String goodsInSearchTitle;
    String goodsInCartTitle;

    @Given("^I set search request \"([^\"]*)\"$")
    public void iSetSearchRequest(String searchRequest){
        driver.findElement(By.xpath(searchInputLocator)).sendKeys(searchRequest);
        driver.findElement(By.xpath(searchButtonLocator)).click();
    }

    @And("^I open first in query good's page$")
    public void iOpenFirstGoodInQuery() {
        goodsInSearchTitle = driver.findElement(By.xpath(firstElementInSearchQueryTitleLocator)).getAttribute("title");
        driver.findElement(By.xpath(firstElementInSearchQueryTitleLocator)).click();
    }

    @When("^I click Add_To_Cart button$")
    public void iClickAddToCardButton(){
        driver.findElement(By.xpath(addToCardButtonLocator)).click();
    }

    @Then("^I transfer to cart page$")
    public void goodDisplaysInMyCart(){
        String pageTitle = driver.findElement(By.xpath(pageTitleLocator)).getText();
        Assert.assertEquals(pageTitle, "Your eBay Shopping Cart");
    }

    @And("^selected good displays in my cart$")
    public void iCheckGoodsTitle() {
        goodsInCartTitle = driver.findElement(By.xpath(goodsInCartTitleLocator)).getAttribute("title");
        Assert.assertTrue(goodsInSearchTitle.contains(goodsInCartTitle));
    }
}
