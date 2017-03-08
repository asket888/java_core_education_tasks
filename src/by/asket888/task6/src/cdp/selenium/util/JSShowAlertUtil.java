package cdp.selenium.util;

import cdp.selenium.patterns.Singleton;
import org.openqa.selenium.JavascriptExecutor;

public class JSShowAlertUtil {

//    private static WebDriver driver = CalculatorLinkTest_NO_PO.getDriver();

    public static void showAlertJS() {

        JavascriptExecutor js = (JavascriptExecutor) Singleton.getDriverSingleton();
        js.executeScript("function showAlert() {alert('success JS implementation'); }; showAlert()");
    }
}
