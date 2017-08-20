package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver {

    public static WebDriver driver;

    private static void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:/WORK/JAVA_Projects/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://ebay.com");
    }

    public static WebDriver getDriver() {

        if (driver == null) {
            setUp();
        }
        return driver;
    }

    public static void close(){
        try {
            driver.quit();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally{
            driver = null;
        }
    }
}
