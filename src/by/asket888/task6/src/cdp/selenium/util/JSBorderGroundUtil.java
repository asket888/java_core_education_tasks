package cdp.selenium.util;

import cdp.selenium.patterns.Singleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JSBorderGroundUtil {

    public static void highlightWithJavaScript(WebElement element) throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) Singleton.getDriverSingleton();
        js.executeScript("arguments[0].style.border='3px solid red'", element);
    }
}
