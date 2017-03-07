package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SearchResultPage;
import util.DriverFactory;


public class SearchResultSteps  extends DriverFactory{

    @Then("^user navigates to searchPageWith([^\"]*) (.*)$")
    public void user_navigated_to_searchTerm_page(String searchTermInput,String defaultView) throws Throwable {
        new SearchResultPage(driver).user_navigated_to_searchTerm_page(searchTermInput);
        new SearchResultPage(driver).user_view_pageviewas(defaultView);
        new SearchResultPage(driver).user_disabled_pagevieware();
    }

    @When("^user click on view as([^\"]*)$")
    public void userClickOnViewAs(String viewToBeClicked) throws Throwable {
       new SearchResultPage(driver).user_click_on_view_as(viewToBeClicked);
    }

    @When("^view enabled is([^\"]*)$")
    public void viewEnabledIsGridView(String enabledView) throws Throwable {
        new SearchResultPage(driver).user_view_pageviewas(enabledView);
    }
}
