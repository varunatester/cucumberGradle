package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;


public class SearchResultPage {

    WebDriver driver;
    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    By breadcrumbs = By.id("breadcrumbs");
    By listingViewActive = By.cssSelector(".listing-view-link.is-active");
    By listingViewDisabled = By.className("listing-view-link");

    public void user_navigated_to_searchTerm_page(String searchTermInput) throws InterruptedException {
        int size = driver.findElement(breadcrumbs).findElements(By.linkText("Portsmouth")).size();
        assertEquals(size, 1);
    }


    public void user_view_pageviewas(String defaultView) {
        driver.findElement(listingViewActive).getText().equals(defaultView);
    }

    public void user_disabled_pagevieware() {
        List<WebElement> disabledElements = getDisabledViewElements();
        assertEquals(disabledElements.size(),2);
    }

    private void clickViewAs(List<WebElement> disabledElements,String viewToBeClicked) {
        for (WebElement disabledElement : disabledElements) {
            if(disabledElement.getText().equals(viewToBeClicked))
                disabledElement.click();
        }
    }

    private List<WebElement> getDisabledViewElements() {
        return driver.findElement(By.cssSelector(".listing-results-utils-view.clearfix.bg-muted")).findElement(By.className("fright")).findElements(By.tagName("a"));
    }

    public void user_click_on_view_as(String viewToBeClicked) {
        List<WebElement> disabledElements = getDisabledViewElements();
        clickViewAs(disabledElements,viewToBeClicked);
    }
}
