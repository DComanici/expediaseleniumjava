package com.expedia.stepDefinitions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.expedia.appsCommon.PageInitializer;
import com.expedia.pages.FlightsPage;
import com.expedia.utils.CucumberLogUtils;
import com.expedia.web.JavascriptUtils;
import com.expedia.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightsStepDef extends PageInitializer {
    FlightsPage flightsPage = new FlightsPage();

    @Given("a user is on the Expedia home page {string}")
    public void a_user_is_on_the_Expedia_home_page(String url) {
        WebDriverUtils.driver.get(url);

    }

    @When("user navigates to Flights and clicks on {string} box")
    public void user_navigates_to_Flights_and_clicks_on_box(String oneWay) throws InterruptedException, IOException {
        flightsPage.flights.click();
        Thread.sleep(5000);
        flightsPage.oneWayBtn.click();
        // CucumberLogUtils.logExtentScreenshot();
        // CucumberLogUtils.logScreenShot();

    }

    @When("user enters airport name {string} in the “Leaving from” box")
    public void user_enters_airport_name_in_the_Leaving_from_box(String airport) throws InterruptedException, IOException {
        Thread.sleep(10000);
        // CucumberLogUtils.logExtentScreenshot();
        // CucumberLogUtils.logScreenShot();

        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Stop using it too much
        // Thread.sleep(8000);

        // Explicit wait
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        // wait.until(ExpectedConditions.visibilityOf(flightsPage.airportBox));

    }

    @Then("user enters {string} in {string} box")
    public void user_enters_in_box(String city, String goingTo) throws InterruptedException, IOException {
        Thread.sleep(10000);
        // CucumberLogUtils.logExtentScreenshot();
        // CucumberLogUtils.logScreenShot();

    }

    @Then("clicks on the date {string} in the {string} box")
    public void clicks_on_the_date_in_the_box(String date, String departing) throws InterruptedException, IOException {
        flightsPage.dateBox.click();
        flightsPage.dateBtn.click();
        // CucumberLogUtils.logExtentScreenshot();
        // CucumberLogUtils.logScreenShot();
        JavascriptUtils.clickByJS(flightsPage.dateBtn);
        Thread.sleep(5000);
        flightsPage.doneBtn.click();

    }

    @Then("user selects {string} in the {string} box")
    public void user_selects_in_the_box(String traveler, String travelerBox) throws IOException {
        flightsPage.travelerBtn.click();
        flightsPage.travelerBox.click();
        // CucumberLogUtils.logExtentScreenshot();
        // CucumberLogUtils.logScreenShot();

    }

    @Then("clicks on {string} button")
    public void clicks_on_button(String searchButton) throws InterruptedException, IOException {
        flightsPage.searchBtn.click();
        Thread.sleep(5000);
        // CucumberLogUtils.logScreenShot();
        // CucumberLogUtils.logExtentScreenshot();
        

    }

    @Then("user is navigated to the dashboard page")
    public void user_is_navigated_to_the_dashboard_page() throws IOException {
        boolean expediaImg = flightsPage.expediaImgBtn.isDisplayed();
        Assert.assertTrue(expediaImg);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @When("user navigates to the Flights Page and clicks on {string}")
    public void user_navigates_to_the_Flights_Page_and_clicks_on(String roundTrip) throws IOException {
        flightsPage.flights.click();
        flightsPage.roundTrip.click();
        // CucumberLogUtils.logExtentScreenshot();
        // CucumberLogUtils.logScreenShot();

    }

    @Then("clicks on the departing date {string} in the {string} box")
    public void clicks_on_the_departing_date_in_the_box(String departingDate, String departingBox)
            throws InterruptedException, IOException {
        flightsPage.departingBox.click();
        JavascriptUtils.clickByJS(flightsPage.departingDate);
        Thread.sleep(2000);
        // CucumberLogUtils.logScreenShot();
        // CucumberLogUtils.logExtentScreenshot();
        

    }

    @Then("clicks on the returning date {string} in the {string} box")
    public void clicks_on_the_returning_date_in_the_box(String returnDate, String returnBox)
            throws InterruptedException, IOException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOf(flightsPage.returnDate));
        flightsPage.doneSecond.click();
        // CucumberLogUtils.logScreenShot();
        // CucumberLogUtils.logExtentScreenshot();
        

    }

    @Then("user is unable to book flights")
    public void user_is_unable_to_book_flights() throws InterruptedException, IOException {
        boolean resultThird = flightsPage.resultThird.isDisplayed();
        Assert.assertTrue(resultThird);
        Thread.sleep(5000);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        

    }
}
