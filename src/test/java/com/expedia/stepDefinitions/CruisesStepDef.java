package com.expedia.stepDefinitions;

import org.junit.Assert;
import com.expedia.pages.CruisesPage;
import com.expedia.web.JavascriptUtils;
import com.expedia.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CruisesStepDef {

    CruisesPage cruisesPage = new CruisesPage();

    @Given("user is on expedia homepage {string}")
    public void user_is_on_expedia_homepage(String url) {
        WebDriverUtils.driver.get(url);

    }

    @Given("user clicks on {string}")
    public void user_clicks_on(String Cruises) {
        cruisesPage.cruisesText.click();

        // WebDriverUtils.driver.findElement(By.xpath("(//span[normalize-space()='Cruises'])[1]")).click();

    }

    @Given("user clicks on {string} and selects {string} as destination")
    public void user_clicks_on_and_selects_as_destination(String selectDestination, String Mexico ) {

        cruisesPage.clickOnSelectDestinationBox.click();
        cruisesPage.selectsMexico.click();

        // WebDriverUtils.driver.findElement(By.xpath("(//select[@id='cruise-destination'])[1]")).click();
        // WebDriverUtils.driver.findElement(By.xpath("(//option[@value='mexico'])[1]")).click();
    }

    @Given("user selects departure date as early as {string}")
    public void user_selects_departure_date_as_early_as(String November27) {

        cruisesPage.earliestDeparture.click();

        // WebDriverUtils.driver.findElement(By.xpath("(//button[normalize-space()='Nov
        // 14'])[1]")).click();

    }

    @Given("user selects departure date as late as {string}")
    public void user_selects_departure_date_as_late_as(String December27) throws InterruptedException {


        // WebDriverUtils.driver.findElement(By.xpath("()).click();
        JavascriptUtils.clickByJS(cruisesPage.latestDeparture);
        Thread.sleep(2000);
        JavascriptUtils.clickByJS(cruisesPage.clickOnDone);
        Thread.sleep(2000);
    }

    @Given("user clicks {string}")
    public void user_clicks(String Search) throws InterruptedException {

        cruisesPage.clickOnSearch.click();

        // WebDriverUtils.driver.findElement(By.xpath("(//*[normalize-space()='Search'])[1]")).click();
        Thread.sleep(4000);

    }

    @Then("cruises display")
    public void cruises_display() {

        cruisesPage.cruisesOptionsDisplay.isDisplayed();

         boolean cruisesDisplay = cruisesPage.cruisesOptionsDisplay.isDisplayed();
         Assert.assertTrue(cruisesDisplay);

    }

    @Given("user selects {string} as destination")
    public void user_selects_as_destination(String Bahamas) {

        cruisesPage.clicksOnSelectDestinationBox.click();
        cruisesPage.selectsBahamas.click();

        // WebDriverUtils.driver.findElement(By.xpath("(//select[@id='cruise-destination'])[1]")).click();
        // WebDriverUtils.driver.findElement(By.xpath("(//option[@value='bahamas'])[1]")).click();

    }

    @Then("user is shown error")
    public void user_is_shown_error() {

        boolean userIsShownError = cruisesPage.noMatchesDisplays.isDisplayed();
        Assert.assertTrue(userIsShownError);

    }

}