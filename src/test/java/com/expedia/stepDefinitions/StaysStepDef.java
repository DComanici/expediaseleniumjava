package com.expedia.stepDefinitions;

import java.io.IOException;
import java.util.Set;


import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.expedia.appsCommon.PageInitializer;
import com.expedia.pages.HotelsPage;
import com.expedia.stepImplimentation.StaysStepsImpl;
import com.expedia.utils.CucumberLogUtils;
import com.expedia.web.JavascriptUtils;
import com.expedia.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StaysStepDef extends PageInitializer {

    public static String baseWindow;
    public static Set<String> windowList;

    @Given("user is on the Expedia home page {string}")
    public void user_is_on_the_Expedia_home_page(String url) throws IOException {
        WebDriverUtils.driver.get(url);
        CucumberLogUtils.logExtentScreenshot();
        // CucumberLogUtils.logScreenShot();
    }

    @When("user navigates to Stays and types {string}")
    public void user_navigates_to_Stays_and_types(String goingToDestination) throws InterruptedException {

        StaysStepsImpl.goingTo(goingToDestination);
    }

    @When("user selects {string} in check-in and {string} in check-out")
    public void user_selects_in_check_in_and_in_check_out(String checkInDate, String checkOutDate)
            throws InterruptedException, IOException {

        StaysStepsImpl.checkInCheckOut(checkInDate, checkOutDate);
        CucumberLogUtils.logExtentScreenshot();
        // CucumberLogUtils.logScreenShot();
    }

    // MANUAL VERIFICATION is required right after click_Search step that is why
    // Thread.sleep is so long
    @When("user clicks Search")
    public void user_clicks_Search() throws InterruptedException {
        staysPage.searchButton.click();
        Thread.sleep(18000);
    }

    @Then("user is shown an error")
    public void user_is_shown_an_error() throws IOException {

        Assert.assertTrue(StaysStepsImpl.isDesiredTextDisplayed(staysPage.d2Error));
        CucumberLogUtils.logExtentScreenshot();
        // CucumberLogUtils.logScreenShot();
    }

    @Then("the Hotel Search page is displayed")
    public void the_Hotel_Search_page_is_displayed() throws IOException {
        Assert.assertTrue(StaysStepsImpl.isDesiredTextDisplayed(staysPage.searchProperties));
        CucumberLogUtils.logExtentScreenshot();
    }

    @When("user clicks on {string} hotel")
    public void user_clicks_on_hotel(String chosenHotel) throws InterruptedException, IOException {
        // getting main window handle
        baseWindow = WebDriverUtils.driver.getWindowHandle();
        WebElement element = HotelsPage.viewHotel(chosenHotel);   
        JavascriptUtils.scrollIntoView(element);
        Thread.sleep(5000);
        CucumberLogUtils.logExtentScreenshot();
        JavascriptUtils.clickByJS(element);
        Thread.sleep(5000);

        // getting all window handles
        windowList = WebDriverUtils.driver.getWindowHandles();

    }

    @Then("hotel page {string} is displayed and user clicks on amenities")
    public void hotel_page_is_displayed_and_user_clicks_on_amenities(String hotelPageTitle)
            throws InterruptedException, IOException {
        // Swith to new tab using a forloop
        for (String tab : windowList) {
            if (tab != baseWindow) {
                WebDriverUtils.driver.switchTo().window(tab);
            }

        }

        String actualHotelTitle = WebDriverUtils.driver.getTitle();
        Assert.assertEquals(actualHotelTitle, hotelPageTitle);
        hotelsPage.amenities.click();    
        Thread.sleep(2000);
        CucumberLogUtils.logExtentScreenshot();
    }

    

    @Then("user switches back to Hotels Search tab")
    public void user_switches_back_to_Hotels_Search_tab() throws InterruptedException {
    
       WebDriverUtils.driver.switchTo().window(baseWindow);
       Thread.sleep(2000);
    }

}
