package tests;

import locators.*;
import org.junit.BeforeClass;
import config.BaseDriver;

public class BaseTest extends BaseDriver implements CartPageLocators, GoodPageLocators, MainPageLocators {

    @BeforeClass()
    protected void setUrl() {
        BaseDriver.getDriver().get("http://www.ebay.com/");
    }
}
