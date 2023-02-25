package com.expedia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.expedia.web.WebDriverUtils;

public class FlightsPage {
    @FindBy(xpath = "//span[normalize-space()='Flights']")
    public WebElement flights;
    @FindBy(xpath = "//span[normalize-space()='One-way']")
    public WebElement oneWayBtn;
    @FindBy(xpath = "//*[@aria-label='Leaving from']")
    public WebElement airportBox;
    @FindBy(xpath = "//*[@aria-label='Going to']")
    public WebElement goingToBox;
    @FindBy(xpath = "//*[@id='d1-btn']")
    public WebElement dateBox;
    @FindBy(xpath = "//*[@data-name='d1']")
    public WebElement dateBtn;
    @FindBy(xpath = "(//*[contains(text(),'Done')])[2]")
    public WebElement doneBtn;
    @FindBy(xpath = "//*[normalize-space()='1 traveler']")
    public WebElement travelerBtn;
    @FindBy(xpath = "//div[@role='tabpanel']//div//form")
    public WebElement travelerBox;
    @FindBy(xpath = "//*[normalize-space()='Search']")
    public WebElement searchBtn;
    @FindBy(xpath = "//img[@alt='expedia logo']")
    public WebElement expediaImgBtn;
    @FindBy(xpath = "//span[normalize-space()='Roundtrip']")
    public WebElement roundTrip;
    @FindBy(xpath = "//*[@data-name='d1']")
    public WebElement departingBox;
    @FindBy(xpath = "(//*[@data-day='28'])[1]")
    public WebElement departingDate;
    @FindBy(xpath = "(//*[@data-day='29'])[1]")
    public WebElement returnDate;
    @FindBy(xpath = "//*[@data-stid='apply-date-picker']")
    public WebElement doneSecond;
    @FindBy(xpath = "//img[@alt='expedia logo']")
    public WebElement resultThird;
    public FlightsPage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
