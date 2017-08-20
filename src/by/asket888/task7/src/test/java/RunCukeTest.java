import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import config.BaseDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        plugin = {"pretty", "json:target/Cucumber.json",
                "html:target/cucumber-html-report"
        }
)

public class RunCukeTest {

    @BeforeClass
    public static void initSelenium(){
        BaseDriver.getDriver();
    }
    @AfterClass
    public static void closeSelenium(){
        BaseDriver.close();
    }

}
