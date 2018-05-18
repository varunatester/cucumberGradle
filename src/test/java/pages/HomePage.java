package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage  {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By searchTab = By.id("search-tabs-to-rent");
    By searchTerm = By.id("search-input-location");
    By minPrice = By.id("rent_price_min_per_month");
    By maxPrice = By.id("rent_price_max_per_month");
    By propertyType = By.id("property_type");
    By minBed = By.id("beds_min");
    By searchSubmit = By.id("search-submit");

    public void user_clicks_the_search_tab() throws Throwable {
        driver.findElement(searchTab).click();
    }

    public void user_provides_the_search_term_as(String searchInput) {
        driver.findElement(searchTerm).sendKeys(searchInput);
    }

    public void user_provides_the_min_price_as(String minPriceInput) {

        new Select(driver.findElement(minPrice)).selectByValue(minPriceInput);
    }

    public void user_provides_the_max_price_as(String maxPriceInput) {
        new Select(driver.findElement(maxPrice)).selectByValue(maxPriceInput);
    }

    public void user_provides_the_property_type_as(String propertyTypeInput) {
        new Select(driver.findElement(propertyType)).selectByValue(propertyTypeInput);
    }

    public void user_provides_the_min_bed_as(String minBedInput) throws InterruptedException {
        Thread.sleep(300);
        new Select(driver.findElement(minBed)).selectByValue(minBedInput);
    }

    public void user_clicks_the_search_button() {
        driver.findElement(searchSubmit).click();
    }
}
