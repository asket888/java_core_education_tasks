package cdp.selenium.patterns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Singleton {

    private static WebDriver driver;

    private Singleton() {}

    private static void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static WebDriver getDriverSingleton() {
        if (driver == null) {
            setUp();
        }
        return driver;}
}
