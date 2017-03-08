package cdp.selenium.patterns.factoryMethod;

import org.openqa.selenium.WebDriver;

public abstract class FactoryMethod {

    protected WebDriver driver;

    public abstract WebDriver FactoryMethod();
}
