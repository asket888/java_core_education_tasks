package cdp.selenium.patterns.factoryMethod;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestFactoryMethod {

    @Test
    public void testChromeDriverFactoryMethod() {

        FactoryMethod factoryMethod = new ChromeFactoryMethod();

        WebDriver driver = factoryMethod.FactoryMethod();
        driver.navigate().to("https://your_url");
    }
}
