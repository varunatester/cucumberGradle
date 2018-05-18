package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class BaseSteps {

    private WebDriver driver;


    @Before
    public void beforeScenario() {
        driver = new DriverFactory().getDriver();
    }

    @After
    public void afterScenario() {
        new DriverFactory().destroyDriver();
    }

    @Given("^the user is on home page$")
    public void theUserIsOnHomePage() throws Throwable {
        driver.get("https://www.zoopla.co.uk");
        driver.manage().window().maximize();
    }

}
