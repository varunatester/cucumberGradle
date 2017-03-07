package steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import util.DriverFactory;

import java.util.List;


public class HomePageSteps extends DriverFactory {

    @When("^user clicks the rent tab$")
    public void userClicksTheRentTab() throws Throwable {
        new HomePage(driver).user_clicks_the_search_tab();
    }

    @And("^user provides the details as follows:$")
    public void userProvidesTheDetailsAsFollows(List<SearchDetails> searchDetailsList) throws Throwable {
        SearchDetails searchDetails = searchDetailsList.get(0);
        new HomePage(driver).user_provides_the_search_term_as(searchDetails.searchTerm);
        new HomePage(driver).user_provides_the_min_price_as(searchDetails.minPrice);
        new HomePage(driver).user_provides_the_max_price_as(searchDetails.maxPrice);
        new HomePage(driver).user_provides_the_property_type_as(searchDetails.propertyType);
        new HomePage(driver).user_provides_the_min_bed_as(searchDetails.minBed);
    }

    @And("^user clicks the search button$")
    public void userClicksTheSearchButton() throws Throwable {
        new HomePage(driver).user_clicks_the_search_button();
    }

    private class SearchDetails {
        public String searchTerm;
        public String minPrice;
        public String maxPrice;
        public String propertyType;
        public String minBed;
    }
}
